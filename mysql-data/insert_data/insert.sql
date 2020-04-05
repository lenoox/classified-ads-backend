SET CHARACTER_SET_CLIENT = utf8;
SET CHARACTER_SET_CONNECTION = utf8;

USE `classified-ads`;

INSERT INTO `classified-ads`.item_condition (id, name) VALUES (1, 'Nowy');
INSERT INTO `classified-ads`.item_condition (id, name) VALUES (2, 'Używany');


INSERT INTO `classified-ads`.item (id, color, date_created, description, name, price, item_condition_id) VALUES (1, 'białe', '2020-02-05 12:18:15', 'Nowe słuchawki', 'Słuchawki 11lite', 113, 2);
INSERT INTO `classified-ads`.item (id, color, date_created, description, name, price, item_condition_id) VALUES (2, 'białe', '2020-01-05 11:32:42', 'używane słuchawki', 'Słuchawki 11pro', 193, 2);
INSERT INTO `classified-ads`.item (id, color, date_created, description, name, price, item_condition_id) VALUES (3, 'czarne', '2020-03-05 17:29:25', 'Mało używane słuchawki', 'Słuchawki 21lite', 293, 1);
INSERT INTO `classified-ads`.item (id, color, date_created, description, name, price, item_condition_id) VALUES (4, 'czarne', '2020-01-05 20:41:34', 'Nowe słuchawki, nie trafiony prezent', 'Słuchawki 21pro', 553, 1);


