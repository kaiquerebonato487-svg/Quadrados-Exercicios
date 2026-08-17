import java.util.List;

public class QuadradoTotal {

    private final List<Integer> numeros;

    public QuadradoTotal(List<Integer> numeros) {
        this.numeros = numeros;
    }

    private int quadrado(int n) {
        return n * n;
    }

    public int calcular() {
        int soma = 0;
        for (int numero : numeros) {
            soma += quadrado(numero);
        }
        return soma;
    }
}
