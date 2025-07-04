create table if not exists users
(
    id bigserial primary key ,
    firstname varchar(64) not null unique,
    surname varchar(64) not null unique
    );