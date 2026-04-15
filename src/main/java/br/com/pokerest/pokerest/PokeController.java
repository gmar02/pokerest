package br.com.pokerest.pokerest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class PokeController {
    
    private final PokeService service;

    @GetMapping("/pokemons/{name}")
    public Pokemon getByName(@PathVariable("name") String name) { 
        return service.findByName(name);
    }

    @GetMapping("/pokemons/generation/{generation_number}")
    public List<Pokemon> getAllFromGeneration(@PathVariable("generation_number") Integer generationNumber) { 
        return service.getGeneration(generationNumber);
    }

    @GetMapping("/pokemons/glassCannons/")
    public List<Pokemon> getGlassCannons() { return new ArrayList<>(); }

    @GetMapping("/teams/random")
    public List<Pokemon> getRandomTeam() { 
        return service.generateRandomTeam(); 
    }

    @GetMapping("/types/statistics")
    public List<Statistics> getMultipleTypeStatistics() { return new ArrayList<>(); }

}
