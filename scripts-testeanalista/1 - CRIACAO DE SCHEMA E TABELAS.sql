create database testeanalise;

create table testeanalise.usuario (
			cd_cpf varchar(11) not null primary key,
            ds_nome varchar(200) not null,
            tp_usuario decimal(1) not null default 1 comment 'Identificador de Usuario / 1 - Comum / 2 - Funcionario',
            cd_cargo int not null,
            cd_orgao int not null,
            foreign key(cd_cargo) references cargo(cd_cargo),
            foreign key(cd_orgao) references orgao(cd_orgao),
            check(tp_usuario > 0 and tp_usuario < 3)
			);
            
            
create table testeanalise.cargo(
			cd_cargo int not null auto_increment primary key,
            ds_cargo varchar(100) not null
								);
                                
create table testeanalise.orgao(
			cd_orgao int not null auto_increment primary key,
            ds_orgao varchar(100) not null
			);                      
            
            
create table testeanalise.sistema(
			cd_sistema int not null auto_increment primary key,
            ds_sistema varchar(100) not null
);            


-- tabela relacional USUARIO <-> SISTEMA
create table rel_usuario_sistema(
			cd_cpf varchar(11) not null,
            cd_sistema int not null,
            unique(cd_cpf, cd_sistema),
            foreign key(cd_cpf) references usuario(cd_cpf),
            foreign key(cd_sistema) references sistema(cd_sistema)
);