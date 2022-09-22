package com.example.comptems22;

import com.example.comptems22.Repositories.ClientRepository;
import com.example.comptems22.Repositories.CompteRepository;
import com.example.comptems22.entities.Client;
import com.example.comptems22.entities.Compte;
import com.example.comptems22.entities.TypeCompte;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteMs22Application {

    public static void main(String[] args) {
        SpringApplication.run(CompteMs22Application.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository,
                            RepositoryRestConfiguration repositoryRestConfiguration,
                            ClientRepository clientRepository) {
        return args -> {
            repositoryRestConfiguration.exposeIdsFor(Compte.class);
            Client C1= clientRepository.save(new Client(null,"hamza",null));
            Client C2= clientRepository.save(new Client(null,"mohammed",null));
            compteRepository.save(new Compte(null,Math.random()*900,new Date(), TypeCompte.EPARGNE,C1));
            compteRepository.save(new Compte(null,Math.random()*900,new Date(), TypeCompte.Courant,C1));
            compteRepository.save(new Compte(null,Math.random()*900,new Date(), TypeCompte.EPARGNE,C2));
            compteRepository.findAll().forEach(c->{
                System.out.println(c.getSolde());
            });
        };
    }
}
