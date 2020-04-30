package bru.ago.pokemonApi.repository;

import bru.ago.pokemonApi.model.PokemonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<PokemonEntity, Long> {
}
