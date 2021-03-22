TRUNCATE TABLE client CASCADE;
TRUNCATE TABLE quotation CASCADE ;
TRUNCATE TABLE product CASCADE ;

INSERT INTO client (id, name, zip) VALUES ('a10a2afd-0a81-4ab9-9e66-57846b255277', 'Apple', 93140);

INSERT INTO quotation (id, client_id) VALUES ('9ab0659b-faec-46cc-88e8-15627d9d7489','a10a2afd-0a81-4ab9-9e66-57846b255277');

INSERT INTO product (id, name, price) VALUES ('c82be61c-96c3-4d1c-a278-137641f23620', 'DATA', 1000);

INSERT INTO quotation_product (id, quotation_id, product_id) VALUES ('3fcaf6da-88d8-4052-adbd-af6b215c603b', '9ab0659b-faec-46cc-88e8-15627d9d7489', 'c82be61c-96c3-4d1c-a278-137641f23620');

SELECT * FROM client;
SELECT * FROM quotation;
SELECT * FROM product;
SELECT * FROM quotation_product;