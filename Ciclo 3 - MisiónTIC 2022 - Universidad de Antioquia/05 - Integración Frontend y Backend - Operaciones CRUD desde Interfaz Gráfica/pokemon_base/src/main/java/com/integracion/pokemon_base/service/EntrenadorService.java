package com.integracion.pokemon_base.service;

import com.integracion.pokemon_base.model.Entrenador;
import com.integracion.pokemon_base.repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
