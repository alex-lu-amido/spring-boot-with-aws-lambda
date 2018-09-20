package com.amido.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({LoginController.class})
public class IdAmApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IdAmApplication.class, args);
	}
}
