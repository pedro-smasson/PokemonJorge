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

    public Optional<PokemonModel> findPokemonById(long id) { return _repository.findPokemonById(id); }

    public List<PokemonModel> findPokemonByName(String name)
    {
        return _repository.findPokemonByName(name);
    }

    public List<PokemonModel> findPokemonByType(String type)
    {
        return _repository.findPokemonByType(type);
    }

    public List<PokemonModel> findAll(){
        return _repository.findAll();
    }

    public PokemonModel save(PokemonModel model){
        return _repository.save(model);
    }

    public PokemonModel update(PokemonModel model){
        var found = _repository.findById(model.getId());
        if(found.isPresent()){
            found.get().setName(model.getName());
            found.get().setType(model.getType());
            return _repository.save(found.get());
        } else {
            return null;
        }
    }

    public void delete(long id){
        var found = _repository.findById(id);
        if(found.isPresent()){
            _repository.delete(found.get());
        }
    }
}