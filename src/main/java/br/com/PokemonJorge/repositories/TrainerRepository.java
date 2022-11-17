package br.com.PokemonJorge.repositories;

import br.com.PokemonJorge.models.TrainerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TrainerRepository extends JpaRepository<TrainerModel, Long>
{
    Optional<TrainerModel> findTrainerById(long id);
    List<TrainerModel> findTrainerByName(String name);
    List<TrainerModel> findTrainerByGender(char gender);
}
