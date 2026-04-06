package br.com.pokerest.pokerest;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PokeService {
    
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

}
