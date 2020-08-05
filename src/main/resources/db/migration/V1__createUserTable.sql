CREATE TABLE IF NOT EXISTS `registration_users` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT KEY,
    `userName` varchar(100),
    `firstName` varchar(100),
    `lastName` varchar(100)
);

INSERT INTO registration_users(id, userName) VALUES (1, 'Divanio_Silva');