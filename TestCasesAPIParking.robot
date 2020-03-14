*** Settings ***
Documentation   Documentação da API: https://fakerestapi.azurewebsites.net/swagger/ui/index#!/Books
Resource        ResourceAPI.robot
Suite Setup     Conectar a API

*** Test Case ***
Cadastrar um novo carro
    Cadastrar um novo carro

Buscar um carro específico (GET em um carro específico)
    Requisitar carro cujo id: "1"
    Conferir o status code    200
    Conferir o reason   OK
    Conferir se retorna todos os dados corretos do carro 1

Buscar a listagem de todos os carros (GET em todos os carros)
    Requisitar todos os carros estacionados
    Conferir o status code    200
    Conferir o reason   OK
    Conferir se retorna uma lista com "1" carros

