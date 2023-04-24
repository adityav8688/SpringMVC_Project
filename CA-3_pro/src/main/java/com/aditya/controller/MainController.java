package com.aditya.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.aditya.dao.AliensDao;
import com.aditya.model.Alien;

@Controller
public class MainController {
	
	@Autowired
	private AliensDao aliensDao;

	@RequestMapping("/")
	public String home() {
		return ("index");
	}
	
	@RequestMapping("/reserv")
	public String reservation()
	{
		return "reserv";
	}
	
	@RequestMapping(value="/handle-alien", method=RequestMethod.POST)
	public RedirectView handleAlien(@ModelAttribute Alien alien, HttpServletRequest request)
	{
		System.out.println(alien);
		aliensDao.createAliens(alien);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/saved");
		return redirectView;
	}
	
//	@RequestMapping("/saved")
//	public String saved(Model m)
//	{		
//		List<Aliens> aliens = aliensDao.getAliens();
//		m.addAttribute("aliens", aliens);
//		return "saved";
//	}
	
	
}
