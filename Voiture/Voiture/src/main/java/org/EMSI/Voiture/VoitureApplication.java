package org.EMSI.Voiture;

import org.EMSI.Voiture.Service.ClientService;
import org.EMSI.Voiture.Model.Client;
import org.EMSI.Voiture.Model.Voiture;
import org.EMSI.Voiture.Repository.VoitureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableDiscoveryClient
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}
	@Bean
	public CommandLineRunner initializeDatabase(
			VoitureRepository voitureRepository,
			ClientService clientService) {

		return args -> {

			Client c1 = clientService.clientById(2L);
			Client c2 = clientService.clientById(1L);

			System.out.println("**************************");
			System.out.println("Id est :" + c2.getId());
			System.out.println("Nom est :" + c2.getNom());
			System.out.println("**************************");
			System.out.println("**************************");
			System.out.println("Id est :" + c1.getId());
			System.out.println("Nom est :" + c1.getNom());
			System.out.println("Nom est :" + c1.getAge());
			System.out.println("**************************");

			voitureRepository.save(new Voiture(Long.parseLong("1"), "Toyota", "Yaris","A 25 333", 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("2"), "Citroen", "C3","B 6 3456" , 1L, c2));
			voitureRepository.save(new Voiture(Long.parseLong("3"), "BMW", "M3","A 55 4444", 2L, c1));
		};
	}
}

