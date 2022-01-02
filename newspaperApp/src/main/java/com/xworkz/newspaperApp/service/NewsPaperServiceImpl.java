package com.xworkz.newspaperApp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.newspaperApp.NewsPaperDTO;
import com.xworkz.newspaperApp.dao.NewsPaperDAO;
import com.xworkz.newspaperApp.entity.NewsPaperEntity;

@Component
public class NewsPaperServiceImpl implements NewsPaperService {

	@Autowired
	private NewsPaperDAO newsPaperDAO;

	public NewsPaperServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	@Override
	public boolean validateNewsPaperDTO(NewsPaperDTO newsPaperDTO) {
		System.out.println("Invoked validateNewsPaperDTO()");
		boolean flag = false;
		if (newsPaperDTO.getNewsPaperName() != null && !newsPaperDTO.getNewsPaperName().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid NewsPaperName");
			return flag;
		}
		if (newsPaperDTO.getLanguage() != null && !newsPaperDTO.getLanguage().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid language");
			return flag;
		}
		if (newsPaperDTO.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid price");
			return flag;
		}
		if (newsPaperDTO.getNoOfPages() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Invalid noofpages");
			return flag;
		}
		return flag;
	}

	@Override
	public boolean saveNewsPaperDTO(NewsPaperDTO newsPaperDTO) {
		NewsPaperEntity newsPaperEntity = new NewsPaperEntity();
		BeanUtils.copyProperties(newsPaperDTO, newsPaperEntity);
		boolean result = this.newsPaperDAO.saveNewsPaperEntity(newsPaperEntity);
		
		return result;
		
		/*
		 * newsPaperEntity.setNewsPaperName(newsPaperDTO.getNewsPaperName());
		 * newsPaperEntity.setPrice(newsPaperDTO.getPrice());
		 * newsPaperEntity.setLanguage(newsPaperDTO.getLanguage());
		 * newsPaperEntity.setNoOfPages(newsPaperDTO.getNoOfPages());
		 */
	}
	
	@Override
	public boolean getNewsPaperName(String newsPaperName) {
		NewsPaperEntity paperEntity = new NewsPaperEntity();
		BeanUtils.copyProperties(newsPaperName, paperEntity);
		boolean result1 = this.newsPaperDAO.getNewsPaperEntityByName(newsPaperName);
		
		return result1;
		
		
	}
}
