package co.artsoft.scb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administracion")
public class UserAdministrationController {
	
	@RequestMapping("/actualizacion")
	public String updateUser(){
		return "Usuario actualizado con éxito";
	}
}
