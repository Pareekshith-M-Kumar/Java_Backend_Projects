CREATE USER 'hiber_user'@'localhost'
IDENTIFIED BY 'hiber@123';
GRANT ALL PRIVILEGES
ON car_db.*
TO 'hiber_user'@'localhost';
FLUSH PRIVILEGES;
SHOW GRANTS FOR 'hiber_user'@'localhost';
