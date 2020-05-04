package bru.ago.pokemonApi.controller;

import bru.ago.pokemonApi.model.PokemonEntity;
import bru.ago.pokemonApi.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PokemonController {
    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping
    public ResponseEntity<List<PokemonEntity>> findAll() {
        return new ResponseEntity<List<PokemonEntity>>(
                (List<PokemonEntity>) this.pokemonRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<PokemonEntity> findById(@PathVariable("id") long id) {
        if(this.pokemonRepository.findById(id).isPresent()) {
            return new ResponseEntity<PokemonEntity>(
                    this.pokemonRepository.findById(id).get(),
                    new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<PokemonEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<PokemonEntity> store(@RequestBody PokemonEntity clientEntity) {
        return new ResponseEntity<PokemonEntity>(
                this.pokemonRepository.save(clientEntity), new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<PokemonEntity> update(@PathVariable("id") long id,
                                                @RequestBody PokemonEntity pokemonEntity) throws Exception {
        if(id == 0 || !this.pokemonRepository.existsById(id)) {
            throw new Exception("Código não encontrado ou inexistente!");
        }

        return new ResponseEntity<PokemonEntity>(
                this.pokemonRepository.save(pokemonEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PokemonEntity> delete(@PathVariable("id") long id) {
        this.pokemonRepository.deleteById(id);
        return new ResponseEntity<PokemonEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}
