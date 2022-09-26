package com.juanma.pokemon.service;

import com.juanma.pokemon.model.Entrenador;
import com.juanma.pokemon.repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntrenadorService {

    @Autowired
    EntrenadorRepository entrenadorRepository;

    public void crearYActualizarEntrenador(Entrenador entrenador){
        entrenadorRepository.save(entrenador);
    }

    public List<Entrenador> verEntrenador(){
        return entrenadorRepository.findAll();
    }

    public Entrenador verEntrenadorPorId(Long id) {
        return entrenadorRepository.findById(id).get();
    }

    public void eliminarEntrenador(Long id){
        entrenadorRepository.deleteById(id);
    }

}