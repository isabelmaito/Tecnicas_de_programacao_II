-- DROP DATABASE MOV_CONTA_CORRENTE
-- GO

CREATE DATABASE MOV_CONTA_CORRENTE
GO

USE MOV_CONTA_CORRENTE
GO

CREATE TABLE AGENCIAS(
	NUM_AGE	NUMERIC(5,0) PRIMARY KEY NOT NULL,
	NOME_AGE VARCHAR(30) NOT NULL,
	ENDE_AGE VARCHAR(50) NOT NULL,
	NUME_AGE VARCHAR(8),
	COMPL_AGE VARCHAR(20),
	BAIR_AGE VARCHAR(20),
	CIDA_AGE VARCHAR(30) NOT NULL,
	UF_AGE CHAR(2) NOT NULL,
	CEP_AGE CHAR(8) NOT NULL,
	FONE_AGE VARCHAR(13)
	)

CREATE TABLE CLIENTES(
	ID_CLI NUMERIC(9,0) PRIMARY KEY NOT NULL,
	NOME_CLI VARCHAR(50) NOT NULL,
	ENDE_CLI VARCHAR(50) NOT NULL,
	NUME_CLI VARCHAR(8),
	COMPL_CLI VARCHAR(20),
	BAIR_CLI VARCHAR(20),
	CIDA_CLI VARCHAR(30) NOT NULL,
	UF_CLI CHAR(2) NOT NULL,
	CEP_CLI CHAR(8) NOT NULL,
	FONE_CLI VARCHAR(13),
	CPF_CLI CHAR(11),
	DATA_NASC DATETIME,
	CNPJ_CLI CHAR(14)
)

CREATE TABLE HISTORICOS(
	ID_HIS NUMERIC(4,0) PRIMARY KEY NOT NULL,
	DES_HIS VARCHAR(30) NOT NULL
)

CREATE TABLE CONTACORRENTE(
	NUM_AGE NUMERIC(5,0) NOT NULL,
	NUM_CC NUMERIC(10,0) NOT NULL,
	ID_CLI NUMERIC(9,0) NOT NULL,
	SALDO NUMERIC(15,2),
	PRIMARY KEY (NUM_AGE,NUM_CC),
	CONSTRAINT FK_CONTACORRENTE_AGE FOREIGN KEY (NUM_AGE) REFERENCES AGENCIAS(NUM_AGE),
	CONSTRAINT FK_CONTACORRENTE_CLI FOREIGN KEY (ID_CLI) REFERENCES CLIENTES(ID_CLI)
)

CREATE TABLE USUARIOS(
	ID VARCHAR(20) PRIMARY KEY NOT NULL,
	SENHA VARCHAR(20) NOT NULL,
	NUM_AGE NUMERIC(5,0) NOT NULL,
	NUM_CC NUMERIC(10,0) NOT NULL,
	CONSTRAINT FK_USUARIOS_CC FOREIGN KEY (NUM_AGE,NUM_CC) REFERENCES CONTACORRENTE(NUM_AGE,NUM_CC)
)

CREATE TABLE MOVIMENTACAO(
	NUM_AGE NUMERIC(5,0) NOT NULL,
	NUM_CC NUMERIC(10,0) NOT NULL,
	DATA_MOV DATETIME NOT NULL,
	NUM_DOCTO VARCHAR(6) NOT NULL,
	DEBITO_CREDITO CHAR(1) NOT NULL,
	ID_HIS NUMERIC(4,0) NOT NULL,
	COMPL_HIS VARCHAR(30),
	VALOR NUMERIC(9,2) NOT NULL,
	SALDO NUMERIC(15,2),
	PRIMARY KEY (NUM_AGE,NUM_CC,DATA_MOV,NUM_DOCTO),
	CONSTRAINT FK_MOVIMENTACAO_AGE FOREIGN KEY (NUM_AGE) REFERENCES AGENCIAS(NUM_AGE),
	CONSTRAINT FK_MOVIMENTACAO_CC FOREIGN KEY (NUM_AGE,NUM_CC) REFERENCES CONTACORRENTE(NUM_AGE,NUM_CC),
	CONSTRAINT FK_MOVIMENTACAO_HIS FOREIGN KEY (ID_HIS) REFERENCES HISTORICOS(ID_HIS)
)
	
-- INSERTS DE DADOS PARA TESTES
-- INSERTS DE AGENCIAS
INSERT into AGENCIAS (num_age, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE)
VALUES (11001, 'Banco do Brasil', 'Rua paraná', '11', NULL, 'Das flores', 'Paraná', 'SP', '18025111', '14991828282'),
	   (11002, 'Bradesco', 'Av Tiradentes', '111', 'Praça', 'Centro', 'Sorocaba', 'SP', '18112335', '15991823120'),
       (11003, 'Itau', 'Rua Corinthians', '1232', null, 'Itaquera', 'São Paulo', 'SP', '12334556', '11998765432'),
	   (11004, 'Caixa Economica Federal', 'Av votoraty', '01', 'Shopping', 'Lageado', 'Votorantim', 'SP', '11233586', '15998767655'),
	   (11005, 'Nubank', 'Av tamandua', '345', null, 'Pedrinhas' , 'Porto Velho', 'RS', '19324678', '27988765436');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(01001, 'Agência Central', 'Rua São Bento', '350', 'Sala 101', 'Centro', 'São Paulo', 'SP', '01012000', '(11)3322-4455'),
(01002, 'Agência Copacabana', 'Av. Atlântica', '500', 'Apto 301', 'Copacabana', 'Rio de Janeiro', 'RJ', '22021001', '(21)3221-7766'),
(01003, 'Agência Curitiba', 'Rua XV de Novembro', '123', 'Sala 102', 'Centro', 'Curitiba', 'PR', '80020100', '(41)3344-5566'),
(01006, 'Agência Brasília', 'Setor Bancário Sul', '500', 'Edifício 3', 'Asa Sul', 'Brasília', 'DF', '70070000', '(61)3444-7788'),
(01004, 'Agência Porto Alegre', 'Av. Ipiranga', '900', 'Loja 1', 'Centro', 'Porto Alegre', 'RS', '90035000', '(51)3222-1122'),
(01005, 'Agência Nordeste', 'Av. Boa Viagem', '1500', 'Sala 305', 'Boa Viagem', 'Recife', 'PE', '51020000','81311234567');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(2401, 'Agência Centro', 'Rua Principal', '100', 'Sala 1', 'Centro', 'Cidade A', 'SP', '12345678', '1112345678'),
(2402, 'Agência Norte', 'Avenida Brasil', '200', 'Andar 2', 'Norte', 'Cidade B', 'RJ', '23456789', '2123456789'),
(2403, 'Agência Sul', 'Rua das Flores', '300', '', 'Sul', 'Cidade C', 'MG', '34567890', '3134567890'),
(2404, 'Agência Leste', 'Praça da Paz', '400', 'Loja 4', 'Leste', 'Cidade D', 'BA', '45678901', '715678901'),
(2405, 'Agência Oeste', 'Estrada do Sol', '500', '', 'Oeste', 'Cidade E', 'RS', '56789012', '5556789012')
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (18001, 'Agência Afonso Vergueiro', 'Av. Dr. Afonso Vergueiro', '1600', NULL, 'Centro', 'Sorocaba', 'SP', '18035000', '(15)3234-6644');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (18002, 'Agência Itavuvu', 'Av. Itavuvu', '2830', NULL, 'Jardim Santa Cecilia', 'Sorocaba', 'SP', '18078005', '(15)3225-2800');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (18003, 'Agência Av. São Paulo', 'Av. São Paulo', '925', NULL, 'Jardim Paulistano', 'Sorocaba', 'SP', '18013002', '(15)4003-1043');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (18004, 'Agência Vila Santana', 'Rua Comendador Hermelino Matarazzo', '500', NULL, 'Vila Santana', 'Sorocaba', 'SP', '18085000', '(15)3224-5122');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) 
VALUES (18005, 'Agência Campolim', 'Av. Antônio Carlos Comitre', '530', NULL, 'Parque Campolim', 'Sorocaba', 'SP', '18047620', '(15)3225-5400');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(02001, 'Agência Banco do Brasil', 'Av. Rio Branco', '181', '', 'Centro', 'Rio de Janeiro', 'RJ', '20040007', '(21)3808-3000'),
(02002, 'Agência Caixa', 'Av. Sete de Setembro', '1635', 'Ed. Oceania', 'Vitória', 'Salvador', 'BA', '40080002', '(71)3319-5000'),
(02003, 'Agência Itaú', 'Av. Paulista', '1230', '5º andar', 'Bela Vista', 'São Paulo', 'SP', '01310200', '(11)4004-4828'),
(02004, 'Agência Bradesco', 'Rua dos Tupis', '337', '', 'Centro', 'Belo Horizonte', 'MG', '30190060', '(31)3279-0800'),
(02005, 'Agência Santander', 'Av. Farrapos', '385', '', 'Floresta', 'Porto Alegre', 'RS', '90220002', '(51)3378-8300');
 INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE)
