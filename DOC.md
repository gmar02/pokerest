# Documentação: Pokerest API

Abaixo constam informações técnicas gerais sobre a API. Descrição de campos, endpoints e exemplos de retorno.

## Endpoints

| Endpoint | Query Params | Descrição |
|---|---|---|
| `GET /api/pokemons/{name: str}` | `null` | Retorna Pokémon por nome |
| `GET /api/pokemons/generation/{number: int}` | `null` | Retorna todos os Pokémons da geração `number` |
| `GET /api/pokemons/glassCannons/` | `atk_gt: int, df_lt: int` | Retorna uma lista de glass cannons com ataque maior que 130 e defesa menor que 80 |
| `GET /api/teams/random` | x | Retorna um time de 6 Pokémons aleatórios |
| `GET /api/types/statistics/` | `types: array` | Retorna as estatísticas de um ou mais tipos agregados |

## Campos e Exemplos

Cada **Pokémon** contém os campos seguintes:

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

---

Cada **estatística** contém os campos seguintes:

> Em caso de múltiplos tipos, as estatísticas de cada tipo passado serão agregadas.

```JS
{
    "preecher aqui",  //
}
```

Exemplo de retorno:

```JSON
{
    "preecher aqui": 1,
}
```
