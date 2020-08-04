CREATE TABLE IF NOT EXISTS `REGISTRATION_USERS` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT KEY,
    `userName` varchar(100),
    `firstName` varchar(100),
    `lastName` varchar(100)
);

INSERT INTO REGISTRATION_USERS(id, userName) VALUES (1, 'Divanio_Silva');