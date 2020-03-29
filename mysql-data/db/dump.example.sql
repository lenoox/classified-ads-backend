CREATE DATABASE IF NOT EXISTS `classified-ads`;

SET CHARACTER_SET_CLIENT = utf8;
SET CHARACTER_SET_CONNECTION = utf8;

USE `classified-ads`;

DROP TABLE IF EXISTS item;
create table item
(
    id           bigint       not null
        primary key,
    color        varchar(255) null,
    date_created datetime     null,
    description  varchar(255) null,
    name         varchar(255) null,
    price        int          null,
    state        varchar(255) null
) CHARACTER SET utf8 COLLATE utf8_polish_ci;

INSERT INTO `classified-ads`.item
(id, color, date_created, description, name, price, state)
VALUES (1, 'black', '2020-03-24 21:01:30', 'Nie używane sluchawki w dobrym stanie', 'Sluchawki T120L', 199, 'Nowy');


INSERT INTO `classified-ads`.item
(id, color, date_created, description, name, price, state)
VALUES (2, 'white', '2020-03-27 23:01:30', 'Używane, sprzedaje bo kupiłem nowe', 'Sluchawk T70P', 159, 'Używane');