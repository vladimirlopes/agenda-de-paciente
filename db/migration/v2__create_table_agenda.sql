create table tb_agenda(
id serial auto_increment primary key,
descricao varchar(200) not null,
data_hora timestamp,
data_criacao timestamp,
paciente_id integer,
CONSTRAINT fk_agenda_paciente FOREIGN KEY(paciente_id) REFERENCES paciente(id)

);
