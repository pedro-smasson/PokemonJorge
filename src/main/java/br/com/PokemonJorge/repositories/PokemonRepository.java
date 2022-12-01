package br.com.PokemonJorge.repositories;

import br.com.PokemonJorge.models.PokemonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonModel, Long>
{
    Optional<PokemonModel> findPokemonById(long id);
    List<PokemonModel> findPokemonByName(String name);
    List<PokemonModel> findPokemonByType(String type);

}