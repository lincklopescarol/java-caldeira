package org.example;

import org.example.Produto;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneca", 10.0, 1));
        produtos.add(new Produto("Caderno", 15.0, 2));
        produtos.add(new Produto("Travesseiro", 20.0, 2));
        produtos.add(new Produto("Caneta", 5.0, 15));

        // a) produto mais caro da lista
        Produto maisCaro = produtos.stream()
                .max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                .orElse(null);
        System.out.println("Produto mais caro: " + maisCaro.getNome());

        // b) preço total multiplicado pela quantidade de cada produto na lista
        double precoTotal = produtos.stream()
                .mapToDouble(p -> p.getPreco() * p.getQuantidade()) // multiplica preço pela quantidade
                .sum();
        System.out.println("Preço total dos produtos multiplicado pela quantidade: " + precoTotal);

        // c) exibe os nomes dos produtos com quantidade maior que 10
        List<Produto> maiorQueDez = produtos.stream()
                .filter(p -> p.getQuantidade() > 10)
                .collect(Collectors.toList());
        System.out.println("Produtos com quantidade maior que 10:");
        // for feito pra pegar os nomes do maior que 10
        for (Produto produto : maiorQueDez) {
            System.out.println(produto.getNome());
        }
    }
}
