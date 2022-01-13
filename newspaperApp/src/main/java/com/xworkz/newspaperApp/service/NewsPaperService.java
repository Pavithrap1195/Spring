package com.xworkz.newspaperApp.service;

import java.util.HashMap;
import java.util.Map;

import com.xworkz.newspaperApp.NewsPaperDTO;

public interface NewsPaperService {

	Map<String, String> map = new HashMap<String, String>();

	boolean validateNewsPaperDTO(NewsPaperDTO newsPaperDTO);

	boolean saveNewsPaperDTO(NewsPaperDTO newsPaperDTO);

	boolean validateNewsPaperName(String newsPaperName);

	NewsPaperDTO getNewsPaperDTO(String newsPaperName);

//	boolean validateNewsPaperLanguage(String language);

//	NewsPaperDTO getNewsPaperDTOByLanguage(String language);

}
