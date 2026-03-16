import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploLambdas {
     public static void main(String[] args) {
          List<String> frutas = Arrays.asList("Manzana", "Naranja", "Limón", "Nípero");
          System.out.println("1º forma: ");
          frutas.forEach((String a) -> System.out.println(a));
          
          System.out.println("2º forma: ");
          frutas.forEach(fruta -> System.out.println(fruta));
          
          System.out.println("3º forma: ");
          frutas.forEach((String a) ->{
               System.out.print(a + "-");
               System . out . println (a.length () + " letras") ;
          });
          
     }
}
