create table tb_paciente(
id serial auto_increment primary key,
nome varchar(200) not null,
sobrenome varchar(50)not null,
cpf varchar(15)not null,
fone varchar(10)not null,
email varchar(50)not null

);
