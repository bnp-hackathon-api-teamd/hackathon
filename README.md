# hackathon
BP2S API Hackathon Assets Repository

#Actions to have in mind

-Configure global pom.xml with the provided credentials\information

-Setup HEROKU_API_KEY with the provided token to be able to deploy to Heroku cloud account created for the team. 

Have fun, be pragmatic and straight to the point!

#Test routine
1. instalar o python, entre as versões 3.6.9 ~ 3.7.4
2. instalar o pip (gerenciador de dependencias)
3. adicionar ao path..

4.para o projeto rodar:
4.1. usar o power-shell de preferência:
Comandos:
 pip install robotframework
 pip install robotframework-requests

Nota: a libray Collections é default do robot, não precisa de rodar comando pip...

4.2. Testar: o teste é sempre realizado na pasta do projeto, dos arquivos.
Comando para execução do teste:
 robot -d ./results TestCasesAPIParking.robot

Nota1: o comando irá gerar uma pasta com os log do teste numa pasta denominada results que será criada de forma automática na raiz da pasta do projeto.
Nota2: TestCasesAPIParking.robot é o nome do teste que está executando se mudar o nome basta mudar essa instrução.

deve mudar a URL no arquivo resources, para o caso do localhost e também os atributos do tipo chave valor, em: 
&{CAR_01}       ID=1  Title=Value1&{CAR_01} 

MUITO IMPORTANTE: Os espaços entre elementos são no mínimo duplo, senão o teste quebra