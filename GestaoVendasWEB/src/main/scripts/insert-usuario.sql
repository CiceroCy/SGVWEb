INSERT INTO tb_regra_acesso ( criado_em, criado_por, nome ) VALUES ( '2017-02-15', 'assinc', 'ADMIN' );
INSERT INTO tb_perfil ( criado_em, criado_por, nome ) VALUES ( '2017-02-15', 'assinc', 'System Administrator' );
INSERT INTO tb_perfil_regra_acesso ( perfil_id, regra_acesso_id ) VALUES (1, 1);


INSERT INTO tb_usuario ( criado_em, criado_por, nome, email, enabled, perfil_id, status) VALUES ( '2017-02-15', 'assinc', 'Edmilson Reis', 'admin@gmail.com', 1, 1, 1);
INSERT INTO tb_autenticacao ( criado_em, criado_por, password, usuario_id ) VALUES ('2017-02-15', 'assinc', SHA2('admin', 256), 1 );

INSERT INTO tb_usuario ( criado_em, criado_por, nome, email, enabled, perfil_id, status) VALUES ( '2017-02-15', 'assinc', 'Kauan dos Reis', 'kauan@gmail.com', 1, 1, 1);
INSERT INTO tb_autenticacao ( criado_em, criado_por, password, usuario_id ) VALUES ('2017-02-15', 'assinc', SHA2('admin', 256), 2 );

INSERT INTO tb_usuario ( criado_em, criado_por, nome, email, enabled, perfil_id, status) VALUES ( '2017-02-15', 'assinc', 'Lukas Batista', 'lukas@gmail.com', 1, 1, 1);
INSERT INTO tb_autenticacao ( criado_em, criado_por, password, usuario_id ) VALUES ('2017-02-15', 'assinc', SHA2('admin', 256), 3 );


