package com.xworkz.tvremote.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.tvremote.entity.TvRemoteEntity;

@Component
public class TvRemoteDAOImpl implements TvRemoteDAO {

	@Autowired
	private SessionFactory factory;

	@Override
	public void addTvRemoteEntity(TvRemoteEntity tvRemoteEntity) {
		System.out.println("Invoked addTvRemoteEntity()");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(tvRemoteEntity);
			session.getTransaction().commit();
			System.out.println("TvRemoteEntity is saved");
		} catch (HibernateException e) {
			System.out.println("Inside catch block");
			session.getTransaction().rollback();
			System.out.println("Transaction failed rolling back");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

	}

	@Override
	public void updatePriceById(double price, int remoteId) {
		
	}

	@Override
	public void getNameById(int remoteId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int remoteId) {
		// TODO Auto-generated method stub
		
	}

}
