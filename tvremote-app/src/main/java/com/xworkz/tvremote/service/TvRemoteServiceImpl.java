package com.xworkz.tvremote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.tvremote.dao.TvRemoteDAO;
import com.xworkz.tvremote.entity.TvRemoteEntity;

@Component
public class TvRemoteServiceImpl implements TvRemoteService {

	@Autowired
	private TvRemoteDAO tvRemoteDAO;

	@Override
	public boolean validateTvRemoteEntity(TvRemoteEntity tvRemoteEntity) {
		System.out.println("Invoked validateTvRemoteEntity()");
		boolean flag = false;

		if (!tvRemoteEntity.getName().isEmpty() && tvRemoteEntity.getName() != null) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Name cannot be empty");
			return flag;
		}
		if (!tvRemoteEntity.getColor().isEmpty() && tvRemoteEntity.getName() != null) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Color cannot be empty");
			return flag;
		}
		if (tvRemoteEntity.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Price cannot be zero");
			return flag;
		}
		if (tvRemoteEntity.getNoOfCells() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("No of cells cannot be zero");
			return flag;
		}
		if (tvRemoteEntity.isPowerButtonWorking()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Power button not working");
			return flag;
		}

		if (flag) {
			System.out.println("All data has been validated");
			this.tvRemoteDAO.addTvRemoteEntity(tvRemoteEntity);
			return flag;
		} else {
			System.out.println("Invalid data.....try again");
			return flag;
		}
	}

}
