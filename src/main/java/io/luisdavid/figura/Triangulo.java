package io.luisdavid.figura;
import io.luisdavid.puntos.P2;


public class Triangulo {

    private String colorlinea;
    private String colorFondo;
    private P2 punto1 = new P2();
    private P2 punto2 = new P2();
    private P2 punto3 = new P2();

    public String getColorlinea() {
        return colorlinea;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public P2 getPunto1() {
        return punto1;
    }

    public P2 getPunto2() {
        return punto2;
    }

    public P2 getPunto3() {
        return punto3;
    }

    public void setColorlinea(String colorlinea) {
        this.colorlinea = colorlinea;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public void setPunto1(P2 punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(P2 punto2) {
        this.punto2 = punto2;
    }

    public void setPunto3(P2 punto3) {
        this.punto3 = punto3;
    }
    public void dibujar(){

        System.out.println("Dibujar un trinagulo");
    }


}
