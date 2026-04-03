package br.com.pokerest.pokerest;

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

}
