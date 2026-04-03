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

    @GetMapping("/pokemons")
    public List<Pokemon> getPokemons() { return new ArrayList<>(); }

    @GetMapping("/teams/random")
    public Team getRandomTeam() { return new Team(); }

    @GetMapping("/types/{type}/statistics")
    public Statistics getTypeStatistics() { return new Statistics(); }

    @GetMapping("/types/statistics")
    public Statistics getMultipleTypeStatistics() { return new Statistics(); }

    @GetMapping("/glassCannons/")
    public List<Pokemon> getGlassCannons() { return new ArrayList<>(); }

    @GetMapping("/allFromGeneration/{generation_number}")
    public List<Pokemon> getAllFromGeneration() { return new ArrayList<>(); }
}
