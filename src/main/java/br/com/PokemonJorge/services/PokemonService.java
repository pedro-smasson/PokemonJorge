package br.com.PokemonJorge.services;

import br.com.PokemonJorge.models.PokemonModel;
import br.com.PokemonJorge.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService
{
    @Autowired
    private PokemonRepository _repository;

    public Optional findPokemonById(long id)
    {
        return _repository.findPokemonById(id);
    }

    public List<PokemonModel> findPokemonByName(String name)
    {
        return _repository.findPokemonByName(name);
    }

    public List<PokemonModel> findPokemonByType(String type)
    {
        return _repository.findPokemonByType(type);
    }
}