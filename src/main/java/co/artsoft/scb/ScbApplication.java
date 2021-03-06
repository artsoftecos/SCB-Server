package co.artsoft.scb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ScbApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ScbApplication.class, args);
	}
}
