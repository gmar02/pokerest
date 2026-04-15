# Pokerest

## Sobre

API REST para análise avançada de estatísticas de Pokémon, voltada para jogadores competitivos, analistas e desenvolvedores que desejam explorar dados estratégicos, compor times específicos, etc.

<div style="padding:10px; border-left:4px solid yellow; background: black;">
  <strong>Nota:</strong> Projeto em desenvolvimento.
</div>

Para mais informações sobre endpoints, campos e exemplos de retorno, ler `DOC.md`

## Dependências

> Para informações mais detalhadas, veja `mvn dependency:tree`

- Spring Boot `org.springframework.boot:spring-boot-starter-webmvc:4.0.5`
- Spring Web `org.springframework:spring-web:7.0.6`, `org.springframework:spring-webmvc:7.0.6`
- Validator `org.hibernate.validator:hibernate-validator:9.0.1.Final` com `jakarta.validation:jakarta.validation-api:3.1.1`
- OpenCSV `com.opencsv:opencsv:jar:5.9:compile`
- Lombok `org.projectlombok:lombok:jar:1.18.32:provided`

## Deploy

O dataset utilizado com os dados dos Pokémons está disponível em <a href="https://www.kaggle.com/datasets/rounakbanik/pokemon">https://www.kaggle.com/datasets/rounakbanik/pokemon</a>. 

O arquivo `pokemon.csv` deve estar localizado em `pokerest.src.main.resources`.

