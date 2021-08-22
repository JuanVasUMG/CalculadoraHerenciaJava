package com.company;

public class CalculadoraParaTrigonometria extends CalculadoraAvanzada {
    private String nombreDeClase;

    public CalculadoraParaTrigonometria(){
        this.nombreDeClase="Calculadora Para Trigonometria";
    }

    public double seno(double numero) {return Math.sin(Math.toRadians(numero)); }
    public double coseno(double numero) {return Math.cos(Math.toRadians(numero)); }
    public double tangente(double numero) {return Math.tan(Math.toRadians(numero)); }
}
