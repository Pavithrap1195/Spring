package com.xworkz.newspaperApp.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.newspaperApp.entity.NewsPaperEntity;

//Hibernate code to access database
@Repository
public class NewsPaperDAOImpl implements NewsPaperDAO {

	@Autowired
	private SessionFactory factory;

	@Override
	public boolean saveNewsPaperEntity(NewsPaperEntity newsPaperEntity) {
		System.out.println("Invoked saveNewsPaperEntity()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(newsPaperEntity);
			session.getTransaction().commit();
			System.out.println("NewsPaperEntity Saved Successfully");
			return true;
		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Transaction is rolled back");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}
		return false;
	}

	@Override
	public NewsPaperEntity getNewsPaperEntityByName(String newsPaperName) {
		System.out.println("Invoked getNewsPaperName()");
		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.getNamedQuery("NewsPaperEntity.getNewsPaperEntityByName");
			query.setParameter("Name", newsPaperName);
			NewsPaperEntity entity = (NewsPaperEntity) query.uniqueResult();
			System.out.println("NewsPaperDetails:- " + entity);
			if (entity != null) {
				return entity;
			} else {
				System.out.println("newsPaperName not fouund");
				return null;
			}
		} catch (HibernateException e) {

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

		return null;
	}

	@Override
	public List<NewsPaperEntity> getAllNewsPaper() {
		System.out.println("Invoked getAllNewsPaper()");
		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.getNamedQuery("getAllNewsPaper");
			List<NewsPaperEntity> list = query.list();
			if (!list.isEmpty() && list != null) {
				return list;
			} else {
				System.out.println("Table is empty,add some NewsPaper Details");
			}

		} catch (HibernateException e) {

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

		return null;
	}

	@Override
	public boolean deleteNewsPaper(String newsPaperName) {
		System.out.println("Invoked deleteNewsPaper() ");
		Session session = null;
		try {
			session = factory.openSession();
			Query query = session.getNamedQuery("deleteNewsPaper");
			query.setParameter("name", newsPaperName);
			NewsPaperEntity object = (NewsPaperEntity) query.uniqueResult();
			System.out.println("Found newspaper:-" + object);
			session.beginTransaction();
			session.delete(object);
			session.getTransaction().commit();
			return true;
		}
		catch (HibernateException e) {
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}
		return false;
	}

	/*
	 * @Override public NewsPaperEntity getNewsPaperEntityByLanguage(String
	 * language) { System.out.println("Invoked getNewsPaperEntityByLanguage()");
	 * Session session=null; try {
	 * 
	 * session = factory.openSession(); Query query =
	 * session.getNamedQuery("getNewsPaperEntityByLanguage");
	 * query.setParameter("LANGUAGE", language); NewsPaperEntity entity
	 * =(NewsPaperEntity) query.uniqueResult();
	 * System.out.println("NewsPaperDetails-: "+entity); if(entity!=null) { return
	 * entity; }else { System.out.println("Language not found"); return null; }
	 * }catch(HibernateException e) {
	 * 
	 * }finally { if(session!=null) { session.close();
	 * System.out.println("Session is closed"); }else {
	 * System.out.println("Session is not closed"); } }
	 * 
	 * return null; }
	 */
}
