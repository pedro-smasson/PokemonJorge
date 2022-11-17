package br.com.PokemonJorge.controllers;

import br.com.PokemonJorge.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon/v1")
public class PokemonController
{
    @Autowired
    private PokemonService _service;


}
