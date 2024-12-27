package com.angelpuentesdevv.screenmatch_frases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String frase;

    private String personaje;

    private String poster;

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getPoster() {
        return poster;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
