package org.example;

public class Calculadora {

    public double somarNumeros(double primeiroNumero, double segundoNumero){
        return primeiroNumero + segundoNumero;
    }
    public double subtrairNumeros(double primeiroNumero, double segundoNumero){
        return primeiroNumero - segundoNumero;
    }
    public double multiplicarNumeros(double primeiroNumero, double segundoNumero){
        return primeiroNumero * segundoNumero;
    }
    public double dividirNumeros(double primeiroNumero, double segundoNumero){
        return primeiroNumero/segundoNumero;
    }
    public double raizQuadradaDosNumeros(int numero){
        return Math.sqrt(numero);
    }
    public double potenciaDosNumeros(int numero){
        return numero*numero;
    }

}
