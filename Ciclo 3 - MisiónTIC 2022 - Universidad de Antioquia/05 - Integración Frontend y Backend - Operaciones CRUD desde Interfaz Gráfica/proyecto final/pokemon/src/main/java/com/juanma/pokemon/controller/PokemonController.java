package com.juanma.pokemon.controller;

import com.juanma.pokemon.model.Pokemon;
import com.juanma.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping("/pokemon")
    private String verPokemon(Model model){
        model.addAttribute("pokemons", pokemonService.verPokemon());
        return "pokemon";
    }

    @GetMapping("/agregar-pokemon")
    private String verFormularioDeRegistroPokemon(Pokemon pokemon){
        return "agregar-pokemon";
    }

    @PostMapping("/pokemon")
    private String crearPokemon(Pokemon pokemon){
        pokemonService.crearYActualizarPokemon(pokemon);
        return "redirect:/pokemon";
    }

    @GetMapping("pokemon/borrar/{id}")
    private String eliminarPokemon(@PathVariable("id") Long id){
        pokemonService.eliminarPokemon(id);
        return "redirect:/pokemon";
    }

    @GetMapping("/pokemon/editar/{id}")
    private String verPokemonPorId(@PathVariable("id") Long id, Model model){
        Pokemon pokemon = pokemonService.verPokemonPorId(id);
        model.addAttribute("pokemon", pokemon);
        return "actualizar-pokemon";
    }

    @PostMapping("/pokemon/actualizar/{id}")
    private String editarPokemon(@PathVariable("id") Long id, Pokemon pokemon){
        pokemonService.crearYActualizarPokemon(pokemon);
        return "redirect:/pokemon";
    }

}