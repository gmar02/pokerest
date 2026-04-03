package br.com.pokerest.pokerest;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PokeService {
    
    private final PokemonRepository pokemonRepository;

    public Pokemon findFirst() {
        return pokemonRepository.findAll().get(0);
    }

}
