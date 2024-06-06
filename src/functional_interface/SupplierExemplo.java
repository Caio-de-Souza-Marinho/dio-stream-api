package functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É geralmente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierExemplo {
    public static void main(String[] args) {
        // Usa o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        // Usa o Supplier para gerar uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo!")
                .limit(3)
                .toList();

        // Imprimir saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}