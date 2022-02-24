package mvcproject;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String home(Model model) {
     System.out.println("This is home Url");
     model.addAttribute("name","Amit");
     model.addAttribute("id",1234);
     List<String> l=new ArrayList<String>();
     l.add("123");
     l.add("Govind");
     l.add("Kunal");
     model.addAttribute("f", l);

		return "index";
	}
	@RequestMapping("/display")
	public String display() {
		return "display";
	}
	@RequestMapping("/service")
	public String service() {
		
		return "service";
	}
	@RequestMapping("/help")
	public String help(Model m) {
		m.addAttribute("Name","Ankur");
		List<String> li=new ArrayList();
		li.add("Yamin");
		li.add("Anurag");
		li.add("Kapil");
		li.add("Mosin");
		li.add("Salim");
	    m.addAttribute("f",li);
		return "help";
	}
	
	

}
