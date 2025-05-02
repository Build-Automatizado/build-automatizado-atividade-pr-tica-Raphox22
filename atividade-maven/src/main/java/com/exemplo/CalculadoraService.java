package com.exemplo;

public class CalculadoraService {
    private final Calculadora calculadora;

    public CalculadoraService(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int calcularDobroDaSoma(int a, int b) {
        int soma = calculadora.somar(a, b);
        return calculadora.multiplicar(soma, 2);
    }
}
