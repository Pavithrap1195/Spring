package com.xworkz.newspaperApp.service;

import com.xworkz.newspaperApp.NewsPaperDTO;

public interface NewsPaperService {
	
	boolean validateNewsPaperDTO(NewsPaperDTO newsPaperDTO);

	boolean saveNewsPaperDTO(NewsPaperDTO newsPaperDTO);
	
	boolean getNewsPaperName(String newsPaperName);
	
}