VALUES 
(1, 'Agência Central', 'Rua Principal, 100', '0001', 'Sala 1', 'Centro', 'São Paulo', 'SP', '01000000', '(11)1234-5678'),
(2, 'Agência Sul', 'Avenida Sul, 200', '0002', 'Andar 2', 'Sul', 'São Paulo', 'SP', '02000000', '(11)2345-6789'),
(3, 'Agência Norte', 'Rua do Norte, 300', '0003', 'Sala 3', 'Norte', 'São Paulo', 'SP', '03000000', '(11)3456-7890'),
(4, 'Agência Leste', 'Avenida Leste, 400', '0004', 'Andar 4', 'Leste', 'São Paulo', 'SP', '04000000', '(11)4567-8901'),
(5, 'Agência Oeste', 'Rua do Oeste, 500', '0005', 'Sala 5', 'Oeste', 'São Paulo', 'SP', '05000000', '(11)5678-9012');
 INSERT INTO Agencias (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(07001, 'Agência Penha', 'Rua da Penha', '593', 'Sala 10', 'Centro', 'São Paulo', 'SP', '01311100', '(11)3356-9876'),
(07002, 'Agência Brasil', 'Avenida Brasil', '1465', NULL, 'Vila Tereza', 'São Paulo', 'RJ', '01451000', '(11)32389799'),
(07003, 'Agência  Soares', 'Rua Atanázio Soares', '1789', 'Andar 2', 'Jardim das Acácias', 'Belo Horizonte', 'MG', '18074385', '(31)34567890'),
(07004, 'Agência Guaruja', 'Avenida Guaruja', '325', NULL, 'Jardim Guaruja', 'Curitiba', 'PR', '03502030', '(41)3367-8901'),
(07005, 'Agência Faria Lima', 'Rua Brigadeiro Faria Lima', '610', 'Casa 10', 'Casa Branca', 'São Paulo', 'SP', '01452000', '(11)31789002');
INSERT into AGENCIAS (num_age, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE)
VALUES (22001, 'Santander', 'Rua Amazonas', '22', 'Apto 101', 'Jardim', 'Curitiba', 'PR', '80530120', '41999876543'),
       (22002, 'Banco do Brasil', 'Av São João', '33', NULL, 'Centro', 'Belo Horizonte', 'MG', '30120050', '31987654321'),
       (22003, 'Bradesco', 'Rua das Flores', '44', 'Bloco B', 'Vila Nova', 'Rio de Janeiro', 'RJ', '22290000', '21912345678'),
       (22004, 'Caixa Econômica', 'Av Brasil', '55', NULL, 'Botafogo', 'Salvador', 'BA', '40060000', '7187654321'),
       (22005, 'Itaú', 'Rua das Oliveiras', '66', 'Sala 12', 'Centro', 'Florianópolis', 'SC', '88015300', '48987654321');
 INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE)
