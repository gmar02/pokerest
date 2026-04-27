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

Cada **Estatística** contém os campos seguintes:

> Em caso de múltiplos tipos, as estatísticas de cada tipo passado serão agregadas.

```JS
{
    "type",                        // Tipo do Pokémon (ex: "fire", "water")
    "total_pokemons",              // Quantidade total de Pokémon deste tipo
    "avg_bst",                     // Média do Base Stat Total (soma de todos os atributos base)
    "max_bst",                     // Maior BST encontrado no tipo
    "min_bst",                     // Menor BST encontrado no tipo
    "avg_speed",                   // Velocidade média
    "fast_count",                  // Quantidade de Pokémon rápidos (speed >= 100)
    "medium_speed_count",          // Quantidade com velocidade média (60 <= speed < 100)
    "slow_count",                  // Quantidade de Pokémon lentos (speed < 60)
    "avg_physical_attack",         // Média de ataque físico
    "avg_special_attack",          // Média de ataque especial
    "avg_defense",                 // Média de defesa
    "avg_sp_defense",              // Média de defesa especial
    "physical_bias_ratio",         // Razão entre ataque físico e especial (attack / sp_attack)
    "bulk_ratio",                  // Indicador de resistência ((defense + sp_defense) / hp)
    "physical_sweepers",           // Pokémon com alto ataque físico e alta velocidade
    "special_sweepers",            // Pokémon com alto ataque especial e alta velocidade
    "tanks",                       // Pokémon com bons stats defensivos e HP alto
    "walls",                       // Pokémon muito defensivos e lentos
    "balanced",                    // Pokémon que não se encaixam nas categorias acima
    "legendary_count",             // Quantidade de lendários
    "legendary_avg_bst",           // Média de BST apenas entre lendários
    "avg_abilities_per_pokemon",   // Média de habilidades por Pokémon
    "dual_type_count",             // Quantidade de Pokémon com tipo secundário
    "avg_weakness_count",          // Média de fraquezas (requer cálculo com tabela de tipos)
    "avg_resistance_count"         // Média de resistências (requer cálculo com tabela de tipos)
}
```

Exemplo de retorno:

```JSON
{
    "preecher aqui": 1,
}
```
