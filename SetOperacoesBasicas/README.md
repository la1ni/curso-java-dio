# Operações básicas com Set

Este projeto para fins de estudo busca aperfeiçoar aplicando de forma prática os conhecimentos obtidos a respeito da interface Set e suas classes de implementação, HashSet e TreeSet. Busca-se demonstrar métodos por ela contidos e operações básicas realizadas nessa Collection a partir dos exercícios descritos a seguir, cada qual em seu respectivo pacote.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Descrições

### 1. Set de Convidados

package `ConjuntoDeConvidados`

Foi criada uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Foram implementados os seguintes métodos:

**Métodos:**
- `adicionarConvidado` adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite` remove um convidado do conjunto com base no código do convite.
- `contarConvidados` conta o número total de convidados no Set.
- `exibirConvidados` exibe todos os convidados do conjunto.

### 2. Agenda de Contatos

package `AgendaDeContatos`

Foi criada uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome (id) e número de telefone. Foram implementados os seguintes métodos:

**Métodos:**
- `adicionarContato` adiciona um contato à agenda.
- `exibirContatos` exibe todos os contatos da agenda.
- `pesquisarPorNome` pesquisa contatos pelo nome e retorna um conjunto com os contatos encontrados.
- `atualizarNumeroContato` atualiza o número de telefone de um contato específico.

### 3. Cadastro de Produtos

package `CadastroDeProdutos`

Foi criada uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Foram implementados os seguintes métodos:

**Métodos:**
- `adicionarProduto` adiciona um produto ao cadastro.
- `exibirProdutosPorNome` exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco` exibe todos os produtos do cadastro em ordem crescente de preço.

