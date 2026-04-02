package br.com.pokerest.pokerest;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

import java.util.List;

public class Pokemon {

    @CsvBindByName(column = "pokedex_number")
    private int pokedexNumber;

    @CsvBindByName(column = "name")
    private String name;

    @CsvBindByName(column = "japanese_name")
    private String japaneseName;

    @CsvBindByName(column = "classfication")
    private String classification;

    @CsvBindByName(column = "generation")
    private int generation;

    @CsvBindByName(column = "hp")
    private int hp;

    @CsvBindByName(column = "attack")
    private int attack;

    @CsvBindByName(column = "defense")
    private int defense;

    @CsvBindByName(column = "sp_attack")
    private int spAttack;

    @CsvBindByName(column = "sp_defense")
    private int spDefense;

    @CsvBindByName(column = "speed")
    private int speed;

    @CsvBindByName(column = "type1")
    private String type1;

    @CsvBindByName(column = "type2")
    private String type2;

    @CsvCustomBindByName(column = "is_legendary", converter = LegendaryConverter.class)
    private boolean isLegendary;

    @CsvCustomBindByName(column = "abilities", converter = AbilitiesConverter.class)
    private List<String> abilities;

}
