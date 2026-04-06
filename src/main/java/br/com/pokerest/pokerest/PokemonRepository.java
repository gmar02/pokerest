package br.com.pokerest.pokerest;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Repository
public class PokemonRepository {

    private List<Pokemon> pokemons;

    @PostConstruct
    public void loadData() {
        pokemons = new CsvToBeanBuilder<Pokemon>(
            new InputStreamReader(getClass().getResourceAsStream("/pokemon.csv")))
            .withType(Pokemon.class)
            .withIgnoreLeadingWhiteSpace(true)
            .build()
            .parse();
    }

    public List<Pokemon> findAll() {
        return pokemons;
    }

    public Optional<Pokemon> findByName(String name) {
        return pokemons.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public Optional<List<Pokemon>> pullRandomTeam(Integer teamSize) {
        
        if (teamSize <= 0)
            return Optional.empty();
        
        List<Pokemon> randomTeam = new Random().ints(teamSize, 0, pokemons.size())
            .mapToObj(pokemons::get)
            .toList();

        return Optional.of(randomTeam);
    }

    public Optional<List<Pokemon>> findAllByGeneration(int generation) {
        
        if (generation < 1 || generation > 7)
            return Optional.empty();
        
        List<Pokemon> allFromGeneration = pokemons.stream()
                .filter(p -> p.getGeneration() == generation)
                .toList();

        return Optional.of(allFromGeneration);
    }

}