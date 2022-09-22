package com.example.comptems22.web;

import com.example.comptems22.Repositories.CompteRepository;
import com.example.comptems22.entities.Compte;
import com.example.comptems22.Repositories.CompteRepository;
import com.example.comptems22.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Component
@Path("/banque")
public class CompteJaxRSAPI {
    @Autowired
    private CompteRepository compteRepository;
    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }


    @Path("/comptes/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Compte compte1(@PathParam(value = "id") Long id){
        return compteRepository.findById(id).get();
    };
    @Path("/comptes" )
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Compte save(Compte c){
        return compteRepository.save(c);
    };
    @Path("/comptes/{id}" )
    @PUT
    @Produces({MediaType.APPLICATION_JSON})
    public Compte update(Compte c,@PathParam(value = "id") Long id){
        c.setId(id);
        return compteRepository.save(c);
    };
    @Path("/comptes/{id}" )
    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    public void delete(Compte c,@PathParam(value = "id") Long id){
        c.setId(id);
         compteRepository.deleteById(id);
    };
}
