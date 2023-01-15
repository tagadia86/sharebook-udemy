DROP TABLE IF EXISTS employees;
 
CREATE TABLE employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  mail VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);
 
INSERT INTO employees (first_name, last_name, mail, password) VALUES
  ('Laurent', 'GINA', 'laurentgina@mail.com', 'laurent'),
  ('Sophie', 'FONCEK', 'sophiefoncek@mail.com', 'sophie'),
  ('Agathe', 'FEELING', 'agathefeeling@mail.com', 'agathe'),
  ('Thierno', 'DIA', 'thierno@mail.com', 'thierno'),
  ('Marieme', 'NIASSE', 'marieme@mail.com', 'marieme'),
  ('Astou', 'NDIR', 'astou@mail.com', 'astou'),
  ('Julie', 'DUPONT', 'julie@mail.com', 'julie'),
  ('Michelle', 'BARNES', 'michelle@mail.com', 'michelle'),
  ('Ahlan', 'SAID', 'ahlan@mail.com', 'ahlan');