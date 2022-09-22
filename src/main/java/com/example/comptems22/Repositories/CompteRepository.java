package com.example.comptems22.Repositories;

import com.example.comptems22.entities.Compte;
import com.example.comptems22.entities.TypeCompte;
import com.example.comptems22.entities.Compte;
import com.example.comptems22.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
   // @RestResource(path = "/byType")
   public List<Compte>findByType(TypeCompte type);

}
