package co.artsoft.scb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registro")
public class RegistrationController {
	
	@RequestMapping("/registroOferente")
	public String offererRegistration(){
		return "Oferente registrado con éxito";
	}
	
	@RequestMapping("/registroSolicitante")
	public String applicantRegistration(){
		return "Solicitante registrado con éxito";
	}
	
}
