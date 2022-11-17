package br.com.PokemonJorge.controllers;

import br.com.PokemonJorge.models.PokemonModel;
import br.com.PokemonJorge.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon/v1")
public class PokemonController
{
    @Autowired
    private PokemonService _service;

    @GetMapping("/{id}")
    public PokemonModel findPokemonById(@PathVariable("id") long id)
    {
        var pokemon = _service.findPokemonById(id);

        if(pokemon.isPresent())
        {
            pokemon.get();
        }
        return null;
    }
}