package ej44hjhonar;
//importaciones
import java.util.*;
/*
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en 
un HashSet y que luego calcule la suma, la media, el máximo y el mínimo 
de esos números. El tamaño de la lista también será aleatorio y podrá 
oscilar entre 10 y 20 elementos ambos inclusive.
*/
public class Ej44hJhoNar {

    public static void main(String[] args) {
        // Programa ejecutable
        //definimos el tamaño del hash set
        int tamaño=(int) Math.floor(Math.random()*(20-(10+1))+10);
        System.out.println("El tamaño del Hash set será: "+tamaño);
        //creamos el hashset
        HashSet<Integer> numeros = new HashSet<Integer>();
        //metemos numeros aleatorios desde 0 a 100
        for (int i = 0; i < tamaño; i++) {
            numeros.add((int)Math.floor(Math.random()*(100-0)+0));
        }
        for (int e : numeros) {
            System.out.print(e+" ");
        }
        //suma
       int total=0;
        for (int num : numeros) {
            total=total+num;
        }
        //media
        int media=total/numeros.size();

        System.out.println("\nLa suma total es: "+total);
        System.out.println("La media es: "+media);
        System.out.println("La número mayor es: "+Collections.max(numeros));
        System.out.println("La número menor es: "+Collections.min(numeros));
    }

}
