package com.angelpuentesdevv.screenmatch_frases.service;

import com.angelpuentesdevv.screenmatch_frases.dto.FraseDTO;
import com.angelpuentesdevv.screenmatch_frases.model.Frase;
import com.angelpuentesdevv.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
