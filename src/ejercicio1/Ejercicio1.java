
package ejercicio1;

import java.util.Scanner;

/*
Nombre de la clase: diametroArea
Fecha:7-3-2018
Versión:1
CopyRight©:ITCA-SIS12A
@author Josué Esaú Cruz Mejía
*/

/*
1-Escriba un programa en Java que reciba a través de consola el radio de una
circunferencia, calcule su área y su diámetro, mostrar los resultados con 2
decimales.
*/

public class Ejercicio1 
{
    public static void main(String[] args) 
    {
      double radio;
      double area;
      double diametro;
      double pi = Math.PI;
      
      Scanner leer = new Scanner(System.in);
      
      System.out.println("Ingrese el radio de la circunferencia");
      radio=leer.nextDouble();
      
      area=(pi)*Math.pow(radio,2);
      diametro=2*radio;
      
      System.out.println("La Circunferencia con radio ("+radio+") posee los valores: ");
      System.out.format("Diametro: %.2f%n",diametro);
      System.out.format("Area: %.2f%n",area);
      
      /*System.out.printf("%.2f%n",diametro);
      System.out.printf("%.2f%n",area); 
      ESTO SI FUERA SOLO IMPRESION*/
    }
}