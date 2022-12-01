create table if not exists trainers(
id serial not null,
name varchar(50) not null,
gender char not null,

constraint pk_trainer primary key(id)
)