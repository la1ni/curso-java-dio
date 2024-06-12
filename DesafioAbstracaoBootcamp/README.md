# <img align="center" width="40px" src="https://hermes.digitalinnovation.one/assets/diome/logo-minimized.png"> Abstraindo um Bootcamp com Java e Orientação a Objetos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

O desafio aqui foi desenvolver uma estrutura de bootcamp orientada a objetos, no qual possam ser criados cursos e mentorias. Além disso, o dev incrito deve ser capaz de se matricular nesse bootcamp, progredir no curso e calcular seu Xp obtido.

**Classes**

`Bootcamp`: abarca cursos e mentorias

`Conteudo`: classe abstrata que contém métodos e atributos comuns a cursos e mentorias.

`Curso`: herda de Conteudo e implementa sua forma de cálculo de Xp com base na carga horária.

`Dev`: os objetos instanciados a partir desta classe podem se matricular em bootcamps, progredir nos cursos e calcular seu Xp.

`Mentoria`: herda de Conteudo e implementa sua forma de cálculo de Xp.

