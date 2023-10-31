package org.example;

public class Calculadora {
    public Calculadora() {
    }

    public double somarNumeros(double primeiroNumero, double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public double subtrairNumeros(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public double multiplicarNumeros(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    public double dividirNumeros(double primeiroNumero, double segundoNumero) {
        return primeiroNumero / segundoNumero;
    }

    public double raizQuadradaDosNumeros(int numero) {
        return Math.sqrt((double) numero);
    }

    public double potenciaDosNumeros(int numero) {
        return (double) (numero * numero);
    }
    public double calcularPagamentoHipoteca(double valorDoEmprestimo, double taxaDeJurosAnual, int prazoEmAnos) {
        // calcula o número total de pagamentos ao longo do prazo em anos
        int numeroDePagamentos = prazoEmAnos * 12;

        // calcula a taxa de juros mensal convertendo a taxa de juros anual de porcentagem para decimal
        double taxaDeJurosMensal = (taxaDeJurosAnual / 100.0) / 12.0;

        // calcula o pagamento mensal da hipoteca usando a fórmula
        double pagamentoMensal = (valorDoEmprestimo * taxaDeJurosMensal) /
                (1 - Math.pow(1 + taxaDeJurosMensal, -numeroDePagamentos));
        return pagamentoMensal;
    }

    }

