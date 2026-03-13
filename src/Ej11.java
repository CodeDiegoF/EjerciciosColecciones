import java.util.*;
import java.util.Random;
public class Ej11 {
     public static  void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("Introduce el tamaño del array entre 10 y 20");
          int tam = leer.nextInt();
          while (tam <10 || tam > 20){
               System.out.println("Tamaño no válido prueba otra vez");
               tam = leer.nextInt();
          }
           int[] array = new int[tam];
          ArrayList lista = new ArrayList();
          Random rd = new Random();
          for (int i = 0; i < array.length; i++) {
               array[i] = rd.nextInt(1,101);
               lista.add(array[i]);
          }
          
          System.out.println(lista);
          
          System.out.println("Introduce un número del 1 al 100 para comprobar si está en la lista");
          int num=leer.nextInt();
          
          if(lista.contains(num)){
               System.out.println("El número está en la lista");
          }else{
               System.out.println("El número no está en la lista");
          }
          
          //Ordenar y mostrar el primero y último en un array
          Arrays.sort(array);
          System.out.println(array[0]);
          System.out.println(array[array.length-1]);
         
          //Ordenar y mostrar el primero y último en una lista
          Collections.sort(lista);
          System.out.println(lista.getFirst());
          System.out.println(lista.getLast());
          Collections.reverse(lista);
          System.out.println(lista.getFirst());
          System.out.println(lista.getLast());
     }
}
