package com.integracion.pokemon_base.service;

import com.integracion.pokemon_base.model.Pokemon;
import com.integracion.pokemon_base.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    public void crearYActualizarPokemon(Pokemon pokemon){
        pokemonRepository.save(pokemon);
    }

    public List<Pokemon> verPokemon(){
        return pokemonRepository.findAll();
    }

    public Pokemon verPokemonPorId(Long id) {
        return pokemonRepository.findById(id).get();
    }

    public void eliminarPokemon(Long id){
        pokemonRepository.deleteById(id);
    }

}
