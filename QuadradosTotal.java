import java.util.List;

// classe que guarda a lista e sabe calcular a soma dos quadrados dela
public class SomaQuadrados {

    private final List<Integer> numeros;

    public SomaQuadrados(List<Integer> numeros) {
        this.numeros = numeros;
    }

    // método privado, ninguém de fora precisa saber que ele existe
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
