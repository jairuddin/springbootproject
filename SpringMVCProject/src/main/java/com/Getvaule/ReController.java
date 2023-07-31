package com.Getvaule;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("this is one handler");
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl("userDetails");
		return redirectview;
	}
	
	
	@RequestMapping("/secound")
	public String secound() 
	{
		System.out.println("this secound method[]");
		return"redirect:/one";
	} 
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("this is one handler");
//		return "redirect:/secound";
//	}
//	
//	
//	@RequestMapping("/secound")
//	public String secound() 
//	{
//		System.out.println("this secound method[]");
//		return"redirect:/one";
//	} 
}
