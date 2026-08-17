import java.util.Arrays;
import java.util.List;

// sem loop, sem variável sendo alterada: map eleva ao quadrado,
// reduce soma tudo
public class SomaQuadradosFuncional {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        int resultado = numeros.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        // dava pra fazer com mapToInt(...).sum() também, fica igual

        System.out.println("Soma dos quadrados: " + resultado);
    }
}
