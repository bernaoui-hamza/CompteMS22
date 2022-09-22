package com.example.comptems22.entities;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "solde",types=Compte.class)
public interface CompteProjection {
    public double getSolde();
}

