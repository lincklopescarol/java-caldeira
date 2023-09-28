package exercicio03;

import exercicio01.Livros;

import java.util.TreeMap;

public class AgendaTelefonica {
    public static void main(String[] args) {
        TreeMap<Integer, String> agenda = new TreeMap<>();
        Informacoes novaInfo = new Informacoes(987654321, "Roberta", "Porto Alegre", "Norte");
        agenda.put(novaInfo.getNumeroTelefone(), novaInfo.getNome());
        Informacoes novaInfoDois = new Informacoes(987684331, "Flávia", "Porto Alegre", "Sul");
        agenda.put(novaInfoDois.getNumeroTelefone(), novaInfoDois.getNome());
//
//        System.out.println("Nomes e números de telefone: ");
//        for (int i = 0; i < agenda.size(); i++) {
//            Informacoes todasInfos = agenda.get(i);
//            System.out.println("Nome: " + todasInfos.getNome() + ", Telefone: " + todasInfos.getNumeroTelefone());
        }
    }

