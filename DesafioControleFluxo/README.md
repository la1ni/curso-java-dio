# Desafio Controle de Fluxo

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
## Descrição do projeto:

O presente projeto implementa a criação básica de exceções checadas (Checked Exceptions) personalizadas, assim como seu tratamento por um bloco try-catch. Na classe `ParametrosInvalidosException`, a exceção é criada, e na classe `Contador`, o método _contar()_ lança essa exceção caso o segundo número digitado pelo usário seja maior que o primeiro. No método main, um loop é iniciado caso o programa não incorra em exceção, exibindo na tela números de 1 até a diferença entre o primeiro e o segundo parâmetros digitados no terminal. Caso a exceção seja lançada, o programa é encerrado informando que o primeiro parâmetro deve ser maior que o segundo.

## Exemplo:

#### Input:
> 5
>
> 6

#### Output:

> O primeiro parâmetro deve ser maior que o segundo
