# Tecnologia em Analise e Desenvolvimento de Sistema

2� Ano, 4� Bimestre - 2015 [Empresa](Http/www.univel.br)

#13 de outubro de 2015

*Cria��o do repositorio
*Cria��o do projeto
*Cria��o do Cliente e DAO

#15 de outubro de 2015

*Instala��o do My Sql
*Endere�o  = 192.168.101.10
*Username  = jasper
*Passoword = jasper
*Port      = 3306

Utilizando o TIBCO jaspersoftstudio (server para desenhar os layolts do relat�rios)
Caminho na m�quina: C:\Users\Arnhold\Documents\PROGRAMAS\TIBCOJaspersoftStudio-6.1.1.final-windows-x86_64\jaspersoftstudio Jaspersoft Studio.exe

Ap�s execu��o do aplicativo
Acessar DataAdapters - Bot�o auxiliar mouse - create dataAdapter - Escolher: Database JDBC connection - Next>
Add(localizar a pasta de reposit�rio na pasta do usuario (C:\Users\Arnhold\.m2\repository\mysql\mysql-connector-java\5.1.37) selecionar e abrir o arquivo.
--Caso n�o possua a arquivo de conex�o verificar no passo abaixo no Eclipse

Voltar para aba Database Location 
Inserir nome da conex�o
Escolher drive conforme conex�o com o banco = (com.mysql.jdbc.Driver)
jdbc: jdbc:mysql://192.168.101.10/employees (Ip do caminho do banco / Nome do banco)
Username  = jasper
Passoword = jasper
Finish
------------Escolhendo o Formato de Relat�rio----------

File - New - Jasper Report
Escolha o formato do relat�rio - Next - Parte Inferior tela (File Name do Relat�rio) - Next -Data Adapter (escolher a conex�o do banco) - Fazer o Sql - Next - Finish
Verificar como relat�rio ficar� 

Para gerar o arquivo para utilizarmos(Projet - Build all)

------------No Eclipse----------

Acessar projeto Eclipse arquivo pom.xml
Inserir a dependecia a conex�o ao banco que desejar (neste caso MySql)
Para localizar a dependencia acessar no navegado de Internet o Maven Central e localizar a conex�o Mysql 
(http://search.maven.org/#artifactdetails%7Cmysql%7Cmysql-connector-java%7C5.1.37%7Cjar)
 
----------------------
Ap�s ter baixado a dependecia verificar na pasta do Usuario(C:\Users\Arnhold\.m2\repository) verificar se existe a pasta da conex�o com o banco de dados (C:\Users\Arnhold\.m2\repository\mysql\mysql-connector-java\5.1.37)
Ap�s verificado que existe o arquivo voltamos para o TIBCO

----------------------

#20 de outubro de 2015
Copiado a classe SimpleReport do *(https://github.com/fdagostini/tads2a4bim/blob/master/jaspersample/src/main/java/br/univel/SimpleReport.java)

Copiado as dependencias do projeto (https://github.com/fdagostini/tads2a4bim/blob/master/jaspersample/pom.xml)

Acessado o aplicativo TIBCO > File > New > Jasper Report 
Selecionar pagina em Branco > inserir nome simples > Finish
Inserir > Text Field para os campos; 
Inserir na palheta Outline Parameters > parametros que o programa possa enviar para o relat�rio;
No projeto  do Relat�rio > Superior > Selecionar > Compile Report > Ir� gerar o nome do relat�rio modo binario .jasper

Verificar pasta do usuario (C:\\Users\\Arnhold\\JaspersoftWorkspace\\MyReports\\) > ter� o arquivo que acabou de gerar;

#22 de outubro de 2015

Deve seguir uma determinada sequencia sendo ela a seguinte:

1 - Definir o modelo padr�o para as telas do sistema fazendo uma tela abstract, para isso deve se criar um JPanel e inserir o abstract entre o tipo da classe e o nome da class como exemplo: public abstract class AbstratcPanel

1.1 - Dever� possuir um m�todo Abstrato ex: protected abstract void configuraMiolo();
1.2 - No final da Class dever� possuir a chamada do m�todo;

2 - Definir os modelos de telas criando um JPanel para cada Tipo de cadastro (PainelCadastroCliente)

2.1 - Dever� alterar a variavel para o tipo protected

3 - Definir um Novo Jpanel para a chamada da tela de Cadastro extendendo tela abstrata do passo 1

3.1 - O seu m�todo dever� chamar o m�todo super();  
3.2 - Ap�s Extender da Tela Abastrata 1 dever� implementar o M�todo criado no passo 1.1

* Implementar com o super.add(new PainelCadastroCliente(),BorderLayout.CENTER);
*super.add ( new [Tela que contem os campos()], define a onde a tela ira abrir);

----------------------
AbstratcPanel         = Moldura
PainelCadastroCliente = Miolo da Aplica��o
TelaCadastroCliente   = extende da AbstraticPanel 

TelaPrincipal         = definido em cada bot�o a chamada do m�todo para abertura e fechamento da tela
					   						Nome da Aba 	  , dever� definir como variavel local o Jpanel
* Abertura   da tela:  tabbedPane.addTab("Cadastro de Cliente", new TelaCadastroCliente() {});

* Fechamento da tela: 






