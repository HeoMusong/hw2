package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OffersService;

@Controller
public class OffersController {

	private OffersService offersService;
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		this.offersService = offersService;
	}

	@RequestMapping("/offers")
	public String showOffers(Model model){
		
		List<Offer> offers = offersService.getCurrent2(2011, 1);
		
		model.addAttribute("offers", offers);
		
		return "offers";
	}
	
	@RequestMapping("/offers2")
	public String showOffers2(Model model){
		
		List<Offer> offers = offersService.getCurrent2(2014, 2);
		
		model.addAttribute("offers", offers);
		
		return "offers2";
	}
	
	@RequestMapping("/offers3")
	public String showOffers3(Model model){
		
		List<Offer> offers = offersService.getCurrent2(2015, 1);
		
		model.addAttribute("offers", offers);
		
		return "offers3";
	}
	
	@RequestMapping("/offers4")
	public String showOffers4(Model model){
		
		List<Offer> offers = offersService.getCurrent2(2015, 2);
		
		model.addAttribute("offers", offers);
		
		return "offers4";
	}
	
	@RequestMapping("/offers5")
	public String showOffers5(Model model){
		
		List<Offer> offers = offersService.getCurrent2(2016, 1);
		
		model.addAttribute("offers", offers);
		
		return "offers5";
	}
	
	@RequestMapping("/offers6")
	public String showOffers6(Model model){
		
		List<Offer> offers = offersService.getCurrent2(2016, 2);
		
		model.addAttribute("offers", offers);
		
		return "offers6";
	}
	
	@RequestMapping("/offers7")
	public String showOffers7(Model model){
		
		List<Offer> offers = offersService.getCurrent2(2017, 1);
		
		model.addAttribute("offers", offers);
		
		return "offers7";
	}	
	
	
	@RequestMapping("/createoffer")
	public String createOffer(Model model){
		
		model.addAttribute(new Offer());
		return "createoffer";
	}
	
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Offer offer, BindingResult result){
		
		if(result.hasErrors()) {
			System.out.println("Form data does not validate");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createoffer";
		}
		
		offersService.insert(offer);
		
		return "offercreated";
	}
}
