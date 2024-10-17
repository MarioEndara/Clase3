import java.util.Scanner;
public class Jugador {
    String avatar, pais;
    int edad;
    int ac=20;

    //Datos quemados//
    public Jugador() {
        avatar = "Videl";
        pais = "Ecuador";
        edad = 20;
    }

    public Jugador(String avatar, String pais, int edad) {
        this.avatar = avatar;
        this.pais = pais;
        this.edad = edad;
    }

    public void patear() {
        System.out.println("El avatar es " + avatar + " es de " + pais + " y tiene " + edad);

    }

    public void correr(){

        System.out.println("El avatar es " + avatar + " es de " + pais + " y tiene " + edad);
    }

    public void acelerar(int s){

        ac=ac+s;

        System.out.println("El avatar es " + avatar + " es de " + pais + " y tiene " + edad+" años y ha saltado "+ac+" kilometros ");
    }
}