package mvcproject;

import mvcproject.model.User;

@Controller
public class ContractContraller {
	@RequestMapping("/contract")
	public String display() {
		
		return "contract";
	}
	@ModelAttribute
	public void com(Model m) {
		m.addAttribute("head","Register form");
		m.addAttribute("Des","Description");
	}
	@RequestMapping(path="/process")
	public String handle(@ModelAttribute User user,Model model) {
		
		return "show";
	}

}
/*@RequestMapping(path="/process")
public String handle(@RequestParam(name="email",required =false)String email,@RequestParam(defaultValue="pass",required=false)String pass,Model model) {
/*model.addAttribute("mail", email);
model.addAttribute("pa",pass);
User u=new User();
u.setEmail(email);
u.setPass(pass);
System.out.println(u.getEmail()+"   "+u.getPass());
model.addAttribute("user", u);
return "show";
}*/