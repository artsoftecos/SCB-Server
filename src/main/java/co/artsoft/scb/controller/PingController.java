package co.artsoft.scb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PingController {

	@RequestMapping("/")
	public String welcome(){
		return "Artsoft rocks";
	}
}
