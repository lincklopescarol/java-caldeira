import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva um dia da semana por extenso:");
        System.out.println("Exemplo: Segunda-Feira");
        String diaDaSemana = teclado.nextLine();

        switch (diaDaSemana){
            case("DOMINGO"):
                System.out.println(DiaDaSemana.DOMINGO + ": dia de descansar!");
                break;
            case("Segunda-Feira"):
                System.out.println(DiaDaSemana.SEGUNDA+ ": dia de faculdade!");
                break;
            case("Terça-Feira"):
                System.out.println(DiaDaSemana.TERCA+ ": dia de faculdade!");
                break;
            case("Quarta-Feira"):
                System.out.println(DiaDaSemana.QUARTA+ ": dia de faculdade!");
                break;
            case("Quinta-Feira"):
                System.out.println(DiaDaSemana.QUINTA+ ": dia de faculdade!");
                break;
            case("Sexta-Feira"):
                System.out.println(DiaDaSemana.SEXTA + ": dia de faculdade!");
                break;
            case("SABADO"):
                System.out.println(DiaDaSemana.SABADO + ": dia de descansar!");
                break;
        }

    }
}



