package br.com.PokemonJorge.services;

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

    public Optional findTrainerById(long id)
    {
        return _repository.findTrainerById(id);
    }

    public List<TrainerModel> findTrainerByName(String name)
    {
        return _repository.findTrainerByName(name);
    }

    public List<TrainerModel> findTrainerByGender(char gender)
    {
        return _repository.findTrainerByGender(gender);
    }
}
