package com.xworkz.newspaperApp.dao;

import com.xworkz.newspaperApp.entity.NewsPaperEntity;

public interface NewsPaperDAO {

	boolean saveNewsPaperEntity(NewsPaperEntity newsPaperEntity);

	boolean getNewsPaperEntityByName(String newsPaperName);

}
