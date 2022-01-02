package com.xworkz.newspaperApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.newspaperApp.NewsPaperDTO;
import com.xworkz.newspaperApp.service.NewsPaperService;

@Component
@RequestMapping("/")
public class NewsPaperController {

	@Autowired
	private NewsPaperService newsPaperService;

	public NewsPaperController() {
		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	@RequestMapping("/submitnewspaper.do")
	public String onSubmitClicked(@ModelAttribute NewsPaperDTO newsPaperDTO, Model model) {
		System.out.println("Invoked onSubmitClicked()");

		if (this.newsPaperService.validateNewsPaperDTO(newsPaperDTO)) {
			boolean isSaved = this.newsPaperService.saveNewsPaperDTO(newsPaperDTO);
			if (isSaved) {
				model.addAttribute("validateMessage", "NewsPaper details have been saved successfully...Thank You");
			} else {
				model.addAttribute("validateMessage", "Could not save the data, Try Again..");
			}
		} else {
			model.addAttribute("validateMessage", "Invalid Data try again");
		}
		return "/welcome.jsp";
	}

	@RequestMapping("/searchNewsPaper.do")
	public String searchNewsPaper(@RequestParam(value="newsPaperName",required=false) String newsPaperName) {
		System.out.println("Invoked searchNewsPaper()");
		
		if(this.newsPaperService.getNewsPaperName(newsPaperName)) {
			System.out.println("Here is your NewsPaper Details");
	}else {
		System.out.println("Not present in data table");
	}
		return "/welcome.jsp";
}
}
