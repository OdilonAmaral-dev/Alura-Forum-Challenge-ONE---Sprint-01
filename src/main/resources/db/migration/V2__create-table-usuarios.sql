create table usuarios(

    id bigint not null auto_increment,
    login varchar(100) not null,
    senha varchar(255) not null,

    primary key(id)

);

INSERT INTO usuarios (login, senha)
VALUES ("admin", "$2a$10$nhk83O3zlabCJa2oDpz8MODwIab.3H0nHQdo6Rjxslvk84jX4Haui");