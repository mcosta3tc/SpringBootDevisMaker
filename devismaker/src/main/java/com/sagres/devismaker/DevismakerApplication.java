package com.sagres.devismaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DevismakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevismakerApplication.class, args);
	}

}
