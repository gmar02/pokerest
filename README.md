# Pokerest

## Sobre

API REST para análise avançada de estatísticas de Pokémon, voltada para jogadores competitivos, analistas e desenvolvedores que desejam explorar dados estratégicos, compor times específicos, etc.

<div style="padding:10px; border-left:4px solid yellow; background: black;">
  <strong>Nota:</strong> Projeto em desenvolvimento.
</div>

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

## Deploy
