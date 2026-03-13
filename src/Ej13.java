import java.util.*;

public class Ej13 {
     public static void main(String[] args) {
          Map<String, String> mapa = new HashMap<>();
          
          mapa.put("1", "Agutín");
          mapa.put("2", "78045612S");
          System.out.println(mapa.get("1"));
          System.out.println(mapa.get("2"));
          
          Set<String> lista = new TreeSet<>(mapa.keySet());
          System.out.println(lista);
          
          for (String key : mapa.keySet()) {
               String valor = mapa.get(key);
               System.out.println(key + " - " + valor);
          }
     }
}
