USE car_db;

CREATE TABLE car (
    id INT PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(50),
    model VARCHAR(50),
    price DOUBLE
);

INSERT INTO car (brand, model, price) VALUES
('Toyota', 'Camry', 30000),
('Honda', 'Civic', 25000),
('Tesla', 'Model 3', 50000);