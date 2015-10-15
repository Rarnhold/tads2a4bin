# Tecnologia em Analise e Desenvolvimento de Sistema

2º Ano, 4º Bimestre - 2015 [Empresa](Http/www.univel.br)

#13 de outubro de 2015

*Criação do repositorio
*Criação do projeto
*Criação do Cliente e DAO

#15 de outubro de 2015

*Instalação do My Sql
*Endereço  = 192.168.101.10
*Username  = jasper
*Passoword = jasper
*Port      = 3306

Utilizando o TIBCO jaspersoftstudio (server para desenhar os layolts do relatórios)
Caminho na máquina: C:\Users\Arnhold\Documents\PROGRAMAS\TIBCOJaspersoftStudio-6.1.1.final-windows-x86_64\jaspersoftstudio Jaspersoft Studio.exe

Após execução do aplicativo
Acessar DataAdapters - Botão auxiliar mouse - create dataAdapter - Escolher: Database JDBC connection - Next>
Add(localizar a pasta de repositório na pasta do usuario (C:\Users\Arnhold\.m2\repository\mysql\mysql-connector-java\5.1.37) selecionar e abrir o arquivo.
--Caso não possua a arquivo de conexão verificar no passo abaixo no Eclipse

Voltar para aba Database Location 
Inserir nome da conexão
Escolher drive conforme conexão com o banco = (com.mysql.jdbc.Driver)
jdbc: jdbc:mysql://192.168.101.10/employees (Ip do caminho do banco / Nome do banco)
Username  = jasper
Passoword = jasper
Finish
------------Escolhendo o Formato de Relatório----------

File - New - Jasper Report
Escolha o formato do relatório - Next - Parte Inferior tela (File Name do Relatório) - Next -Data Adapter (escolher a conexão do banco) - Fazer o Sql - Next - Finish
Verificar como relatório ficará 

Para gerar o arquivo para utilizarmos(Projet - Build all)

------------No Eclipse----------

Acessar projeto Eclipse arquivo pom.xml
Inserir a dependecia a conexão ao banco que desejar (neste caso MySql)
Para localizar a dependencia acessar no navegado de Internet o Maven Central e localizar a conexão Mysql 
(http://search.maven.org/#artifactdetails%7Cmysql%7Cmysql-connector-java%7C5.1.37%7Cjar)
 
----------------------
Após ter baixado a dependecia verificar na pasta do Usuario(C:\Users\Arnhold\.m2\repository) verificar se existe a pasta da conexão com o banco de dados (C:\Users\Arnhold\.m2\repository\mysql\mysql-connector-java\5.1.37)
Após verificado que existe o arquivo voltamos para o TIBCO

----------------------

