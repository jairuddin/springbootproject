package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;

import spring.service.UserService;
@Controller
public class StudentConteroller {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/model")
	public String modelFrom() {
		
		return "model";
	}
  
	@RequestMapping("/Student")
	public String showForm() {
		
		return"Student";
	}
	@RequestMapping(path="/proceccFrom", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") Userd user, Model model) {

//			Userd user=new Userd();
//			user.setStudentname(studentname);
//			user.setGmail(gmail);
//			user.setPassword(password);
//	model.addAttribute("user", user);
//	System.out.println(user);
//	model.addAttribute("name" , name);	model.addAttribute("gmail", gmail);
//	model.addAttribute("password", password);
		System.out.println(user);
		this.userService.createUser(user);
		 return "process";
	}
	
	
	
//	@RequestMapping(path="/proceccFrom", method=RequestMethod.POST)
//	public String handleForm(@RequestParam("studentname")String name, @RequestParam("gmail")String gmail, @RequestParam("password")String password , Model model) {
//	System.out.println("student name"+name);
//	System.out.println("student gmail"+gmail);
//	System.out.println("student password"+password);
//	//process the datad
//	
//	
//	
//	model.addAttribute("name" , name);
//	model.addAttribute("gmail", gmail);
//	model.addAttribute("password", password);
//		 return "process";
//	}
	/*
	 * @RequestMapping(path="modelDemo" , method=RequestMethod.POST) public String
	 * forjairu(@RequestParam("name")String name,
	 * 
	 * @RequestParam("number")int number, Model model) {
	 * System.out.println("name"+name); System.out.println("number"+number);
	 * 
	 * model.addAttribute("name1"+name); model.addAttribute("number1"+number);
	 * return"chacha"; }
	 */
}
