# Criação de Exceções

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
## Descrição do projeto:

O presente projeto implementa a criação básica de exceções checadas (Checked Exceptions) personalizadas, assim como seu tratamento por um bloco try-catch. Na classe `CepInvalidoExcption`, a exceção é criada, e na classe `FormatadorCep`, o método _formatarCep()_ lança essa exceção caso o CEP informado tenha tamanho diferente de 8 dígitos ou tenha caracteres não numéricos. No método main, um loop é iniciado caso uma exceção seja lançada, exibindo uma mensagem de erro e permitindo ao usuário que tente sucessivamente em caso de erro. Caso o dado tenha sido inserido corretamente, o CEP é formatado e exibido no terminal.

## Exemplo:

#### Input:
> 123456
>
> 12345678

#### Output:

> O CEP deve ter 8 caracteres numéricos. Tente novamente.
Digite seu cep:
> 
> CEP formatado: 12345-678

