package org.EMSI.Client;

import org.EMSI.Client.Model.Client;
import org.EMSI.Client.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository){
		return args -> {
			clientRepository.save(new Client(Long.parseLong("1"),"Mohamed El Amri",Float.parseFloat("23")));
			clientRepository.save(new Client(Long.parseLong("2"),"Anas Touloun",Float.parseFloat("22")));
			clientRepository.save(new Client(Long.parseLong("3"),"Imad Ouareim",Float.parseFloat("22")));
		};
	}
}
