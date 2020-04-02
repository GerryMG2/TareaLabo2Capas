package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login(usuario user) {
		return "login";
	}
	
	@PostMapping("/validacion")
	public String validacion(usuario user) {
		String res = "";
		
		
		System.out.println(user.getNombre().equals("karla"));
		if(user.getPassword().equals("1234") && user.getNombre().equals("karla")) {
			res = "mostrarMensajeV";
		}else {
			res = "mostrarMensajeF";
		}
		return res;
	}
}
