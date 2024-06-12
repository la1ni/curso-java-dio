# Desafios do Módulo de Programação Orientada a Objetos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Desafio 1:
`RegistroTransacoes`

O programa gerencia o saldo de uma conta bancária com base nas transações informadas pelo usuário. Ele solicita um saldo inicial, o número de transações a serem realizadas e, para cada transação, o tipo (depósito ou saque) e o valor. Ao final, exibe o saldo final e a lista de transações.

## Desafio 2:
`RegistroTransacoesComStream`

Aprimoramento do Desafio 1, utilizando a Stream API para processar a collection que armazena as transções de forma mais eficaz.

## Desafio 3:
`MainContaBancaria`

Este programa em Java representa uma conta bancária usando programação orientada a objetos (POO). Ele inclui uma classe `ContaBancaria` com um construtor para iniciar a conta com um saldo inicial. O programa solicita ao usuário o saldo inicial da conta e permite realizar transações de depósito e saque. A classe contém métodos para realizar essas transações, atualizando o saldo da conta. Após cada transação, o saldo atual é exibido. Se o valor do saque for maior que o saldo disponível, o programa informa "Saldo insuficiente. Saque não realizado." Este programa aplica os princípios básicos de POO e a manipulação de dados em Java.

## Desafio 4:
`Poupanca`

A `ContaPoupanca` herda da classe `ContaBancariaPai`, recebendo parâmetros no construtor além dos da classe pai e exibindo, após inseridas, todas as infomações ao usuário via terminal de forma clara e legível.

## Desafio 5:
`DesafioCofre`

Este sistema desenvolvido em Java permite criar dois tipos de cofres seguros: um Cofre Digital, que é aberto por senha, e um Cofre Físico, que é aberto por chave.
O programa solicita ao usuário que escolha o tipo de cofre a ser criado: "digital" ou "físico". Se selecionado o tipo "digital", o programa solicita a senha e a confirmação da senha (ambas compostas apenas por números), e verifica se a senha digitada está correta. Para o tipo "físico", nenhuma outra entrada é necessária.