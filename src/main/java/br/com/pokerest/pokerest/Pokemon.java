package br.com.pokerest.pokerest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

import lombok.Getter;

import java.util.List;

@JsonPropertyOrder({
    "id",
    "name",
    "jp_name",
    "class",
    "gen_num",
    "hp",
    "attack",
    "defense",
    "sp_attack",
    "sp_defense",
    "speed",
    "type_1",
    "type_2",
    "is_legendary",
    "abilities"
})
@Getter
public class Pokemon {

    @JsonProperty("id")
    @CsvBindByName(column = "pokedex_number")
    private int pokedexNumber;

    @JsonProperty("name")
    @CsvBindByName(column = "name")
    private String name;

    @JsonProperty("jp_name")
    @CsvBindByName(column = "japanese_name")
    private String japaneseName;

    @JsonProperty("class")
    @CsvBindByName(column = "classfication")
    private String classification;

    @JsonProperty("gen_num")
    @CsvBindByName(column = "generation")
    private int generation;

    @JsonProperty("hp")
    @CsvBindByName(column = "hp")
    private int hp;

    @JsonProperty("attack")
    @CsvBindByName(column = "attack")
    private int attack;

    @JsonProperty("defense")
    @CsvBindByName(column = "defense")
    private int defense;

    @JsonProperty("sp_attack")
    @CsvBindByName(column = "sp_attack")
    private int spAttack;

    @JsonProperty("sp_defense")
    @CsvBindByName(column = "sp_defense")
    private int spDefense;

    @JsonProperty("speed")
    @CsvBindByName(column = "speed")
    private int speed;

    @JsonProperty("type_1")
    @CsvBindByName(column = "type1")
    private String type1;

    @JsonProperty("type_2")
    @CsvBindByName(column = "type2")
    private String type2;

    @JsonProperty("is_legendary")
    @CsvCustomBindByName(column = "is_legendary", converter = LegendaryConverter.class)
    private boolean legendary;

    @JsonProperty("abilities")
    @CsvCustomBindByName(column = "abilities", converter = AbilitiesConverter.class)
    private List<String> abilities;

}
