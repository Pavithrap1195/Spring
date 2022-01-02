package com.xworkz.tvremote.dao;

import com.xworkz.tvremote.entity.TvRemoteEntity;

public interface TvRemoteDAO {
	
	void addTvRemoteEntity(TvRemoteEntity tvRemoteEntity);
	
	void updatePriceById(double price,int remoteId); 
	
	void getNameById(int remoteId);
	
	void deleteById(int remoteId);

}
