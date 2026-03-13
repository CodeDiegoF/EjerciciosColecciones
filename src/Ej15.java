import java.util.*;

public class Ej15 {
    public static void main(String args[]) {
         ArrayList<Integer> lista = new ArrayList<>();
         
         HashSet<Integer> set = new HashSet<>();
         
         Scanner leer = new Scanner(System.in);
         System.out.println("Introduce el número que quieres meter del 10 al 20: ");
         int tam = leer.nextInt();
         
         while (tam <10 || tam > 20){
              System.out.println("Número no válido prueba otra vez");
              tam = leer.nextInt();
         }
         
         Random rd = new Random();
         for (int i = 0; i < tam; i++) {
              int numero = rd.nextInt(1, 101);
              lista.add(numero);
              set.add(numero);
         }
         
         System.out.println(lista);
         System.out.println(set);
         
         System.out.println("El numero de elementos repetidos es: " + (lista.size() - set.size()));
        
         }
       
    }

