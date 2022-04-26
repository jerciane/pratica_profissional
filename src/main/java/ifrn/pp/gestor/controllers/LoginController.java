package ifrn.pp.gestor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/")
	public String log() {
		System.out.println("Chamou o método log");
		return "pagLogin";
	}
	
}
