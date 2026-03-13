import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ej14 {
     public static void main(String[] args) {
          ArrayList<Double> lista = new ArrayList<>();
          lista.add(2.2);
          lista.add(3.3);
          lista.add(100.0);
          
          Random rd = new Random();
          
          for (int i = 0; i <= 15; i++) {
               lista.add(rd.nextDouble(101));
          }
          
          System.out.println(lista);
          System.out.println();
          
          lista.remove(0);
          System.out.println(lista);
          
          System.out.println("El tamaño de la lista es: " + lista.size());
          System.out.println();
          
          System.out.println(lista);
          lista.removeIf(n -> n == 100.0);
          System.out.println(lista);
          
          lista.remove(10);
          System.out.println(lista);
         
          if (lista.contains(3.3)) {
               System.out.println("3.3 está en la posición: " + lista.indexOf(3.3));
          }
          
          lista.add(0, 5.5);
          if (lista.contains(5.5)) {
               System.out.println("3.3 está en la posición: " + lista.indexOf(3.3));
          }
          lista.add(2, 4.4);
          System.out.println(lista);
          
          List<Double> sublista = lista.subList(0, 3);
          System.out.println(sublista);
          Collections.reverse(sublista);
          System.out.println(sublista);
     }
}

