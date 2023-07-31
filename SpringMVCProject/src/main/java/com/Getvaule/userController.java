package com.Getvaule;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class userController {

	
	@RequestMapping("/userDetails")
	public String uerFor() {
		return "userDetails";
	}



//@RequestMapping(path="/proceccDetails" , method=RequestMethod.POST)
//public String forUse(@RequestParam("name") String username, @RequestParam("gmail") String gmail, @RequestParam("password") String password, Model model) {
//
//	model.addAttribute("name",username);
//	model.addAttribute("gmail",gmail);
//	model.addAttribute("password",password);
//	
//	
//	
//	//	String name=request.getParameter("name");
////	request.getParameter("gmail");
////			request.getParameter("password");
////			System.out.println(name);
//	return"givingthevalue";
//}
@RequestMapping(path="/proceccDetails" , method=RequestMethod.POST)
public String forUse(@ModelAttribute UserDetails user, Model model) {
		



	
	
	//	String name=request.getParameter("name");
//	request.getParameter("gmail");
//			request.getParameter("password");
//			System.out.println(name);
	return"givingthevalue";
}
	
}
