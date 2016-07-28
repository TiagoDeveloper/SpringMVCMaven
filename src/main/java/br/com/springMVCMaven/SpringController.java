package br.com.springMVCMaven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {

	
	@RequestMapping("/")
	public String home(){
		
		return "templates/template";
	}
	
	
}
