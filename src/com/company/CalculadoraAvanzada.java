package com.company;

public class CalculadoraAvanzada extends CalculadoraBasica {
    private String nombreDeClase;

    public CalculadoraAvanzada(){
        this.nombreDeClase="Calculadora Avanzada";
    }

    public double potencia(double primerNumero, double segundoNumero){
       return Math.pow(primerNumero, segundoNumero);
    }
    public double raiz(double numero){
        return Math.sqrt(numero);
    }
}
