package com.xworkz.newspaperApp.dao;

import com.xworkz.newspaperApp.entity.NewsPaperEntity;

public interface NewsPaperDAO {

	boolean saveNewsPaperEntity(NewsPaperEntity newsPaperEntity);

	NewsPaperEntity getNewsPaperEntityByName(String newsPaperName);
	
	NewsPaperEntity getNewsPaperEntityByLanguage(String language);

}
