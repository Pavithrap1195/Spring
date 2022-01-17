package com.xworkz.newspaperApp.dao;

import java.util.List;

import com.xworkz.newspaperApp.entity.NewsPaperEntity;

public interface NewsPaperDAO {

	boolean saveNewsPaperEntity(NewsPaperEntity newsPaperEntity);

	NewsPaperEntity getNewsPaperEntityByName(String newsPaperName);
	
	List<NewsPaperEntity> getAllNewsPaper();
	
	boolean deleteNewsPaper(String newsPaperName);
	
	
//	NewsPaperEntity getNewsPaperEntityByLanguage(String language);

}
