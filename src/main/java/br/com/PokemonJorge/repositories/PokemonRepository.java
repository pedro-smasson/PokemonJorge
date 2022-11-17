package br.com.PokemonJorge.repositories;

import br.com.PokemonJorge.models.PokemonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends JpaRepository<PokemonModel, Long>
{
    Optional<PokemonModel> findPokemonById(long id);
    List<PokemonModel> findPokemonByName(String name);
    List<PokemonModel> findPokemonByType(String type);
}