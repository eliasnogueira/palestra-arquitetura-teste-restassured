# Arquitetura de Testes com RestAssured
Este repositório possui diferentes estruturação de projetos para uma API REST utilizando RestAssured.

## Pré condicões

Cada projeto possui um projeto de backend relacionado, logo você precisará baixá-lo e executá-lo.
Siga atentamente as pré-condições de cada projeto para que você possa executar os testes em cada um.

### Gerais
Você precisará dos seguintes softwares para executar este aplicação:

* Java JDK 11+
* Maven configurado no seu classpath

### projeto-unificado

1. Efetue o clone do projeto [https://github.com/eliasnogueira/credito-api](https://github.com/eliasnogueira/credito-api)
2. Navegue até a pasta do projeto pelo Terminal / Prompt de Comando
3. Execute o seguinte comando: `mvn spring-boot:run`
4. Aguarde o seguinte texto aparecer: Aplicação iniciada! Bons testes!
5. Acesse a API através do link http://localhost:8088
6. Acesse a documentação através do link: http://localhost:8088/swagger-ui.html

### restricoes-test

> Antes de iniciar este projeto verifique se o **projeto-unificado** esta ativo. Se sim, pare o projeto. Ambos usam a mesma porta.

1. Efetue o clone do projeto [https://github.com/eliasnogueira/restricao-credito-api](https://github.com/eliasnogueira/restricao-credito-api)
2. Navegue até a pasta do projeto pelo Terminal / Prompt de Comando
3. Execute o seguinte comando: `mvn spring-boot:run`
4. Aguarde o seguinte texto aparecer: Aplicação iniciada! Bons testes!
5. Acesse a API através do link http://localhost:8088
6. Acesse a documentação através do link: http://localhost:8088/swagger-ui.html

### simulacoes-test

1. Efetue o clone do projeto [https://github.com/eliasnogueira/simulacao-credito-api](https://github.com/eliasnogueira/simulacao-credito-api)
2. Navegue até a pasta do projeto pelo Terminal / Prompt de Comando
3. Execute o seguinte comando: `mvn spring-boot:run`
4. Aguarde o seguinte texto aparecer: Aplicação iniciada! Bons testes!
5. Acesse a API através do link http://localhost:8089
6. Acesse a documentação através do link: http://localhost:8088/swagger-ui.html

## Projetos Client

Em ambos os projetos **client** não esqueca que, primeiro, você deve executar o seguinte comando na pasta do projeto:
```
mvn clean install
```

Este comando gera o artefato (arquivo `.jar`) para ser utilizado nos projetos de teste relacionados ao client.