VALUES 
(15001, 'Ag. Sorocaba Centro', 'Av. Dom Aguirre', '123', 'Prédio Comercial', 'Centro', 'Sorocaba', 'SP', '18010000', '1512345678'),
(15002, 'Ag. Sorocaba Campolim', 'Av. Antônio Carlos Comitre', '456', 'Conjunto Empresarial', 'Parque Campolim', 'Sorocaba', 'SP', '18048000', '1519876543'),
(15003, 'Ag. Sorocaba Jd. São Paulo', 'Rua Aparecida', '789', 'Centro Empresarial', 'Jardim São Paulo', 'Sorocaba', 'SP', '18087000', '1516543210'),
(15004, 'Ag. Sorocaba Cerrado', 'Av. Ipanema', '500', 'Edifício Comercial', 'Cerrado', 'Sorocaba', 'SP', '18030000', '1519432109'),
(15005, 'Ag. Sorocaba Wanel Ville', 'Rua José Tótora', '750', 'Prédio Comercial', 'Wanel Ville', 'Sorocaba', 'SP', '18055000', '1518765432');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE)
VALUES
(10001, 'Agencia Coruscant', 'Avenida República', '100', 'Apto 12', 'Bairro Centro', 'São Paulo', 'SP', '01010000', '11987654321'),
(10002, 'Agencia Tatooine', 'Rua do Sol', '200', 'Apto 34', 'Bairro Deserto', 'Rio de Janeiro', 'RJ', '22020000', '21987654321'),
(10003, 'Agencia Naboo', 'Praça Real', '300', 'Sala 1', 'Bairro Palácio', 'Brasília', 'DF', '73030000', '61987654321'),
(10004, 'Agencia Hoth', 'Estrada Fria', '400', NULL, 'Bairro Gelado', 'Porto Alegre', 'RS', '91040000', '51987654321'),
(10005, 'Agencia Endor', 'Rua Florestal', '500', 'Casa 2', 'Bairro Verde', 'Curitiba', 'PR', '81050000', '41987654321');
insert into Agencias
values(19006, 'Rio Nova Barra', 'Av. das Américas', '4453', '', 'Barra da Tijuca', 'Rio de Janeiro', 'RJ', '22631004', '(55)40044828'),
(19007, 'Bela Paulista', 'Av. Paulista', '436', '', 'Bela Vista', 'São Paulo', 'SP', '01503000', '(11)32913000'),
(19008, 'Pari li', 'Praça Eduardo Rudge', '14', '', 'Pari', 'São Paulo', 'SP', '03028010', '(11)60990600'),
(19009, 'Curitiba JD das Americas', 'Av. Nossa Sra Lourdes', '63', '', 'Jardim das Américas', 'Curitiba', 'PR', '81530020', '(55)40044828'),
(19010, 'BH Alameda das Princesas', 'Alameda das Princesas', '31', '', 'São Luiz', 'Belo Horizonte', 'MG', '31270672', '(55)40044828')
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(101, 'Banco do Brasil', 'Av. Dom Aguirre, 123', '12345-67', NULL, 'Centro', 'Sorocaba', 'SP', '18010000', '(15)3333-3333'),
(102, 'Itaú Unibanco', 'Rua São Paulo, 456', '23456-78', NULL, 'Vila Helena', 'Sorocaba', 'SP', '18020000', '(15)4444-4444'),
(103, 'Santander', 'Praça da Independência, 789', '34567-89', 'Sala 10', 'Centro', 'Votorantim', 'SP', '18045000', '(15)5555-5555'),
(104, 'Bradesco', 'Av. 9 de Julho, 101', '45678-90', NULL, 'Jardim São Paulo', 'Sorocaba', 'SP', '18030000', '(15)6666-6666'),
(105, 'Caixa Econômica', 'Rua Silva Jardim, 234', '56789-01', 'Térreo', 'Jardim Vitória', 'Salto de Pirapora', 'SP', '18180000', '(15)7777-7777');
insert into AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE)
values (05001, 'Banco do Brasil', 'Avenida 31 de março', '1001', null, 'Centro', 'Votorantim', 'SP', '18113100', '1532434343'),
(05002, 'Bradesco', 'Avenida Dos estados', '1003', null, 'Centro', 'Sorocaba', 'SP', '18116900', '1532435678'),
(05003, 'Caixa Economica', 'Avenida 31 de março', '1501', null, 'Centro', 'Votorantim', 'SP', '18113100', '1532476789'),
(05004, 'Itau', 'Avenida 7 de Agosto', '7890', null, 'Vila Nova', 'Votorantim', 'SP', '18113015', '1532445343'),
(05005, 'Santander', 'Avenida Gisele Constantino', '101', null, 'Campolim', 'Sorocaba', 'SP', '18123300', '1532472343');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(091, 'Agência Central', 'Rua da Paz, 123', '001', 'Sala 2', 'Centro', 'São Paulo', 'SP', '01000000', '(11) 12345678'),
(092, 'Agência Jardim', 'Av. das Flores, 456', '002', 'Lado A', 'Jardim Botânico', 'Rio de Janeiro', 'RJ', '22222222', '(21) 98765432'),
(093, 'Agência Sul', 'Rua do Sul, 789', '003', 'Próximo ao parque', 'Zona Sul', 'Belo Horizonte', 'MG', '30330303', '(31) 33333333'),
(094, 'Agência Norte', 'Avenida do Norte, 159', '004', '', 'Zona Norte', 'Fortaleza', 'CE', '60060600', '(85) 44444444'),
(095, 'Agência Leste', 'Rua do Oriente, 753', '005', '', 'Zona Leste', 'Salvador', 'BA', '40040400', '(71) 55555555');
INSERT INTO AGENCIAS (NUM_AGE, NOME_AGE, ENDE_AGE, NUME_AGE, COMPL_AGE, BAIR_AGE, CIDA_AGE, UF_AGE, CEP_AGE, FONE_AGE) VALUES
(23001, 'Agência Conecta', 'Avenida 31 de Março', '245', '', 'Centro', 'Votorantim', 'SP', '18110005', '(15) 97218968'),
(23002, 'Agência Novo Horizonte', 'Rua Inês Correia de Araújo', '1517', 'Piso Superior', 'Jacarepaguá', 'Rio de Janeiro', 'RJ', '22743830', '(21) 89247347'),
(23003, 'Agência Futuro Seguro', 'Rua Neri de Barcelos', '764', 'Próximo ao parque', ' Cidade Tiradentes', 'São Paulo', 'SP', '03523020', '(11) 30835825'),
(23004, 'Agência Horizonte Financeiro', 'Avenida Perimetral Oeste', '1788', '', 'Setor Santos Dumont', 'Goiânia', 'GO', '74463840', '(62) 47083192'),
(23005, 'Agência Estrela do Amanhã', 'Rua Raimundo Marques', '621', '', 'Vila Emplavi', 'São Luís', 'MA', '65048540', '(98) 77642605');


