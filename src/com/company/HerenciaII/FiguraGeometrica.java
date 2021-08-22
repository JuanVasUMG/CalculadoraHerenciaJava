package com.company.HerenciaII;

public abstract class FiguraGeometrica {
    protected String forma;

    public FiguraGeometrica(){
        this.forma="Figura Geometrica";
    }

    String mostrarTipoFigura(){
        return this.forma;
    }

    protected double calcularArea() { return 0; }

    protected double calcularPerimetro() {return 0; }
}
