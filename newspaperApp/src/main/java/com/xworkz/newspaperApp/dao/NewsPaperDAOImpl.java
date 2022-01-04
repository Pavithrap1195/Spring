package com.xworkz.newspaperApp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.newspaperApp.entity.NewsPaperEntity;

@Component
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
	public NewsPaperEntity getNewsPaperEntityByLanguage(String language) {
		System.out.println("Invoked getNewsPaperEntityByLanguage()");
		Session session=null;
		try {
			
			session = factory.openSession();
			Query query = session.getNamedQuery("getNewsPaperEntityByLanguage");
			query.setParameter("LANGUAGE", language);
			NewsPaperEntity entity =(NewsPaperEntity) query.uniqueResult();
			System.out.println("NewsPaperDetails-: "+entity);
			if(entity!=null) {
				return entity;
			}else {
				System.out.println("Language not found");
				return null;
			}
		}catch(HibernateException e) {
			
		}finally {
			if(session!=null) {
				session.close();
				System.out.println("Session is closed");
			}else {
				System.out.println("Session is not closed");
			}
		}
		
		return null;
	}
}
