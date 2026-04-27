package br.com.pokerest.pokerest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pokerest.pokerest.dtos.Pokemon;
import br.com.pokerest.pokerest.dtos.Statistics;
import br.com.pokerest.pokerest.services.PokeService;
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
    public List<Pokemon> getGlassCannons(@RequestParam(name = "atk_gt", required = false) Integer attackGreaterThan, 
                                         @RequestParam(name = "df_lt", required = false) Integer defenseLowerThan) {
        return service.getGlassCannons(attackGreaterThan, defenseLowerThan);
    }

    @GetMapping("/teams/random")
    public List<Pokemon> getRandomTeam() { 
        return service.generateRandomTeam(); 
    }

    @GetMapping("/types/statistics")
    public Statistics getMultipleTypeStatistics(
            @RequestParam(name="types", required = true) List<String> types) {
         return service.getStatistics(types); 
    }

}
