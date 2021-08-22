package com.company;


public class Main {

    public static void main(String[] args) {
	CalculadoraBasica calculadoraBasica = new CalculadoraBasica();
	CalculadoraAvanzada calculadoraAvanzada = new CalculadoraAvanzada();

	System.out.println(calculadoraBasica.sumar(5,10));
	System.out.println(calculadoraAvanzada.sumar(8,8));
	System.out.println(calculadoraAvanzada.potencia(2,6));

	System.out.println(calculadoraAvanzada.restarVariosNumeros());

    }
}
