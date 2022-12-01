package br.com.PokemonJorge.controllers;

import br.com.PokemonJorge.models.PokemonModel;
import br.com.PokemonJorge.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon/v1")
public class PokemonController {
    @Autowired
    private PokemonService _service;

    @GetMapping("/{id}")
    public PokemonModel findPokemonById(@PathVariable("id") long id) {
        var pokemon = _service.findPokemonById(id);
        if (pokemon.isPresent()) {
            return pokemon.get();
        }
        return null;
    }

    @GetMapping
    public List<PokemonModel> findAll() {
        return _service.findAll();
    }

    @PostMapping
    public PokemonModel save(@RequestBody PokemonModel model) {
        return _service.save(model);
    }

    @PutMapping
    public PokemonModel update(@RequestBody PokemonModel model) {
        return _service.update(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        Optional<PokemonModel> found = _service.findPokemonById(id);
        if (found.isPresent()) {
            _service.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return null;
        }
    }
}