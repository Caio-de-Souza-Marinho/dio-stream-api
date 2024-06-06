package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma funçao que aceita um argumento do tipo T e retorna um valor booleano
 * É geralmente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExemplo {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavrasLista = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir as palavras que passaram no filtro
        palavrasLista.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}