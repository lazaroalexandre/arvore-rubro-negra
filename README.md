# Árvore Rubro Negra 

O projeto tem como objetivo exemplificar e comparar o uso árvores rubro negras em uma aplicação com 100.000 (cem mil) produtos cadastrados, nos quais serão filtrados por maior e menor preço. 

Dessa forma, foi criado 2 (duas) branches para a comparação de desempenho do sistema, no qual na "tree" foi utilizado árvores rubro negras, enquanto na no-tree foi utilizada listas normais.

## Tecnologias usadas

- Spring - Java

## Configurações em localhost
    
  - instale o JDK21; 
  - Instale o Maven na sua máquina;


## Dependências implantadas

- Spring Web
- Lombok
- Spring Boot DevTools

## Inicialização

### No Linux
        
  - Execute o comando para limpar e reconstruir o projeto spring no linux:
    - mvn clean package
    
  - Execute o comando para rodar o projeto no linux:
    - mvn spring-boot:run


### No Windows

  - Execute o comando para limpar e reconstruir o projeto spring no windows:
    -  ./mvnw clean package
        
  - Execute o comando para rodar o projeto no windows:
    - ./mvnw spring-boot:run

## Endpoints

[endpoints.json](./endpoints.json)

## Autor

Olá, sou o Lázaro Alexandre, um desenvolvedor full stack e futuro analista de sistemas apaixonado por transformar vidas através da inovação tecnológica.

Para mais informações, acesse o meu portifólio: https://homolazarus.netlify.app/

Estarei te aguardando ^-^