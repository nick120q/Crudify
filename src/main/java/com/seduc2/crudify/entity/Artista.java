package com.seduc2.crudify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Artista {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String bio;
    private String ouvintes;

    public Artista(){}

    public Artista(int id, String nome, String bio, String ouvintes) {
        this.id = id;
        this.nome = nome;
        this.bio = bio;
        this.ouvintes = ouvintes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getOuvintes() {
        return ouvintes;
    }

    public void setOuvintes(String ouvintes) {
        this.ouvintes = ouvintes;
    }
}

