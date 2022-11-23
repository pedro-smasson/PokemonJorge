create table if not exists pokemons(
id serial not null,
name varchar(15) not null,
type varchar(20) not null,

constraint pk_pokemon primary key(id)
)