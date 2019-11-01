DELIMITER $$
create procedure gerarDados()
begin

	if (not exists(select 1 from testeanalise.cargo)) then
        INSERT INTO cargo(ds_cargo) VALUES ('Estagiário'),('Desenvolvedor'),('Analista de Sistemas'),('Arquiteto de Software'),('Gerente de Projetos'),('Trainee');
        commit;
    end if;
    
    if (not exists(select 1 from testeanalise.orgao)) then
        INSERT INTO orgao(ds_orgao) VALUES ('Secretaria A'),('Secretaria B'),('Secretaria C');
        commit;
    end if;

	if (not exists(select 1 from testeanalise.sistema)) then
		INSERT INTO sistema(ds_sistema) VALUES ('Financeiro'),('Suprimentos'),('Integração');
        commit;
    end if;
    
    if (not exists(select 1 from testeanalise.usuario)) then
		insert into usuario values ('12345678910', 'Teste', 1, 1, 1), ('10987654321', 'TesteFuncionario', 2, 4, 1);
        commit;
    end if;
    
    if (not exists(select 1 from testeanalise.rel_usuario_sistema)) then
		insert into rel_usuario_sistema values ('10987654321', 1), ('10987654321', 2), ('10987654321', 3), ('12345678910', 1);
        commit;
    end if;
end $$
DELIMITER ;

call gerarDados();
