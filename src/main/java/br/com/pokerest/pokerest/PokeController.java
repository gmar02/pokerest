package br.com.pokerest.pokerest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class PokeController {
    
    private final PokeService service;

    public PokeController(PokeService service) {
        this.service = service;
    }

    @GetMapping("/pokemons/{name}")
    public Pokemon getByName() { return new Pokemon(); }

    @GetMapping("/pokemons")
    public List<Pokemon> getPokemons() { return new ArrayList<>(); }

    @GetMapping("/teams/random")
    public Team getRandomTeam() { return new Team(); }

    @GetMapping("/types/{type}/statistics")
    public Statistics getTypeStatistics() { return new Statistics(); }

    @GetMapping("/types/statistics")
    public Statistics getMultipleTypeStatistics() { return new Statistics(); }
}
