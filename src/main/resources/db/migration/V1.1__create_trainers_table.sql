create table if not exists trainers(
id serial not null,
name varchar(50) not null,
gender char not null,
pokemon_id integer not null,

constraint pk_trainer primary key(id),
constraint fk_trainer_pokemon foreign key(pokemon_id) references pokemons(id)
)