-- INSERTS DE CLIENTES
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI)
VALUES (11005, 'João Alberto Pivetta Sobrinho', 'Rua Aligueri Vetorazzo', '506', 'cima', 'JD Devito', 'Votorantim', 'SP', '18112335', '15991826290', '42543635831', '30-03-1994', null),
	   (11006, 'Ana Souza', 'Rua dos Pinheiros', '789', 'Bloco B', 'Jardins', 'São Paulo', 'SP', '01420000', '11999997777', '12312312312', '10-07-1992', NULL),
	   (11007, 'Pedro Santos', 'Avenida Brasil', '500', 'Cobertura', 'Botafogo', 'Rio de Janeiro', 'RJ', '22250000', '21988886666', '32132132132', '25-11-1980', NULL),
	   (11008, 'Loja ABC', 'Avenida do Comércio', '1500', '', 'Centro', 'Belo Horizonte', 'MG', '30110000', '3133334444', NULL, NULL, '98765432000188'),
	   (11009, 'Luiza Almeida', 'Travessa das Palmeiras', '101', 'Apto 301', 'Jardim Botânico', 'Porto Alegre', 'RS', '90610000', '51987654321', '45645645645', '18-02-1995', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(010000001, 'João da Silva', 'Rua XV de Novembro', '100', 'Apto 12', 'Centro', 'Curitiba', 'PR', '80020010', '(41)3222-3344', '12345678901', '12-05-1980', NULL),
(010000002, 'Maria Oliveira', 'Av. Paulista', '2000', 'Cobertura', 'Bela Vista', 'São Paulo', 'SP', '01311000', '11999998888', '98765432109', '22-07-1990', NULL),
(010000003, 'Carlos Pereira', 'Av. Brasil', '300', 'Apto 50', 'Centro', 'Porto Alegre', 'RS', '90010000', '(51)3211-4433', '11223344556', '15-03-1975', NULL),
(010000004, 'Ana Souza', 'Rua das Flores', '150', 'Casa 3', 'Centro', 'Florianópolis', 'SC', '88010000', '(48)3322-5566', '99887766544', '05-10-1985', NULL),
(010000005, 'Pedro Lima', 'Rua dos Andrades', '40', 'Apto 6', 'Copacabana', 'Rio de Janeiro', 'RJ', '22031000', '(21)3444-6677', '66778899011', '10-09-1992', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(240000001, 'Mike Machado', 'Rua das Palmeiras', '10', 'Apto 101', 'Centro', 'Cidade A', 'SP', '12345678', '11912345678', '12345678901', '15-05-1985 00:00:00', NULL),
(240000002, 'Rodrigo Santoro', 'Avenida das Nações', '20', '', 'Norte', 'Cidade B', 'RJ', '23456789', '21923456789', NULL, '20-08-1990 00:00:00', '12345678000195'),
(240000003, 'Carlinhos de Jesus', 'Rua das Flores', '30', 'Casa 3', 'Sul', 'Cidade C', 'MG', '34567890', '31934567890', '34567890123', '10-12-1988 00:00:00', NULL),
(240000004, 'Victor Hugo', 'Praça da Liberdade', '40', '', 'Leste', 'Cidade D', 'BA', '45678901', '71945678901', NULL, '25-03-1995 00:00:00', '98765432000100'),
(240000005, 'Lucas Salvador', 'Estrada do Sol', '50', 'Bloco B', 'Oeste', 'Cidade E', 'RS', '56789012', '51956789012', '56789012345', '30-07-1982 00:00:00', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (18001, 'Rodrigo Almeida Pereira', 'Rua Adão Nunes', '321', 'Apto 101', 'Jardim São Carlos', 'Sorocaba', 'SP', '18081420', '(15)3221-4567', '54321098744', '20-05-1985 00:00:00.000', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (18002, 'Fernanda Costa Lima', 'Rua Benedito de Lima Almeida', '145', '', 'Jardim dos Estados', 'Sorocaba', 'SP', '18035420', '(15)3345-7890', '56789012345', '15-03-1990 00:00:00', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (18003, 'Tiago Martins Souza', 'Rua Fernando Silva', '210', 'Casa 5', 'Parque São Bento', 'Sorocaba', 'SP', '18072180', '(15)3219-1234', '76543210922', '10-12-1988 00:00:00', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (18004, 'Vanessa Ribeiro dos Santos', 'Rua Dr. Campos Salles', '520', 'Bloco A', 'Vila Santana', 'Sorocaba', 'SP', '18085220', '(15)3412-6789', '65432109833', '25-07-1995 00:00:00', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) 
VALUES (18005, 'Lucas Henrique Ferreira', 'Rua Mário Soave', '57', '', 'Jardim São Paulo', 'Sorocaba', 'SP', '18013150', '(15)3356-9876', '65498712351', '05-11-1982 00:00:00', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(020000001, 'Bentinho Santiago', 'Rua Capitu', '12', 'Casa 2', 'Glória', 'Rio de Janeiro', 'RJ', '20251001', '(21)1234-5678', '12345678901', '10-10-1984', NULL),
(020000002, 'Capitu Santiago', 'Rua Capitu', '12', 'Casa 2', 'Glória', 'Rio de Janeiro', 'RJ', '20251001', '(21)9876-5432', '10987654321', '15-10-1998', NULL),
(020000003, 'Rita Baiana', 'Rua da Quitanda', '34', '', 'Centro', 'Salvador', 'BA', '40000000', '(71)2345-6789', '23456789012', '22-03-1855', NULL),
(020000004, 'Macunaíma', 'Rua do Mito', '55', 'Ap 7', 'Centro', 'São Paulo', 'SP', '01000001', '(11)3456-7890', '34567890123', '20-04-1902', NULL),
(020000005, 'Iracema', 'Rua Lenda', '99', '26', 'Centro', 'Fortaleza', 'CE', '60000000', '(85)4567-8901', '45678901234', '17-08-1967', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI)
VALUES 
(21, 'João da Silva', 'Rua A, 1', '0001', '', 'Centro', 'São Paulo', 'SP', '01001000', '(11)1111-1111', '12345678901', '01-01-1980', ''),
(22, 'Maria Oliveira', 'Rua B, 2', '0002', 'Apto 202', 'Centro', 'São Paulo', 'SP', '01002000', '(11)2222-2222', '23456789012', '02-02-1990', ''),
(23, 'Pedro Santos', 'Rua C, 3', '0003', '', 'Centro', 'São Paulo', 'SP', '01003000', '(11)3333-3333', '34567890123', '03-03-1985', ''),
(24, 'Ana Costa', 'Rua D, 4', '0004', 'Bloco 1', 'Centro', 'São Paulo', 'SP', '01004000', '(11)4444-4444', '45678901234', '04-04-1995', ''),
(25, 'Lucas Pereira', 'Rua E, 5', '0005', '', 'Centro', 'São Paulo', 'SP', '01005000', '(11)5555-5555', '56789012345', '05-05-2000', '');
INSERT INTO Clientes (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(0701, 'Ana Carolina da Silva', 'Av. das Nações', 123, 'Bloco B', 'Centro', 'São Paulo', 'SP', '01020001', '(11)9875-4321', '50784590813', '13-09-1975 00:00:00', '56389123905732'),
(0702, 'Carlos Pereira de Souza', 'Rua da Liberdade', 456,'', 'Jardim das Acácias', 'Rio de Janeiro', 'RJ', '20010002', '(11)9876-5432', '09247954388', '22-08-1985 00:00:00', '23986789000100'),
(0703, 'Maria Janaina de Oliveira', 'Rua Bonifácio Peres', 789, 'Casa 8', 'Vila Tereza', 'Belo Horizonte', 'MG', '30010003', '(31)9865-1234', '34567890130', '30-12-1879 00:00:00', '38967890009180'),
(0704, 'Roberto Carlos Lima', 'Avenida Itavuvu', 321, '', 'Bairro Novo', 'Curitiba', 'PR', '80010004', '(41)9754-3210', '21348698732', '10-04-1983 00:00:00', '45678901008145'),
(0705, 'Fernanda Lima Costa', 'Avenida Washington Luiz', 654, 'Apto 202', 'Casa Branca', 'São Paulo', 'SP', '88011095', '(11)9543-2109', '23409876522', '25-11-1995 00:00:00', '50078901255019');
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI)
VALUES (22005, 'Mariana Silva', 'Rua das Acácias', '456', 'Apto 101', 'Vila Nova', 'Campinas', 'SP', '13040000', '19998887766', '12345678901', '15-03-1988', NULL),
       (22006, 'Ricardo Gomes', 'Avenida São Paulo', '321', '', 'Centro', 'Fortaleza', 'CE', '60130000', '85987654321', '98765432109', '30-08-1990', NULL),
       (22007, 'Fernanda Costa', 'Praça da Liberdade', '850', 'Casa 3', 'Liberdade', 'São Paulo', 'SP', '01531000', '11999998888', '32165498732', '12-12-1985', NULL),
       (22008, 'Loja XYZ', 'Rua do Comércio', '2000', 'Lojas 1 e 2', 'Centro', 'Salvador', 'BA', '40060000', '7187654321', NULL, NULL, '12345678000195'),
       (22009, 'Carlos Almeida', 'Rua das Flores', '789', '', 'Jardim das Palmeiras', 'Curitiba', 'PR', '80040000', '41912345678', '65432198765', '09-01-1993', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI)
VALUES 
(150000001, 'Ana Maria Braga', 'Rua Machado de Assis', '111', 'Apartamento', 'Centro', 'Sorocaba', 'SP', '18010000', '1511223344', '12345678901', '01-04-1950', NULL),
(150000002, 'Péricles Santos', 'Av. São Paulo', '222', 'Prédio Comercial', 'Parque Campolim', 'Sorocaba', 'SP', '18048000', '1512233445', NULL, '22-10-1970', '12345678000191'),
(150000003, 'Carla Souza', 'Rua Visconde do Rio Branco', '333', 'Sobrado', 'Jardim São Paulo', 'Sorocaba', 'SP', '18087000', '1513344556', '34567890123', '15-06-1990', NULL),
(150000004, 'José Ricardo', 'Av. Itavuvu', '444', 'Loja', 'Cerrado', 'Sorocaba', 'SP', '18030000', '1514455667', NULL, '03-11-1982', '23456789000192'),
(150000005, 'Patrícia Ferreira', 'Rua Hermelino Matarazzo', '555', 'Apartamento', 'Wanel Ville', 'Sorocaba', 'SP', '18055000', '1515566778', '56789012345', '17-12-1985', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI)
VALUES
(1, 'Luke Skywalker', 'Avenida República', '100', 'Apto 12', 'Bairro Centro', 'São Paulo', 'SP', '01010000', '11987654321', '12345678901', '02-05-1977', NULL),
(2, 'Leia Organa', 'Rua Alderaan', '200', 'Apto 20', 'Bairro Nobre', 'Rio de Janeiro', 'RJ', '22020000', '21987654321', '10987654321', '25-05-1977', NULL),
(3, 'Han Solo', 'Estrada Kessel', '300', 'Hangar 5', 'Bairro Porto', 'Curitiba', 'PR', '81050000', '41987654321', '98765432109', '15-05-1977', NULL),
(4, 'Chewbacca', 'Rua Kashyyyk', '400', 'Casa 1', 'Bairro Floresta', 'Porto Alegre', 'RS', '91040000', '51987654321', '87654321098', '07-05-1977', NULL),
(5, 'Darth Vader', 'Avenida Sith', '500', NULL, 'Bairro Imperial', 'Brasília', 'DF', '73030000', '61987654321', '76543210987', '09-05-1977', NULL);
insert into Clientes
values(19001, 'João Silva', 'Avenida das Américas', '123', 'Sala 12', 'Barra da Tijuca', 'Rio de Janeiro', 'RJ', '22640100', '(21)987654321', '55566677788', '30-11-1982', ''),
(19002, 'Ana Silva', 'Rua das flores', '153', 'Apartamento 45', 'Centro', 'São Paulo', 'SP', '01010000', '(11)987651234', '12345678900', '15-03-1990', ''),
(19003, 'João Pereira', 'Avenida Brasil', '456', 'Casa 2', 'Jardim das Américas', 'Curitiba', 'PR', '80000000', '(41)912345678', '98765432100', '22-07-1985', ''),
(19004, 'Carlos Oliveira', 'Rua São Pedro', '321', 'Cobertura', 'Vila Mariana', 'São Paulo', 'SP', '04000000', '(11)934567890', '', '05-05-1975', '12345678000190'),
(19005, 'Juliana Costa', 'Alameda dos Jacarandás', '654', 'Andar 3', 'São Luiz', 'Belo Horizonte', 'MG', '30100000', '(31)987651234', '32165498711', '10-01-1995', '')
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(11, 'Luiz Fernando R. Riato', 'Rua da Paz, 11', '98765-43', NULL, 'Centro', 'Sorocaba', 'SP', '18010100', '(15)9999-1111', '12345678901', '15-01-1980', NULL),
(12, 'Ana Clara da Silva', 'Av. das Flores, 22', '87654-32', NULL, 'Jardim Vitória', 'Sorocaba', 'SP', '18030200', '(15)8888-2222', '23456789012', '20-02-2002', NULL),
(13, 'Marcos Paulo Lima', 'Rua das Acácias, 33', '76543-21', 'Casa 3', 'Vila Helena', 'Sorocaba', 'SP', '18020300', '(15)7777-3333', '34567890123', '25-03-1987', NULL),
(14, 'Tatiane Souza', 'Rua das Orquídeas, 44', '65432-10', NULL, 'Jardim São Paulo', 'Votorantim', 'SP', '18045400', '(15)6666-4444', '45678901234', '30-04-1995', NULL),
(15, 'Rafael Almeida', 'Av. João Ribeiro, 55', '54321-09', NULL, 'Jardim Vitória', 'Salto de Pirapora', 'SP', '18180500', '(15)5555-5555', '56789012345', '05-05-1999', NULL);
insert into CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI)
values (05006, 'Caio Rodrigues', 'Rua Donizete Pereira', '37', 'casa B', 'Altos do Fortaleza', 'Votorantim', 'SP', '18113015', '15996638013', '46153374678', '12-05-1997', '12345678000136'),
(05007, 'Isabella Torres', 'Rua da Esperança', '14', 'casa 1', 'Jardim dos Sonhos', 'Ibiúna', 'SP', '18160000', '15990000122', '46153366687', '03-06-1994', '12345678000145'),
(05008, 'Gabriel Nascimento', 'Avenida Independência', '67', 'apto 7', 'Vila São Jorge', 'São Pedro', 'SP', '13500000', '15988999223', '46153376688', '21-02-1992', '12345678000146'),
(05009, 'Larissa Mendes', 'Rua da Liberdade', '29', 'casa D', 'Vila Verdejante', 'Mairiporã', 'SP', '07600000', '15987888324', '46153474689', '11-10-1989', '12345678000147'),
(05010, 'Felipe Almeida', 'Praça da Amizade', '48', 'apto 8', 'Centro', 'Piracicaba', 'SP', '13400000', '15986777425', '46153374690', '18-01-1986', '12345678000148');
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(091, 'Felipe Rodrigues dos Santos', 'Av Tiradentes', '266', 'Apto 402', 'Vossoroca', 'Votorantim', 'SP', '18116180', '(15)987654321', '49105982863', '13-07-1999', NULL),
(092, 'Maria Oliveira', 'Rua dos Lírios, 200', '02', 'Casa 2', 'Jardim das Flores', 'Rio de Janeiro', 'RJ', '22222222', '(21)22222222', '98765432100', '10-09-1990', NULL),
(093, 'Carlos Alberto', 'Rua do Lago, 300', '03', '', 'Zona Sul', 'Belo Horizonte', 'MG', '30330303', '(31)33333333', '45678912345', '20-03-1988', NULL),
(094, 'Fernanda Souza', 'Avenida das Américas, 400', '04', '', 'Zona Norte', 'Fortaleza', 'CE', '60060600', '(85)44444444', '32165498700', '12-12-1986', NULL),
(095, 'Ricardo Mendes', 'Rua das Palmeiras, 500', '05', '', 'Zona Leste', 'Salvador', 'BA', '40040400', '(71)55555555', '65432178900', '30-07-1982', NULL);
INSERT INTO CLIENTES (ID_CLI, NOME_CLI, ENDE_CLI, NUME_CLI, COMPL_CLI, BAIR_CLI, CIDA_CLI, UF_CLI, CEP_CLI, FONE_CLI, CPF_CLI, DATA_NASC, CNPJ_CLI) VALUES
(22001, 'Murilo Rodrigues dos Santos', 'Avenida Tiradentes', 266, 'Apto 402', 'Vossoroca', 'Votorantim', 'SP', '18116180', '19968076911', '49105982863', '12-01-1997', NULL),
(22002, 'Bruna Santos Goncalves', 'Rua Santo Amaro', '253', '', 'Jardim das Flores', 'São Luís', 'MA', '65046580', '9880132279', '71852740108', '08-05-1989', NULL),
(22003, 'Pedro Ferreira Melo', 'Rua Quatorze', '51', '', 'Zona Sul', 'Atibaia', 'SP', '30330303', '1180677249', '52263013750', '12-10-1962', NULL),
(22004, 'Thiago Ribeiro Carvalho', 'Rua Coronel Virgílio Xavier de Barros', '1544', '', 'Zona Norte', 'Goiânia', 'GO', '74660100', '6294307602', '78303682105', '21-11-2004', NULL),
(22015, 'Ágatha Cavalcanti Dias', 'Avenida Dom João VI', '1658', '', 'Zona Leste', 'Volta Redonda', 'RJ', '27211105', '2437397041', '69543101400', '02-10-1997', NULL);

-- INSERTS DE HISTÓRICOS
INSERT INTO HISTORICOS (ID_HIS, DES_HIS)
VALUES (1101, 'Pix realizado'), (1102, 'Pix Recebido'),
	   (1103, 'Saque Realizado'), (1104, 'Deposito Realizado'),
	   (1105, 'Transferência Realizada');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
(0101, 'Depósito em Conta'),
(0102, 'Saque em Conta'),
(0103, 'Transferência Recebida'),
(0104, 'Transferência Enviada'),
(0105, 'Pagamento de Boleto');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
(2401, 'Pix realizado'),
(2402, 'Recebimento de proventos'),
(2403, 'Pix recebido'),
(2404, 'Empréstimo realizado'),
(2405, 'Débito em conta');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (1, 'Transferência entre contas');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (2, 'Depósito em caixa');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (3, 'Saque em caixa eletrônico');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (4, 'pagamento de cartão');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES (5, 'Pagamento de conta de água');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
(21, 'Depósito em conta'),
(22, 'Transferência entre contas'),
(23, 'Saque'),
(24, 'Pagamento de boleto'),
(25, 'Compra com cartão de débito');
-- INSERT INTO HISTORICOS (ID_HIS, DES_HIS)
-- VALUES 
-- (1, 'Depósito'),
-- (2, 'Saque'),
-- (3, 'Transferência'),
-- (4, 'Pagamento'),
-- (5, 'Cobrança');
-- INSERT INTO Historicos (ID_HIS, DES_HIS) VALUES
-- (1, 'Pix Enviado'),
-- (2, 'Pagamento de cartão de crédito'),
-- (3, 'Pix Enviado'),
-- (4, 'Saque'),
-- (5, 'Recebimento');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS)
VALUES (2201, 'Pix realizado'), 
       (2202, 'Pix Recebido'),
       (2203, 'Saque Realizado'), 
       (2204, 'Depósito Realizado'),
       (2205, 'Transferência Realizada');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS)
VALUES 
(1501, 'Depósito em Conta'),
(1502, 'Saque'),
(1503, 'Transferência entre contas'),
(1504, 'Pagamento de boleto'),
(1505, 'Compra com cartão de débito');
INSERT INTO HISTORICOS (ID_HIS, DES_HIS)
VALUES
(1001, 'Depósito Galáctico'),
(1002, 'Transferência Imperial'),
(1003, 'Saque em Agência'),
(1004, 'Pagamento Bounty Hunter'),
(1005, 'Reembolso Jedi');
insert into Historicos
values(1901, 'Conta de água'),
(1902, 'Conta de energia'),
(1903, 'IPTU'),
(1904, 'Claro móvel'),
(1905, 'Internet banda larga')
-- INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
-- (1, 'Depósito'),
-- (2, 'Saque'),
-- (3, 'Transferência'),
-- (4, 'Pagamento'),
-- (5, 'Consulta Saldo');
insert into HISTORICOS (ID_HIS, DES_HIS)
values (0501, 'Pix Realizado'),
(0502, 'Pagamento Efetuado com sucesso'),
(0503, 'Saque Realizado'),
(0504, 'Deposito Realizado'),
(0505, 'Transferencia Realizada');
-- INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
-- (1, 'Depósito'),
-- (2, 'Saque'),
-- (3, 'Transferência'),
-- (4, 'Pagamento'),
-- (5, 'Consulta de saldo');
-- INSERT INTO HISTORICOS (ID_HIS, DES_HIS) VALUES
-- (1, 'Depósito'),
-- (2, 'Saque'),
-- (3, 'Transferência'),
-- (4, 'Pagamento'),
-- (5, 'Consulta de saldo');

-- INSERTS DE CONTAS CORRENTES
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO)
VALUES (11001, 1100001, 11005, 150.45),
	   (11002, 1100002, 11006, 1000.34),
	   (11003, 1100003, 11007, 123424.30),
	   (11004, 1100004, 11008, 32.50),
	   (11005, 1100005, 11009, -233.10);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(01001, 0100000001, 010000001, 1500.75),
(01002, 0100000002, 010000002, 3000.00),
(01003, 0100000003, 010000003, 4500.00),
(01004, 0100000004, 010000004, 2500.50),
(01005, 0100000005, 010000005, 1200.80);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(2401, 1234567890, 240000001, 1500.00),
(2402, 2345678901, 240000002, 2500.50),
(2403, 3456789012, 240000003, 3200.75),
(2404, 4567890123, 240000004, 1800.25),
(2405, 5678901234, 240000005, 4000.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (18001, 1800000001, 18001, 1500.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (18002, 1800000002, 18002, 2500.50);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (18003, 1800000003, 18003, 3200.75);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (18004, 1800000004, 18004, 400.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES (18005, 1800000005, 18005, 9000.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(02001, 1234567890, 020000001, 5000.00),
(02002, 2345678901, 020000002, 3000.00),
(02003, 3456789012, 020000003, 4000.00),
(02004, 4567890123, 020000004, 2000.00),
(02005, 5678901234, 020000005, 7000.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO)
VALUES 
(1, 10001, 1, 1500.00),
(2, 20002, 2, 2500.50),
(3, 30003, 3, 3500.75),
(4, 40004, 4, 4500.00),
(5, 50005, 5, 5500.90);
INSERT INTO ContaCorrente (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(07001, 07001, 0701, 3400.00),
(07002, 07002, 0702, 7500.00),
(07003, 07003, 0703, 9200.00),
(07004, 07004, 0704, 10000.00),
(07005, 07005, 0705, 1900.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO)
VALUES (22001, 2200001, 22005, 150.45),
       (22002, 2200002, 22006, 1000.34),
       (22003, 2200003, 22007, 123424.30),
       (22004, 2200004, 22008, 32.50),
       (22005, 2200005, 22009, -233.10);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO)
VALUES 
(15001, 9876543210, 150000001, 5000.00),
(15002, 8765432109, 150000002, 1500.00),
(15003, 7654321098, 150000003, 3500.00),
(15004, 6543210987, 150000004, 2500.00),
(15005, 5432109876, 150000005, 4500.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO)
VALUES
(10001, 1234567890, 1, 10000.00),
(10002, 2345678901, 2, 15000.50),
(10003, 3456789012, 3, 20000.75),
(10004, 4567890123, 4, 25000.25),
(10005, 5678901234, 5, 50000.00);
insert into ContaCorrente
values(19007, 190123456, 19002, 22337.53),
(19006, 190987652, 19001, 5892.95),
(19008, 191234567, 19004, 40569.22),
(19009, 191234568, 19003, 33067.63),
(19010, 190123456, 19005, 27521.77);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(101, 1234567890, 1, 1500.00),
(102, 2345678901, 2, 3000.50),
(103, 3456789012, 3, 750.00),
(104, 4567890123, 4, 1200.75),
(105, 5678901234, 5, 4500.20);
insert into CONTACORRENTE ( NUM_AGE, NUM_CC, ID_CLI, SALDO)
values (05001, 0500012345, 05006, 5.000),
(05002, 0500012312, 05007, 2.397),
(05003, 0500012123, 05008, 1.997),
(05004, 0500013232, 05009, 10.166),
(05005, 0500087653, 05010, 0);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(091, 1000000001, 091, 1500.00),
(091, 1000000002, 092, 2500.50),
(092, 2000000001, 093, 3000.00),
(093, 3000000001, 094, 400.75),
(094, 4000000001, 095, 600.00);
INSERT INTO CONTACORRENTE (NUM_AGE, NUM_CC, ID_CLI, SALDO) VALUES
(23001, 2200000001, 22001, 3000.00),
(23002, 2200000002, 22002, 2500.13),
(23003, 2200000003, 22003, 1500.25),
(23004, 2200000004, 22004, 723.79),
(23005, 2200000005, 22015, 600.00);

-- INSERTS DE USUÁRIOS
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC)
VALUES ('joao_11', 'japa2024!', 11001, 1100001),
	   ('ana_11', '1234Corinthians', 11002, 1100002),
	   ('Pedro_11', 'oieusou122!', 11003, 1100003),
	   ('lojaABC_11', 'loja2023@', 11004, 1100004),
	   ('Luiza_11', 'senhadaLuiza', 11005, 1100005);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('joao.silva_01', 'senha123', 01001, 0100000001),
('maria.oliveira_01', 'senha456', 01002, 0100000002),
('carlos.pereira_01', 'senha789', 01003, 0100000003),
('ana.souza_01', 'senha101', 01004, 0100000004),
('pedro.lima_01', 'senha202', 01005, 0100000005);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('mike_240001', 'senha123', 2401, 1234567890),
('rodrigo_240002', 'senha456', 2402, 2345678901),
('carlinhos_240003', 'senha789', 2403, 3456789012),
('victor_240004', 'senha101', 2404, 4567890123),
('lucas_240005', 'senha202', 2405, 5678901234);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('rodrigo_18', 'asd453', 18001, 1800000001);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('Fernanda_18', 'ghf987', 18002, 1800000002);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('Tiago_18', 'oiy213', 18003, 1800000003);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('Vanessa_18', 'bvn483', 18004, 1800000004);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES ('Lucas_18', 'sop940', 18005, 1800000005);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('bentinho', 'senha123', 02001, 1234567890),
('capitu', 'segredo987', 02002, 2345678901),
('rita', 'amor456', 02003, 3456789012),
('macunaima', 'indio123', 02004, 4567890123),
('iracema', 'guerreira789', 02005, 5678901234);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC)
VALUES 
('user1', 'senha1', 1, 10001),
('user2', 'senha2', 2, 20002),
('user3', 'senha3', 3, 30003),
('user4', 'senha4', 4, 40004),
('user5', 'senha5', 5, 50005);
INSERT INTO Usuarios (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('ana.silva_07', 'abc321', 07001, 07001),
('carlos.souza_07', 'def456', 07002, 07002),
('maria.oliveira_07', 'ghi789', 07003, 07003),
('roberto.lima_07', 'jkl098', 07004, 07004),
('fernanda.costa_07', 'mno123', 07005, 07005);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC)
VALUES ('maria_22', 'senhaForte2024!', 22001, 2200001),
       ('ricardo_22', 'senhaRicardo#21', 22002, 2200002),
       ('fernanda_22', 'fernanda@2023', 22003, 2200003),
       ('lojaXYZ_22', 'lojaXYZ@2023', 22004, 2200004),
       ('carlos_22', 'carlitos123!', 22005, 2200005);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC)
VALUES 
('ana_12', '8pFz7k4a', 15001, 9876543210),
('pericles_70', 'T4x9sW2e', 15002, 8765432109),
('carla_90', 'n7G5lP2x', 15003, 7654321098),
('jose_82', 'K3mY8v1t', 15004, 6543210987),
('patricia_85', 'R9sF4q8w', 15005, 5432109876);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC)
VALUES
('luke_skywalker', 'forca123', 10001, 1234567890),
('leia_organa', 'rebelião456', 10002, 2345678901),
('han_solo', 'falcao789', 10003, 3456789012),
('chewbacca', 'wookiee321', 10004, 4567890123),
('darth_vader', 'ladonegro', 10005, 5678901234);
insert into Usuarios
values('JoaoSilva@19', 'Senha_123', 19006, 190987652),
('AnaSilva@19', 'Senha_234', 19007, 190123456),
('JoaoPereira@19', 'Senha_345', 19009, 191234568),
('CarlosOliveira@19', 'Senha_456', 19008, 191234567),
('JulianaCosta@19', 'Senha_567', 19010, 190123456);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('luiz123', 'senhaLuiz', 101, 1234567890),
('ana456', 'senhaAna', 102, 2345678901),
('marcos789', 'senhaMarcos', 103, 3456789012),
('tatiane012', 'senhaTatiane', 104, 4567890123),
('rafael345', 'senhaRafael', 105, 5678901234);
insert into USUARIOS (ID, SENHA, NUM_AGE, NUM_CC)
values ('Caio_05', 'caio1234', 05001, 0500012345),
('Isabella_05', 'isabella1234', 05002, 0500012312),
('Gabriel_05', 'gabriel1234', 05003, 0500012123),
('Larissa_05', 'larissa1234', 05004, 0500013232),
('Felipe_05', 'felipe1234', 05005, 0500087653);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('091', 'senha123', 091, 1000000001),
('092', 'senha456', 091, 1000000002),
('093', 'senha789', 092, 2000000001),
('094', 'senha321', 093, 3000000001),
('095', 'senha654', 094, 4000000001);
INSERT INTO USUARIOS (ID, SENHA, NUM_AGE, NUM_CC) VALUES
('murilo_22', 'S3nh@M@rilo!', 23001, 2200000001),
('bruna_22', 'Brun@G0ncalves123', 23002, 2200000002),
('pedro_22', 'P3dr0@M3lo!', 23003, 2200000003),
('thiago_22', 'T!h@goC4rvalho', 23004, 2200000004),
('agatha_22', 'Ag@thaD!as2024', 23005, 2200000005);

-- INSERTS DE MOVIMENTAÇÃO DE CONTAS CORRENTES
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES (11001, 1100001, '19-07-2024', 'dc1101', 'D', 1101, 'Pix realizado', 10.50, 140.45),
	   (11002, 1100002, '17-09-2024', 'dc1102', 'C', 1102, 'Pix Recebido', 100.00, 1100.34),
	   (11003, 1100003, '12-03-2024', 'dc1103', 'D', 1103, 'Saque Realizado',1000.00, 122424.30),
	   (11004, 1100004, '10-08-2024', 'dc1104', 'C', 1104, 'Deposito Realizado', 50.00, 82.50),
	   (11005, 1100005, '12-10-2024', 'dc1105', 'D', 1105, 'Saque Realizado', 233.10, -266.20);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(01001, 0100000001, '2024-09-01', '010001', 'D', 0102, 'Saque no Caixa Eletrônico', 200.00, 1300.75),
(01002, 0100000002, '2024-09-01', '010002', 'C', 0101, 'Depósito por Cheque', 1000.00, 4000.00),
(01003, 0100000003, '2024-09-02', '010003', 'D', 0102, 'Saque no Caixa Eletrônico', 300.00, 4200.00),
(01004, 0100000004, '2024-09-02', '010004', 'C', 0101, 'Transferência Recebida', 500.00, 3000.50),
(01005, 0100000005, '2024-09-02', '010005', 'D', 0105, 'Pagamento de Boleto', 100.00, 1100.80);	   
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(2401, 1234567890, '15-01-2024 10:00:00', 'DOC001', 'D', 2401, 'Pix realizado', 500.00, 1000.00),
(2402, 2345678901, '20-02-2024 11:30:00', 'DOC002', 'C', 2402, 'Recebimento de proventos', 500.00, 3000.00),
(2403, 3456789012, '10-03-2024 14:45:00', 'DOC003', 'C', 2403, 'Pix recebido', 1200.75, 4401.50),
(2404, 4567890123, '05-04-2024 09:15:00', 'DOC004', 'C', 2404, 'Empréstimo realizado', 800.00, 2600.25),
(2405, 5678901234, '12-05-2024 16:00:00', 'DOC005', 'D', 2405, 'Débito em conta', 1000.00, 3000.00);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES (18001, 1800000001, '15-01-2024 10:30:00', 'DOC181', 'D', 1, 'Transferência entre contas', 200.00, 1300.00);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES (18002, 1800000002, '16-01-2024 14:45:00', 'DOC182', 'C', 2, 'Depósito em caixa', 500.00, 3000.50);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES (18003, 1800000003, '17-01-2024 09:15:00', 'DOC183', 'D', 3, 'Saque em caixa eletrônico', 100.00, 3100.75);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES (18004, 1800000004, '18-01-2024 16:00:00', 'DOC184', 'C', 4, 'Pagamento de cartão', 150.00, 250.00);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES (18005, 1800000005, '19-01-2024 11:20:00', 'DOC185', 'C', 5, 'Pagamento de conta de água', 80.00, 8920.00);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES 
(1, 10001, '2023-09-01', 'D001', 'D', 1, 'Depósito inicial', 1000.00, 2500.00),
(2, 20002, '2023-09-02', 'D002', 'C', 2, 'Saque', 500.00, 2000.50),
(3, 30003, '2023-09-03', 'D003', 'T', 3, 'Transferência', 750.00, 2750.75),
(4, 40004, '2023-09-04', 'D004', 'P', 4, 'Pagamento de boleto', 1000.00, 3500.00),
(5, 50005, '2023-09-05', 'D005', 'C', 5, 'Cobrança de taxa', 150.00, 5350.90);
INSERT INTO Movimentacao (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(07001, 07001, '01-09-2024 10:30:00', 'DOC001', 'D', 1, 'Pix Enviado', 15.00, 3400.00 ),
(07002, 07002, '05-09-2024 14:15:00', 'DOC002', 'D', 2, 'Pagamento de cartão de crédito', 200.00, 7500.00),
(07003, 07003, '06-09-2024 09:00:00', 'DOC003', 'D', 1, 'Pix Enviado', 250, 9200.00),
(07004, 07004, '15-09-2024 18:45:00', 'DOC004', 'D', 4, 'Saque', 150.00, 10000.00),
(07005, 07005, '19-09-2024 08:00:00', 'DOC005', 'C', 3, 'Recebimento', 1000.00, 1900.00);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES (22001, 2200001, '20-07-2024', 'dc2201', 'D', 2201, 'Pix realizado', 15.75, 134.70),
       (22002, 2200002, '25-09-2024', 'dc2202', 'C', 2202, 'Pix Recebido', 200.00, 1300.34),
       (22003, 2200003, '15-03-2024', 'dc2203', 'D', 2203, 'Saque Realizado', 500.00, 122924.30),
       (22004, 2200004, '05-08-2024', 'dc2204', 'C', 2204, 'Depósito Realizado', 75.00, 107.50),
       (22005, 2200005, '18-10-2024', 'dc2205', 'D', 2205, 'Saque Realizado', 150.00, -416.20);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES 
(15001, 9876543210, '2024-09-01', '000001', 'C', 1501, 'Depósito em conta corrente', 5000.00, 5000.00),
(15002, 8765432109, '2024-09-02', '000002', 'D', 1502, 'Saque no caixa eletrônico', 300.00, 1200.00),
(15003, 7654321098, '2024-09-03', '000003', 'C', 1503, 'Transferência recebida', 2000.00, 5500.00),
(15004, 6543210987, '2024-09-04', '000004', 'D', 1504, 'Pagamento de boleto de luz', 800.00, 1700.00),
(15005, 5432109876, '2024-09-05', '000005', 'C', 1505, 'Compra com cartão de débito', 1000.00, 5500.00);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
VALUES
(10001, 1234567890, '19-09-2014', '000001', 'C', 1001, 'Depósito inicial', 5000.00, 15000.00),
(10002, 2345678901, '19-09-2014', '000002', 'D', 1002, 'Transferência para Han', 2000.00, 13000.50),
(10003, 3456789012, '19-09-2014', '000003', 'C', 1003, 'Saque em Curitiba', 3000.00, 23000.75),
(10004, 4567890123, '19-09-2014', '000004', 'D', 1004, 'Pagamento de recompensas', 5000.00, 20000.25),
(10005, 5678901234, '19-09-2014', '000005', 'C', 1005, 'Reembolso Jedi', 10000.00, 60000.00);
insert into Movimentacao
values(19006, 190987652, '19-09-2014', '190001', 'D', 1901, 'Pagamento efetuado', 90.22, 5802.73),
(19006, 190987652, '19-09-2014', '190002', 'D', 1902, 'Pagamento efetuado', 205.30, 5597.43),
(19006, 190987652, '19-09-2014', '190003', 'D', 1903, 'Pagamento efetuado', 180.52, 5416.91),
(19006, 190987652, '19-09-2014', '190004', 'D', 1904, 'Pagamento efetuado', 30.90, 5386.01),
(19006, 190987652, '19-09-2014', '190005', 'D', 1905, 'Pagamento efetuado', 130.90, 5255.11);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(101, 1234567890, '2023-09-01', 'DOC123', 'D', 1, 'Depósito via app', 500.00, 2000.00),
(102, 2345678901, '2023-09-02', 'DOC456', 'C', 2, 'Saque ATM', 1500.00, 1500.50),
(103, 3456789012, '2023-09-03', 'DOC789', 'D', 3, 'Transferência', 750.00, 1500.00),
(104, 4567890123, '2023-09-04', 'DOC012', 'C', 4, 'Pagamento de conta', 200.00, 1000.75),
(105, 5678901234, '2023-09-05', 'DOC345', 'D', 5, 'Consulta Saldo', 0.00, 4500.20);
insert into MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO)
values (05001, 0500012345, '19-09-2024', 'DC0510', 'D', 0502, 'Pagamento Efetuado com sucesso', 1.000, 4.000),
(05002, 0500012312, '10-06-2024', 'DC0511', 'C', 0503, 'Saque Realizado', 397, 2000),
(05005, 0500087653, '18-09-2024', 'DC0512', 'C', 0505, 'Deposito Realizado', 1.000, 1.000),
(05004, 0500013232, '17-08-2024', 'DC0513', 'B', 0505, 'Pix Realizado', 5.166, 5.000),
(05003, 0500012123, '15-09-2024', 'DC0514', 'B', 0505, 'Transferencia Realizada', 997, 1000);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(091, 1000000001, '2024-01-01 10:00:00', '001', 'D', 1, 'Depósito inicial', 1000.00, 2500.00),
(091, 1000000002, '2024-01-02 11:00:00', '002', 'C', 2, 'Saque Caixa', 500.00, 2000.50),
(092, 2000000001, '2024-01-03 12:00:00', '003', 'D', 1, 'Depósito em cheque', 1500.00, 4500.00),
(093, 3000000001, '2024-01-04 13:00:00', '004', 'C', 4, 'Pagamento de contas', 100.00, 300.75),
(094, 4000000001, '2024-01-05 14:00:00', '005', 'D', 1, 'Transferência', 300.00, 900.00);
INSERT INTO MOVIMENTACAO (NUM_AGE, NUM_CC, DATA_MOV, NUM_DOCTO, DEBITO_CREDITO, ID_HIS, COMPL_HIS, VALOR, SALDO) VALUES
(23001, 2200000001, '2024-01-01 10:00:00', '001', 'C', 1, 'Depósito', 500.00, 3500.00),
(23002, 2200000002, '2024-01-02 11:00:00', '002', 'D', 2, 'Saque Caixa', 250.00, 2250.13),
(23003, 2200000003, '2024-01-03 12:00:00', '003', 'C', 1, 'Depósito', 1500.00, 3000.25),
(23004, 2200000004, '2024-01-04 13:00:00', '004', 'D', 4, 'Pagamento no cartão', 50.00, 723.79),
(23005, 2200000005, '2024-01-05 14:00:00', '005', 'C', 1, 'Transferência', 450.00, 1050.00);

