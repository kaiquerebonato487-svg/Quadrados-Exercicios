import java.util.Arrays;
import java.util.List;


public class QuadradoTotalFuncao {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        int resultado = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Quadrado Total: " + resultado);
    }
}
