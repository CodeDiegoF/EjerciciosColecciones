import java.util.*;

public class Ej16 {
     public static void main(String[] args) {
          Set<String> hset = new HashSet<String>();
          
          hset.add("lucas");
          hset.add("pepe");
          hset.add("juani");
          hset.add("wenceslao");
          hset.add("marisa");
          
          System.out.println(hset.size());
          System.out.println(hset);
          
          hset.add("Lucas");
          hset.add("paquirrí");
          System.out.println(hset.size());
          System.out.println(hset);
          hset.remove("lucas");
          System.out.println(hset);
          
          //los SET son case-sensative, es decir, distingue entre mayúsculas y minúsculas, por ello se puede añadir dos nombres iguales pero con minúscula y mayúscula.
          
     }
}
