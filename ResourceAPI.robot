
*** Settings ***
Documentation   Documentação da API: https://name.xx/swagger/ui
Library         RequestsLibrary
Library         Collections

*** Variable ***
${URL_API}      https://nomeparking.heroku-app.com/cars
&{CAR_01}       ID=1 Title=Value1

*** Keywords ***
####SETUP E TEARDOWNS
Conectar a API
    Create Session    parkingAPI    ${URL_API}
    ${HEADERS}     Create Dictionary    content-type=application/json
    Set Suite Variable    ${HEADERS}

#### Ações
Requisitar todos os carros estacionados
    ${RESPOSTA}    Get Request    parkingAPI    cars
    Log            ${RESPOSTA.text}
    Set Test Variable    ${RESPOSTA}

Requisitar carro cujo id: "${ID_CARRO}"
    ${RESPOSTA}    Get Request    parkingAPI    cars/${ID_CARRO}
    Log            ${RESPOSTA.text}
    Set Test Variable    ${RESPOSTA}

Cadastrar um novo carro
    ${RESPOSTA}    Get Request   parkingAPI    car 
    ...                           data={"ID": ${CAR_01.ID},"Title": "${CAR_01.Title}"
    Log            ${RESPOSTA.text}
    Set Test Variable    ${RESPOSTA}

#### Conferências
Conferir o status code
    [Arguments]      ${STATUSCODE_DESEJADO}
    Should Be Equal As Strings    ${RESPOSTA.status_code}    ${STATUSCODE_DESEJADO}

Conferir o reason
    [Arguments]    ${REASON_DESEJADO}
    Should Be Equal As Strings    ${RESPOSTA.reason}     ${REASON_DESEJADO}

Conferir se retorna uma lista com "${QTDE_CARROS}" carros
    Length Should Be      ${RESPOSTA.json()}     ${QTDE_CARROS}

Conferir se retorna o carro corretos de id 1
    Dictionary Should Contain Item    ${RESPOSTA.json()}    ID              ${CAR_01.ID}
    Dictionary Should Contain Item    ${RESPOSTA.json()}    Title           ${CAR_01.Title}