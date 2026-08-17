:- encoding(utf8).

% quadrado total de uma lista, sem loop, só caso-base + recursão

% caso base: lista vazia resulta em 0
quadrado_total([], 0).

% caso recursivo: quadrado da cabeça + resultado da cauda
quadrado_total([Cabeca|Cauda], Total) :-
    quadrado_total(Cauda, TotalCauda),
    Quadrado is Cabeca * Cabeca,
    Total is Quadrado + TotalCauda.

% testado no SWI-Prolog:
%   ?- consult('quadrado_total.pl').
%   ?- quadrado_total([1,2,3,4], R).
%   R = 30.
