# <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> Criando um Banco Digital com Java e Orientação a Objetos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

O desafio aqui foi desenvolver uma estrutura de banco orientada a objetos, no qual o cliente possa ter dois tipos de conta (corrente e poupança), e realizar movimentações financeiras através delas. 

**Classes**

`Conta`: classe abstrata que implementa os métodos abstratos comuns aos dois tipos de conta.

`ContaCorrente`: permite ao cliente sacar e depositar dinheiro, assim como transferir dinheiro para outra conta, seja ela corrente ou poupança.

`ContaPoupanca`: permite ao cliente sacar e depositar dinheiro, assim como receber dinheiro de outra conta, via transferência.

`Banco`: Possui métodos que perimtem a criação e gerenciamento de objetos das classes ContaCorrente e ContaPoupança.

`Cliente`: Possui os atributos que um cliente deve ter, assim como métodos para validar tais atributos. Trata de eventuais exceções.

`CpfInvalidoException`: Cria a exceção CpfInvalidoException, evitando que dados inválidos sejam inseridos.

**Interface**

`InterfaceConta`: define o contrato dos métodos implementados por Conta.