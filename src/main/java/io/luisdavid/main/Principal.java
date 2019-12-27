package io.luisdavid.main;
import io.luisdavid.figura.Cubo;
import io.luisdavid.figura.Triangulo;
import io.luisdavid.puntos.P2;
import io.luisdavid.puntos.P3;

public class Principal {

    public static void main(String[] args) {

        P2 punto2 = new P2();
        P2 punto2_1 = new P2(1,2);
        P2 punto2_2 = new P2(punto2_1);

        System.out.println(punto2.calacularDistancia(1,1));
        System.out.println(punto2.calacularDistancia(punto2_1));

        P3 punto3 = new P3();
        P3 punto3_1 = new P3(1,2,3);
        P3 punto3_2 = new P3(punto2_1, 2);
        P3 punto3_3 = new P3(punto3_1);
        System.out.println(punto3_3);
        System.out.println(punto3_2);

        Triangulo equilatero = new Triangulo();
        equilatero.setPunto1(punto2);
        equilatero.setPunto2(punto2_1);
        equilatero.setPunto3(punto2_2);

        Cubo cubito = new Cubo();
        (cubito.getVertice())[0] = new P3(1,2,3);
        (cubito.getVertice())[1] = new P3(2,3,4);
        (cubito.getVertice())[2] = new P3(3,4,5);
        (cubito.getVertice())[3] = new P3(4,5,6);
        (cubito.getVertice())[4] = new P3(5,6,7);
        (cubito.getVertice())[5] = new P3(6,7,8);
        (cubito.getVertice())[6] = new P3(7,8,9);
        (cubito.getVertice())[7] = new P3(8,9,10);


        P3[] array = cubito.getVertice();
        for (P3 p3:array){

            System.out.println(p3);
        }

        //principio de lisko

        P2 pruebaLiskov = new P3();

        ((P3)pruebaLiskov).calcularDistancia(1,2,3);


    }
}
