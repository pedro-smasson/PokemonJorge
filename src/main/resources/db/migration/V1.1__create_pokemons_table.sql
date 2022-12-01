create table if not exists pokemons(
id serial not null,
name varchar(15) not null,
type varchar(20) not null,
trainer_id integer not null,

constraint pk_pokemon primary key(id),
constraint fk_pokemon_trainer foreign key(trainer_id) references trainers(id)
)
