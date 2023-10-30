package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListaStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Camila", "Luana", "José", "Ricardo", "Camila", "Camila", "Camila", "Camila");

        // imprimir o total de strings na lista
        int totalElementos = (int) strings.stream().count();

        System.out.println("A lista tem " + totalElementos + " elementos.");

        // imprimir a string mais longa
        // usa o max para ver a string maior
        // primeiraString e segundaString é adicionado para fazer comparação entre strings


        String maiorString = strings.stream()
                .max((primeiraString, segundaString) -> Integer.compare(primeiraString.length(), segundaString.length()))
                .get();

        System.out.println("A maior string é: " + maiorString);

        // imprimir quaanas vezes cada string aparece
        // usei long pq é uma boa prática no couting
        // Function.identity() é pra retornar o próprio argumento sem alteração

        Map<String, Long> contagemString = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Número de vezes que as strings aparecem: ");
        System.out.println(contagemString);

    }
}
