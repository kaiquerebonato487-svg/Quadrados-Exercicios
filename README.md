# Soma dos Quadrados nos Três Paradigmas

Soma dos quadrados de uma lista, implementada em OO, Lógico (Prolog) e Funcional (Java Streams).
Pra `[1, 2, 3, 4]` o resultado é `30`. Testei as três e deram certo.

```
oo/         SomaQuadrados.java + Main.java
logico/     soma_quadrados.pl
funcional/  SomaQuadradosFuncional.java
```

## Comparação

**Raciocínio em cada paradigma.** No OO pensei em "que objeto existe e o que ele sabe fazer" —
virou uma classe que guarda a lista e sabe se somar. No funcional pensei em transformação: eleva ao
quadrado, depois soma. No lógico não pensei em passos nenhuma vez, só em "o que é verdade" (soma da
lista vazia é 0, soma do resto é tal coisa).

**Menos tradução mental:** o funcional. `map` + `reduce` é quase uma cópia do enunciado. O lógico
fica curto mas só depois que você já pegou o jeito de pensar em caso-base/recursão. O OO foi o que
mais deu trabalho, porque antes de chegar na soma já tem que decidir classe, construtor, público vs
privado.

**Comunica a intenção mais rápido de ler:** o Prolog — as duas cláusulas já são a definição do
problema. O funcional vem logo atrás. O OO é o que demora mais, precisa ler uns três métodos pra
entender o que tá acontecendo.

### Tabela

| Paradigma | Linhas efetivas* | Conceitos novos |
|---|---|---|
| OO (Java) | 17 | classe, construtor, atributo privado, método privado/público, laço `for` |
| Lógico (Prolog) | 5 | fato/cláusula, unificação de lista, recursão, operador `is` |
| Funcional (Streams) | 7 | `stream()`, lambda, `map`, `reduce`, `Integer::sum` |


O Prolog ganha em número de linhas, mas os conceitos são mais estranhos pra quem só programou
imperativo. O funcional fica no meio, com conceitos mais familiares. O OO é o mais longo porque paga
um "custo de organização" que só compensa em projeto grande.
