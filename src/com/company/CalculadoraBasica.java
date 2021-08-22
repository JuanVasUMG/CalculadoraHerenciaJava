package com.company;

public class CalculadoraBasica {
    private String nombreDeClase;

    public CalculadoraBasica(){
        this.nombreDeClase="Calculadora Básica";
    }

    protected double restarVariosNumeros(){
        return 0.0;
    }
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero+segundoNumero;
    }
    public double restar(double primerNumero, double segundoNumero){
        return primerNumero-segundoNumero;
    }

    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }



    public double sumarVariosNumeros(double [] variosNumeros){
        //se hace le procedimiento
        return 0.0;
    }

}
