package br.com.pokerest.pokerest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pokerest.pokerest.dtos.Pokemon;
import br.com.pokerest.pokerest.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PokeService {

    private final Integer ATTACK_THRESHOLD = 130; // attack minimal bound
    private final Integer DEFENSE_THRESHOLD = 80; // defense higher bound

    private final PokemonRepository pokemonRepository;

    public Pokemon findByName(String name) {
        return pokemonRepository.findByName(name)
            .orElseThrow(() -> new RuntimeException("Pokémon not found"));
    }

    public List<Pokemon> generateRandomTeam() {
        return pokemonRepository.pullRandomTeam(6)
            .orElseThrow(() -> new RuntimeException("Couldn't generate a team."));
    }

    public List<Pokemon> getGeneration(Integer generationNumber) {
        return pokemonRepository.findAllByGeneration(generationNumber)
            .orElseThrow(() -> new RuntimeException("Couldn't retrive pokemons from generation"));
    }

    public List<Pokemon> getGlassCannons(Integer attackGreaterThan, Integer defenseLowerThan) {
        int atk = (attackGreaterThan != null) ? attackGreaterThan : ATTACK_THRESHOLD;
        int def = (defenseLowerThan != null) ? defenseLowerThan : DEFENSE_THRESHOLD;     
        return pokemonRepository.findAllWithinBounds(atk, def)
                .orElseThrow(() -> new RuntimeException("Couldn't find glass cannons within bounds."));
    }


}
