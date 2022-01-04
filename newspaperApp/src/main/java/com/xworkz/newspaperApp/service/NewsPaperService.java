package com.xworkz.newspaperApp.service;

import com.xworkz.newspaperApp.NewsPaperDTO;

public interface NewsPaperService {
	
	boolean validateNewsPaperDTO(NewsPaperDTO newsPaperDTO);

	boolean saveNewsPaperDTO(NewsPaperDTO newsPaperDTO);
	
	boolean validateNewsPaperName(String newsPaperName);
	
	NewsPaperDTO getNewsPaperDTO(String newsPaperName);
	
	boolean validateNewsPaperLanguage(String language);
	
	NewsPaperDTO getNewsPaperDTOByLanguage(String language);
	
}
