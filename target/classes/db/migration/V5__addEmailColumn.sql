ALTER TABLE `registration_users`
ADD COLUMN email VARCHAR(100) AFTER lastName;
UPDATE project.registration_users
SET email='laraliberati@gmail.com' WHERE id=4;