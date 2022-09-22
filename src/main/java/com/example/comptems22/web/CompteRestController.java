package com.example.comptems22.web;

import com.example.comptems22.Repositories.CompteRepository;
import com.example.comptems22.entities.Compte;
import com.example.comptems22.Repositories.CompteRepository;
import com.example.comptems22.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/banque")
public class CompteRestController {
    @Autowired
    private CompteRepository compteRepository;
    @GetMapping(value = "/comptes",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }

@GetMapping(path = "/comptes/{id}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public Compte compte(@PathVariable(value = "id") Long id){
        return compteRepository.findById(id).get();
    };
@PostMapping(path = "/comptes")
    public Compte save(@RequestBody Compte c){
        return compteRepository.save(c);
    };
   @PutMapping(path = "/comptes/{id}")
    public Compte update(@RequestBody Compte c,@PathVariable(value = "id") Long id){
        c.setId(id);
        return compteRepository.save(c);
    };
  @DeleteMapping(path = "/comptes")
    public void delete(Compte c,@PathVariable(value = "id") Long id){
        c.setId(id);
         compteRepository.deleteById(id);
    };
}
