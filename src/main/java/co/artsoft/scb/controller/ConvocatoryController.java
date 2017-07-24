package co.artsoft.scb.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/convocatoria")
public class ConvocatoryController {
	
	@PostMapping("/aplicar")
	public String uploadDocument(MultipartFile file, String documento){
		return "Documento "+ file.getOriginalFilename() + " del aplicante: " + documento + " subido con exito";
	}
}
