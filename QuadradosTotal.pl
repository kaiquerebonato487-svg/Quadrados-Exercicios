:- encoding(utf8).


quadrado_total([], 0).

quadrado_total([Cabeca|Cauda], Total) :-
    quadrado_total(Cauda, TotalCauda),
    Quadrado is Cabeca * Cabeca,
    Total is Quadrado + TotalCauda.


