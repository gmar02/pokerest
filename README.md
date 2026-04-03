# Pokerest

## Sobre

API REST para análise avançada de estatísticas de Pokémon, voltada para jogadores competitivos, analistas e desenvolvedores que desejam explorar dados estratégicos, compor times específicos, etc.

<div style="padding:10px; border-left:4px solid yellow; background: black;">
  <strong>Nota:</strong> Projeto em desenvolvimento.
</div>

## Dados Suportados

```JS
{
    "id",                 // Numeração na Pokedex
    "name",               // Nome do Pokémon
    "jp_name",            // Nome do Pokémon em Japonês
    "class",              // Classificação do Pokémon
    "gen_num",            // Número da Geração
    "hp",                 // Quantidade de Hit Points
    "attack",             // Quantidade de Ataque
    "defense",            // Quantidade de Defesa
    "sp_attack",          // Quantidade de Ataque Especial
    "sp_defense",         // Quantidade de Defesa Especial
    "speed",              // Quantidade de Velocidade
    "type_1",             // Tipo principal
    "type_2",             // Tipo secundário - caso exista
    "is_legendary",       // Lendário?
    "abilities"           // Lista de habilidades possíveis
}
```

Exemplo de retorno:

```JSON
{
  "id": 1,
  "name": "Bulbasaur",
  "jp_name": "Fushigidane",
  "class": "Seed Pokémon",
  "gen_num": 1,
  "hp": 45,
  "attack": 49,
  "defense": 49,
  "sp_attack": 65,
  "sp_defense": 65,
  "speed": 45,
  "type_1": "grass",
  "type_2": "poison",
  "is_legendary": false,
  "abilities": [
    "Overgrow",
    "Chlorophyll"
  ]
}
```

## Endpoints

### Buscar Pokémon por Nome

> Retorna um Pokémon pelo nome.

`GET /api/pokemons/{name}`

### Listar Pokémons

> Retorna uma lista de Pokémons.

`GET /api/pokemons/`

### Time Aleatório

> Retorna um time de Pokémons aleatórios.

`GET /api/teams/random`

### Estatísticas por Tipo

> Retorna estatísticas de um tipo específico.

`GET /api/types/{type}/statistics`

### Estatísticas de Múltiplos Tipos

> Retorna estatísticas agregadas de tipos.

`GET /api/types/statistics`

### Por Geração

> Retorna Pokémons de uma geração.

`GET /allFromGeneration/{generation_number}`

### Glass Cannons

> Retorna Pokémons com alto ataque e baixa defesa.

`GET /glassCannons/`

Query params:
```
attack_gt → ataque maior que 
defense_lt → defesa menor que
```

## Dependências

> Para informações mais detalhadas, veja `mvn dependency:tree`

- Spring Boot `org.springframework.boot:spring-boot-starter-webmvc:4.0.5`
- Spring Web `org.springframework:spring-web:7.0.6`, `org.springframework:spring-webmvc:7.0.6`
- Validator `org.hibernate.validator:hibernate-validator:9.0.1.Final` com `jakarta.validation:jakarta.validation-api:3.1.1`
- OpenCSV `com.opencsv:opencsv:jar:5.9:compile`
- Lombok `org.projectlombok:lombok:jar:1.18.32:provided`

## Deploy
