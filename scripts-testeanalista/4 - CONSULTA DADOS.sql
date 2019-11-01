SELECT CONCAT(SUBSTR(u.cd_cpf,1,3),'.',SUBSTR(u.cd_cpf,4,3),'.',SUBSTR(u.cd_cpf,7,3),'-',SUBSTR(u.cd_cpf,10,2)) CPF, 
	   upper(ds_nome) NOME,
       o.ds_orgao ORGAO,
       c.ds_cargo CARGO,
       s.ds_sistema SISTEMA
from testeanalise.usuario u       
	inner join testeanalise.orgao o on o.cd_orgao = u.cd_orgao
    inner join testeanalise.cargo c on c.cd_cargo = u.cd_cargo
    left join testeanalise.rel_usuario_sistema r on r.cd_cpf = u.cd_cpf
    left join testeanalise.sistema s on s.cd_sistema = r.cd_sistema
    order by CPF;
    