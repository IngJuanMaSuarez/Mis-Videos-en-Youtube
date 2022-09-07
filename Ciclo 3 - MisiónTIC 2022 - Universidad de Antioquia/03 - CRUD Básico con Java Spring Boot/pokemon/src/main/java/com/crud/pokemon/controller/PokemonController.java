package com.crud.pokemon.controller;

import com.crud.pokemon.model.Pokemon;
import com.crud.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    private List<Pokemon> verPokemon(){
        return pokemonService.verPokemon();
    }

    @PostMapping("/pokemon")
    private void crearPokemon(@RequestBody Pokemon pokemon){
        pokemonService.crearYActualizarPokemon(pokemon);
    }

    @DeleteMapping("/pokemon/{id}")
    private void eliminarPokemon(@PathVariable("id") Long id){
        pokemonService.eliminarPokemon(id);
    }

    @PutMapping("/pokemon")
    private void editarPokemon(@RequestBody Pokemon pokemon){
        pokemonService.crearYActualizarPokemon(pokemon);
    }

}
