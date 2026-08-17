:- encoding(utf8).

% soma dos quadrados de uma lista, sem loop, só caso-base + recursão

% caso base: lista vazia soma 0
soma_quadrados([], 0).

% caso recursivo: quadrado da cabeça + soma da cauda
soma_quadrados([Cabeca|Cauda], Soma) :-
    soma_quadrados(Cauda, SomaCauda),
    Quadrado is Cabeca * Cabeca,
    Soma is Quadrado + SomaCauda.

% testado no SWI-Prolog:
%   ?- consult('soma_quadrados.pl').
%   ?- soma_quadrados([1,2,3,4], R).
%   R = 30.
