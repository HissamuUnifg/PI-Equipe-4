/* 
*  aqui esta nossa tabelas de bancos de dados,  cliente, funcionario e pets.
*/

CREATE TABLE if not exists tb_cliente (
nome varchar(30),
sobrenome varchar(20),
cpf varchar(14) primary key,
rg varchar(13),
dt_nascimento date,
rua varchar(99),
numero int,
bairro varchar(99),
telefone varchar(17)
);

CREATE TABLE if not exists tb_animal (
id_animal int primary key,
nome varchar(30),
tipo varchar(30),
dt_nascimento date,
raça varchar(30),
idade int,
peso double, 
cpf_dono varchar(13),
foreign key fk_cpf_dono (cpf_dono) references tb_cliente (cpf)
);

CREATE TABLE if not exists tb_funcionario (
nome varchar(30),
cargo varchar(50),
dt_nascimento date,
sobrenome varchar(20),
cpf varchar(14) primary key,
rg varchar(13),
rua varchar(99),
numero int,
bairro varchar(99),
telefone varchar(17)
);

