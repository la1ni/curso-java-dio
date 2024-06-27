# Spring API com Integração ViaCep

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

## Descrição do Projeto

Este projeto é uma API RESTful desenvolvida com Spring Boot que realiza operações CRUD (Create, Read, Update, Delete) para gerenciar clientes. Outro ponto explorado foi a integração com a API pública ViaCep para obtenção automática do endereço completo a partir de um CEP fornecido.

A API demonstra como o Spring abstrai padrões de projeto comuns, tais como:
- **Facade**: Integração entre subsistemas (API da ViaCep).
- **Singleton**: Gerenciamento de dependências com `@Autowired`.
- **Strategy**: Uso de interfaces no `Repository`.

## Funcionalidades

- **Adicionar Cliente**: Adiciona um novo cliente com os dados fornecidos. O endereço é obtido automaticamente ao informar apenas o CEP.
- **Remover Cliente**: Remove um cliente existente pelo seu ID.
- **Exibir Todos os Clientes**: Retorna uma lista com todos os clientes cadastrados.
- **Exibir Cliente por ID**: Retorna os dados de um cliente específico pelo seu ID.
- **Atualizar Cliente**: Atualiza os dados de um cliente existente.


## Endpoints

### Adicionar Cliente
- **URL**: `/clientes/{id}`
- **Método**: `POST`
- **Body**:
    ```json
    {
        "nome": "João Silva",
        "endereco": {
          "cep": "01001000"
      }
  }
    ```

### Remover Cliente
- **URL**: `/clientes/{id}`
- **Método**: `DELETE`

### Exibir Todos os Clientes
- **URL**: `/clientes`
- **Método**: `GET`

### Exibir Cliente por ID
- **URL**: `/clientes/{id}`
- **Método**: `GET`

### Atualizar Cliente
- **URL**: `/clientes/{id}`
- **Método**: `PUT`
- **Body**:
    ```json
    {
        "endereco": {
          "cep": "01001000"
      }
  }
    ```

## Padrões de Projeto Utilizados

### Facade
A integração com a API ViaCep é um exemplo de padrão Facade, pois encapsula a complexidade de interação com um subsistema externo, fornecendo uma interface simples para o cliente.

### Singleton
O uso da anotação `@Autowired` demonstra o padrão Singleton, onde o Spring gerencia a criação de instâncias de beans, garantindo que apenas uma instância de cada bean seja criada e compartilhada.

### Strategy
A utilização de interfaces no `Repository` para acessar o banco de dados é um exemplo do padrão Strategy. As implementações específicas são injetadas em tempo de execução, permitindo a flexibilidade e a reutilização de código.

# Documentação

A API foi documentada utilizando OpenAPI, facilitando a visualização e interação com os endpoints. A documentação gerada fornece uma interface amigável para explorar e testar as funcionalidades da API diretamente no navegador.