package Ejemplogit;

import java.util.Scanner;
import java.lang.Math;
public class Prog1_0 {
     public static void main(String[] args) {
           // TODO Auto-generated method stub
           Scanner leerradio = new Scanner(System.in);
           int radio;
           System.out.println("Introduce el radio de la esfera");
           radio=leerradio.nextInt();
           double area;
           area = (Math.PI) * (Math.pow(radio, 2));
           System.out.println("El área de la esfera es "+area);
           System.out.println("Finalizado Version 2");
     
     
     }
}
