package com.example.comptems22.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@Entity
@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
    @ManyToOne
    private  Client client;
}
