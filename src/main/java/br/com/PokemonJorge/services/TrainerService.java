package br.com.PokemonJorge.services;

import br.com.PokemonJorge.models.PokemonModel;
import br.com.PokemonJorge.models.TrainerModel;
import br.com.PokemonJorge.repositories.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerService
{
    @Autowired
    private TrainerRepository _repository;

    public Optional<TrainerModel> findTrainerById(long id)
    {
        return _repository.findTrainerById(id);
    }

    public List<TrainerModel> findAll(){
        return _repository.findAll();
    }

    public TrainerModel save(TrainerModel model)
    {
        return _repository.save(model);
    }

    public void delete(long id)
    {
        var idFound = _repository.findTrainerById(id);

        if(idFound.isPresent())
            _repository.delete(idFound.get());
    }

    public TrainerModel update(TrainerModel model)
    {
        var idFound = _repository.findTrainerById(model.getId());

        if(idFound.isPresent())
        {
            idFound.get().setName(model.getName());
            idFound.get().setGender(model.getGender());
            return _repository.save(idFound.get());
        }
        return null;
    }
}