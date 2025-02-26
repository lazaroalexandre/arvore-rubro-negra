# Árvore Rubro Negra 

O projeto tem como objetivo exemplificar e comparar o uso de árvores rubro negras em uma aplicação com 100.000 (cem mil) produtos cadastrados, nos quais serão filtrados por maior e menor preço. 

Dessa forma, foi criado 2 (duas) branches para a comparação de desempenho do sistema, no qual na "tree" foi utilizado árvores rubro negras, enquanto na "no-tree" foram utilizadas listas normais.

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


## Conclusão

Ao finalizar o sistema, foram realizados testes com e sem o uso de árvores. Veja o resultado de um desses testes ao filtrar produtos acima de R$ 100,00:

**Sem árvores**:

	"total": 10139,
	"nanoSeconds": 2647829

**Com árvores**:

	"total": 10223,
	"nanoSeconds": 11722

Por fim, com base no experimento, o uso de árvores rubro negras teve um desempenho muito superior, chegando uma diferença maior que 225 vezes, ao filtrar preços de produtos comparado ao uso de listas simples.

## Autor

Olá, sou o Lázaro Alexandre, um desenvolvedor full stack e futuro analista de sistemas apaixonado por transformar vidas através da inovação tecnológica.

Para mais informações, acesse o meu portifólio: https://homolazarus.netlify.app/

Estarei te aguardando ^-^
