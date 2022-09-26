package com.juanma.pokemon.service;

import com.juanma.pokemon.model.Entrenador;
import com.juanma.pokemon.model.Pokemon;
import com.juanma.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
