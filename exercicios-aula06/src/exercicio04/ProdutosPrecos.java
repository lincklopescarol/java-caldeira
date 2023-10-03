package exercicio04;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProdutosPrecos {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> produtos = new LinkedHashMap<>();

        produtos.put("Celular", 1500.00);
        produtos.put("Computador", 3000.00);
        produtos.put("Mesa", 500.00);

        System.out.println("Lista dos produtos na ordem em que foram inseridos: ");
        // esse for percorre as entradas de todos os produtos
        for(Map.Entry<String, Double> entradas : produtos.entrySet()){
            // pega a chave -> nome do produto e armazena na variavel
            String produto = entradas.getKey();
            // pega o valor -> valor do produto e armazena na variavel
            double preco = entradas.getValue();
            System.out.println("Produto: " + produto + ", Valor: " + preco);
        }
    }
}
