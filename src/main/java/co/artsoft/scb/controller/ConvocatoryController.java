package co.artsoft.scb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convocatoria")
public class ConvocatoryController {
	
	@RequestMapping("/subirDocumento")
	public String uploadDocument(){
		return "Documento subido con éxito";
	}

}
