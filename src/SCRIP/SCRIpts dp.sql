/* 
*  aqui esta nossa tabelas de bancos de dados,  cliente, funcionario e pets.
*/

create database if not exists db_petshop;


use db_petshop;

create table if not exists tb_cliente (
  	nome varchar(30),
  	sobrenome varchar(30),
  	cpf varchar(14) primary key,
  	rg varchar(13),
  	rua varchar(99),
  	numero int,
  	bairro varchar(99),
  	telefone varchar(30)
  
  );
  
create table if not exists tb_animal (
  	id int primary key,
  	nome varchar(30),
  	tipo varchar(30),
  	raça varchar(30),
  	idade int,
  	peso double,
  	cpf_dono varchar(13),
  	
  	foreign key fk_cpf_dono (cpf_dono) references tb_cliente (cpf)
  
  );
  
create table if not exists tb_veterinario (  
  	nome varchar(30),
  	sobrenome varchar(30),
  	crmv int primary key,
  	cpf varchar(14),
  	rg varchar(13),
  	rua varchar(99),
  	numero int,
  	bairro varchar(99),
  	telefone varchar(30),
  	cod_consulta int  
  	  
);

create table if not exists tb_funcionario (  	
  	nome varchar(30),
  	sobrenome varchar(30),
  	cpf varchar(14) primary key,
  	rg varchar(13),
  	rua varchar(99),
  	numero int,
  	bairro varchar(99),
  	telefone varchar(30),
  	cod_banhotosa int	
  
);

create table if not exists tb_banhotosa (
  	codigo int,
  	id_animal int,
  	dia date,
  	horario int,
  	buscar_domicilio boolean,
  	cpf_funcionario varchar(14),
  
  	foreign key fk_animal (id_animal) references tb_animal (id),
  	foreign key fk_funcionario (cpf_funcionario) references tb_funcionario (cpf)
  
);

create table if not exists tb_vacinacao (
  	codigo int primary key,
  	id_animal int,
  	cpf_funcionario varchar(14),
  
  	foreign key fk_id_animal (id_animal) references tb_animal (id),
  	foreign key fk_v_funcionario (cpf_funcionario) references tb_funcionario (cpf)
  
);

create table if not exists tb_consulta (
  	codigo int primary key,
  	id_animal int,
  	crmv_veterinario int,
  
  foreign key fk_c_animal (id_animal) references tb_animal (id),
  foreign key fk_veterinario (crmv_veterinario) references tb_veterinario (crmv)
  
);
  
  create table if not exists produtos (
        codigo int not null auto_increment primary key,
        tipo varchar(50) not null,
	modelo varchar(100) not null,
	preco float(6,2) not null,
        fabricante varchar(100) not null,
	quantidade int(4) not null default '0'

 );
    
    
 create table if not exists estoque(
       codigo int(15) not null auto_increment primary key,
        tamanho int(15),
	quantidade int(15)

 );

