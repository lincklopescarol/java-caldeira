package exercicio03;

import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonica {
    public static void main(String[] args) {
        TreeMap<String, String> agenda = new TreeMap<>();

        Informacoes novaInfo = new Informacoes("98765-4321", "Roberta", "Porto Alegre", "Norte");
        agenda.put(novaInfo.getNome(), novaInfo.getNumeroTelefone());

        Informacoes novaInfoDois = new Informacoes("98768-4331", "Flávia", "Porto Alegre", "Sul");
        agenda.put(novaInfoDois.getNome(), novaInfoDois.getNumeroTelefone());

        System.out.println("Lista de contatos em ordem alfabética: ");
        // esse for percorre as entradas de toda a agenda
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            // pega a chave -> nome e armazena na variavel
            String nome = entrada.getKey();
            // pega a chave -> telefone e armazena na variavel
            String telefone = entrada.getValue();
            System.out.println("Nome: " + nome + ", Telefone: " + telefone);
        }

        String localidadeDesejada = "Norte";
        System.out.println("Contatos na localidade " + localidadeDesejada + ": ");
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            String nome = entrada.getKey();
            String localidade = entrada.getValue();

            if (localidade.equals(localidadeDesejada)) {
                System.out.println("Nome: " + nome + ", Telefone: " + nome);
            }
        }


    }
}




