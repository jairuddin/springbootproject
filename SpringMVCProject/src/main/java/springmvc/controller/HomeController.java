package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bantai")
public class HomeController {
	@RequestMapping(path="/home", method = RequestMethod.GET	 )
	public String home(Model modal) {

		System.out.println("this is home url");

		modal.addAttribute("name", "shaikh jairuddin mairuddin");
		modal.addAttribute("id", 123456);
		List<String> list = new ArrayList<String>();
		list.add("sohel khan");
		list.add("anish shaikh");
		list.add("shaikh jairuddin");
		modal.addAttribute("friend", list);

		return "indexJainu";
	}

	@RequestMapping("/end")
	public String end(Model modal) {
		System.out.println("this is the end");
		modal.addAttribute("name1", "sohail khan");
		modal.addAttribute("id", 12314);
		List<Long> list2 = new ArrayList<Long>();
		list2.add(9136225451l);
		list2.add(8655112773l);
		list2.add(8689881791l);
		modal.addAttribute("mobileno", list2);
		return "ended";
	}

	@RequestMapping("/help")
	public ModelAndView help() {

		System.out.println("hello jairuddin");
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("name", "jairddin shaikh");
		modelandview.addObject("mobileno", 9136225451l);
		List<String> list = new ArrayList<String>();
		list.add("jairuddin");
		list.add("sajid");
		list.add("sajid ali");
		modelandview.addObject("list", list);
		modelandview.setViewName("/help");
		return modelandview;
	}

	@RequestMapping("/shaikh")
	public String shaikh(Model model) {

		System.out.println("jairuudin is running");
		model.addAttribute("city", "mumbai");
		model.addAttribute("number", 9136225451l);
		List<String> list = new ArrayList<String>();
		list.add("jairuddin");
		list.add("adhersh");
		model.addAttribute("fri", list);

		return "jairuddin";
	}

	@RequestMapping(path="/byby", method=RequestMethod.POST)
	public ModelAndView byby() {
		System.out.println("done");
		ModelAndView model = new ModelAndView();
		model.addObject("new", 1145454);
//		List<String> list=new ArrayList<String>();
//		list.add("smail");
//		list.add("jairuddin");
//		model.addObject("done",list);
		return model;
	}

	@RequestMapping("/pro")
	public ModelAndView pro() {
		System.out.println("hello jairddin");
		ModelAndView model = new ModelAndView();
		model.addObject("name", "jairuddin");
		model.addObject("number", 12314);
		List<String> list = new ArrayList<String>();
		list.add("gita");
		list.add("sita");
		list.add("rita");
		model.addObject("friend",list);
		return model;
	}

}
