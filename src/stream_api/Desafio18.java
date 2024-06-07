package stream_api;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Desafio 18 - Verifique se todos os números da lista são iguais:
 * Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
 */

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // set para guardar primeira ocorrência de cada número
        Set<Integer> setNumeros = new HashSet<>();

        List<Integer> numerosRepetidos = numeros.stream()
                .filter(n -> !setNumeros.add(n))  // filtra pelos que não são adicionados à setNumeros (repetidos)
                .toList();   // adiciona à nova lista os números repetidos
        System.out.println(numerosRepetidos);
    }
}