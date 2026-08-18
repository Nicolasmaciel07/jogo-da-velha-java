
# 🎮 Jogo da Velha em Java

Projeto desenvolvido em **Java** como atividade prática durante o curso Técnico em Desenvolvimento de Sistemas do IFSul.

O programa simula um jogo da velha para dois jogadores, utilizando uma matriz bidimensional `3x3` para representar o tabuleiro.

## 📋 Sobre o projeto

O jogo possui dois jogadores:

- **Jogador 1:** `X`
- **Jogador 2:** `O`

Os jogadores alternam os turnos escolhendo uma linha e uma coluna para realizar suas jogadas.

O programa verifica automaticamente as condições de vitória e empate.

## 🎯 Funcionalidades

- Exibição do tabuleiro;
- Alternância entre os jogadores;
- Escolha de linha e coluna;
- Validação das posições informadas;
- Impedimento de jogar em uma posição já ocupada;
- Verificação de vitória;
- Verificação de empate;
- Encerramento automático do jogo.

## 🏆 Condições de vitória

O jogador vence quando consegue formar três símbolos iguais:

- Na mesma linha;
- Na mesma coluna;
- Na diagonal principal;
- Na diagonal secundária.

Exemplo:

```text
 X | X | X
-----------
 O |   | O
-----------
   |   |
````

Nesse caso, o **Jogador 1 (X)** venceu.

## 🛠️ Tecnologias e conceitos utilizados

* **Java**
* `Scanner`
* Matriz bidimensional (`char[][]`)
* Estruturas condicionais (`if`, `else if` e `else`)
* Estruturas de repetição (`for` e `while`)
* Variáveis booleanas
* Entrada de dados pelo terminal
* Validação de dados
* Lógica de programação

## 🎮 Como jogar

O programa apresenta o tabuleiro e informa de qual jogador é a vez.

O jogador deve informar a **linha** e a **coluna** da posição onde deseja realizar sua jogada.

As posições do tabuleiro são representadas pelos valores de `0` a `2`.

Exemplo:

```text
Informe a linha (0, 1 ou 2):
1

Informe a coluna (0, 1 ou 2):
2
```

Nesse caso, o jogador escolheu a **segunda linha e a terceira coluna**.

## 📌 Exemplo de execução

```text
   |   |
-----------
   |   |
-----------
   |   |

É a vez do Jogador 1 (X)

Informe a linha (0, 1 ou 2):
0

Informe a coluna (0, 1 ou 2):
0
```

Após algumas jogadas:

```text
 X | O | X
-----------
 O | X |
-----------
   |   | X
```

Resultado:

```text
Fim de jogo! O Jogador 1 (X) venceu!
```

## 🎓 Objetivo

O objetivo deste projeto foi praticar conceitos fundamentais de programação em Java, especialmente:

* Matrizes;
* Estruturas condicionais;
* Estruturas de repetição;
* Variáveis booleanas;
* Entrada e validação de dados;
* Desenvolvimento de lógica de programação;
* Criação de uma aplicação interativa no terminal.

## 👨‍💻 Autor

**Nícolas Maciel Lemos Batista**

Estudante do Técnico em Desenvolvimento de Sistemas — IFSul



