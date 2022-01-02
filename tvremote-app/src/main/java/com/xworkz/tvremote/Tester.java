package com.xworkz.tvremote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.tvremote.dao.TvRemoteDAO;
import com.xworkz.tvremote.entity.TvRemoteEntity;
import com.xworkz.tvremote.service.TvRemoteService;
import com.xworkz.tvremote.service.TvRemoteServiceImpl;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "applicationContext.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);

		TvRemoteEntity tvRemoteEntity = new TvRemoteEntity();
		tvRemoteEntity.setName("");
		tvRemoteEntity.setColor("");
		tvRemoteEntity.setPrice(250.00);
		tvRemoteEntity.setNoOfCells(0);
		tvRemoteEntity.setPowerButtonWorking(true);

		TvRemoteService remoteService = springContainer.getBean(TvRemoteService.class);
		boolean result = remoteService.validateTvRemoteEntity(tvRemoteEntity);
		if (result) {
			System.out.println("Data is saved");
		} else {
			System.out.println("Data is not saved.....Please check the data");
		}

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) springContainer;
		classPathXmlApplicationContext.close();

	}
}
