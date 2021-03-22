TRUNCATE TABLE client;
TRUNCATE TABLE quotation;

INSERT INTO client (id, name, zip) VALUES ('a10a2afd-0a81-4ab9-9e66-57846b255277', 'Apple', 93140);
INSERT INTO quotation (id, client_id) VALUES ('9ab0659b-faec-46cc-88e8-15627d9d7489','a10a2afd-0a81-4ab9-9e66-57846b255277');