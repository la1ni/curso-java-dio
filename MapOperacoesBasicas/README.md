# Operações básicas com Map

Este projeto para fins de estudo busca aperfeiçoar aplicando de forma prática os conhecimentos obtidos a respeito da interface Map e suas classes de implementação,  e . Busca-se demonstrar métodos por ela contidos e operações básicas realizadas nessa Collection a partir dos exercícios descritos a seguir, cada qual em seu respectivo pacote.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Descrições

### 1. Agenda de Contatos

package `AgendaDeContatos`

Foi criada uma classe chamada "AgendaContatos" que utiliza um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Foram implementados os seguintes métodos:

**Métodos:**
- `adicionarContato` adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- `removerContato` remove um contato da agenda, dado o nome do contato.
- `exibirContatos` exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- `pesquisarPorNome` pesquisa um contato pelo nome e retorna o número de telefone correspondente.

### 2. Estoque de Produtos

package `EstoqueDeProdutos`

Foi criada uma classe chamada "EstoqueProdutos" que utiliza um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Foram implementados os seguintes métodos:

**Métodos:**
- `adicionarProduto` adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- `exibirProdutos()` exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()` calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- `obterProdutoMaisCaro()` retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.

### 3. Agenda de Eventos

package `AgendaDeEventos`

1. Agenda de Eventos
   Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

adicionarEvento(LocalDate data, String nome, String atracao): Adiciona um evento à agenda.
exibirAgenda(): Exibe a agenda de eventos em ordem crescente de data.
obterProximoEvento(): Retorna o próximo evento que ocorrerá.