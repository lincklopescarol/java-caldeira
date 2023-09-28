package exercicio02;

import java.util.Scanner;

public class Main {
    Scanner teclado = new Scanner(System.in);
    int respostaUsuario = teclado.nextInt();
    public static void opcoes(DiaDaSemana opcao){
        if(opcao == DiaDaSemana.DOMINGO){
            System.out.println("Domingo");
        } else if (opcao == DiaDaSemana.SEGUNDA) {
            System.out.println("Segunda");
        } else if (opcao == DiaDaSemana.TERCA){
            System.out.println("Terça");
        } else if (opcao == DiaDaSemana.QUARTA) {
            System.out.println("Quarta");
        } else if (opcao == DiaDaSemana.QUINTA) {
            System.out.println("Quinta");
        } else if (opcao == DiaDaSemana.SEXTA) {
            System.out.println("Sexta");
        } else if (opcao == DiaDaSemana.SABADO) {
            System.out.println("Sábado");
        } else {
            System.out.println("Erro!");
        }
    }
    // PRECISO ARRUMAR A LOGICA
    public static void main(String[] args){
        opcoes(DiaDaSemana.SEGUNDA);
        opcoes(DiaDaSemana.TERCA);
        opcoes(DiaDaSemana.QUARTA);
        opcoes(DiaDaSemana.QUINTA);
        opcoes(DiaDaSemana.SEXTA);
        opcoes(DiaDaSemana.SABADO);
        opcoes(DiaDaSemana.DOMINGO);
    }
}
