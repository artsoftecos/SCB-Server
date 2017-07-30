package co.artsoft.scb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.artsoft.scb.model.User;
import co.artsoft.scb.model.UserLogin;

@RestController
@RequestMapping("/login")
public class LoginController {
		
	@RequestMapping("/welcome")
	public String loginWelcome(){
		return "Bienvenido usuario";
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserLogin userLogin){
		
		if(userLogin.email == null || userLogin.password == null || userLogin.password.isEmpty() || userLogin.email.isEmpty()) {
			return ResponseEntity.badRequest().body("El correo y la contraseña no deben estar vacios.");
		}
		
		if(userLogin.email.contains("@notValid")) {
			return ResponseEntity.notFound().build();
		} 
		
		User user = new User();
		user.name = "pepito";		
		user.email = userLogin.email;
		user.role = "Solicitant";
		
		if(userLogin.email.equals("admin@icetex.gov.co")) {
			user.role = "Administrator";
		} else if(userLogin.email.equals("oferent@carolina.gov.co")) {
			user.role = "Oferent";
		}
		return ResponseEntity.ok(user);
	}	
}
