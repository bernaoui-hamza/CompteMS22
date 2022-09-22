package com.example.comptems22.web;

import com.example.comptems22.Repositories.CompteRepository;
import com.example.comptems22.entities.Compte;
import com.example.comptems22.Repositories.CompteRepository;
import com.example.comptems22.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName="BanqueWS")
public class CompteSoapService {
    @Autowired
    private CompteRepository compteRepository;

    @WebMethod
    public List<Compte> compteList() {
        return compteRepository.findAll();
    }

    @WebMethod
    public Compte compte1(@WebParam(name = "id") Long id) {
        return compteRepository.findById(id).get();
    }

    ;

}
