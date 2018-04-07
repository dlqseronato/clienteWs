package br.edu.positivo.scpe.clientWs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.positivo.scpe.dal.PhoneResource;
import br.edu.positivo.scpe.model.Phone;

@SpringBootApplication
public class ClientWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientWsApplication.class, args);	
	}
}
