package br.com.pokerest.pokerest;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import java.io.InputStreamReader;
import java.util.List;

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

    // public Optional<Pokemon> findByName(String name) {
    //     return pokemons.stream()
    //             .filter(p -> p.getName().equalsIgnoreCase(name))
    //             .findFirst();
    // }

    // public List<Pokemon> findByGeneration(int generation) {
    //     return pokemons.stream()
    //             .filter(p -> p.getGeneration() == generation)
    //             .toList();
    // }
}