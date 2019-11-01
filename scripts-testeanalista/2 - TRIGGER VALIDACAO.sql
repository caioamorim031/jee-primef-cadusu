DELIMITER //
create trigger trg_insere_usuario
before insert on testeanalise.usuario
for each row
begin
	
	if (new.tp_usuario < 1 or new.tp_usuario > 2 ) then
		SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Tipo de usuário inválido';
    end if;
    
     if (not exists(select 1 from DUAL where new.cd_cpf regexp '^([0-9]{11})$')) then
		SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'CPF fora do padrão';
     end if;

end //

DELIMITER ;
