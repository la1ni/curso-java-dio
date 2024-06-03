# Operações básicas com List

Este projeto para fins de estudo busca aperfeiçoar aplicando de forma prática os conhecimentos obtidos a respeito da interface List e sua classe de implementação, ArrayList. Busca-se demonstrar métodos por ela contidos e operações básicas realizadas nessa Collection a partir dos exercícios descritos a seguir, cada qual em seu respectivo pacote.


## Descrições

### 1. Lista de Tarefas

package `ListaDeTarefas`

Criada a classe Tarefa, cujos objetos são manipulados por intermédio da classe ListaTarefas, que permite por meio de seus métodos `adicionarTarefa(String descricao)`, `removerTarefa(String descricao)`, `obterNumeroTotalTarefas()` , `obterDescricoesTarefas()` adicionar, excluir, contar e exibir as tarefas da lista.

### 2. Catálogo de Livros

package `CatalogoDeLivros`

A classe CatalogoLivros é capaz de manipular objetos da classe Livro, os criando e fazendo buscas destes por autor, ano de lançamento, e título por meio dos métodos
`adicionarLivro(String titulo, String autor, int anoPublicacao)`,
`pesquisarPorAutor(String autor)`, `pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)`, `pesquisarPorTitulo(String titulo)`.

### 3. Ordenação de Pessoas

package `OrdenacaoDePessoas`

A classe OrdenacaoPessoas é manipula objetos da classe Pessoa. Por meio daquela, eles podem ser criados e ordenados por idade e altura, por meio das funcionalidades Comparable e Comparator respectivamente.



