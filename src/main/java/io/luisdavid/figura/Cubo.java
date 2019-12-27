package io.luisdavid.figura;

import io.luisdavid.puntos.P3;

/**
 * Crear un objeto tipo cubo
 * @author Luis David De hoyos
 *
 */
public class Cubo {

    //Atributos
    private String colorFondo;
    private String colorArista;

    private P3[]  vertice  = new P3[8];

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorArista() {
        return colorArista;
    }

    public void setColorArista(String colorArista) {
        this.colorArista = colorArista;
    }

    public void dibujar(){

        System.out.println("Dibujar un cubo");

    }

    public void setVertice(P3[] vertice) {
        this.vertice = vertice;
    }

    public P3[] getVertice() {
        return vertice;
    }
}
