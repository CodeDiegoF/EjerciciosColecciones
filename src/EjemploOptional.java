import java.util.*;
public class EjemploOptional {
     public static void main(String[] args) {
          
          //Ejemplo Sin Optional
          System.out.println("Ejemplo Sin Optional");
          List<Nota> notas = new ArrayList<Nota>();
          notas.add(new Nota(" matematicas ", 3));
          notas.add(new Nota(" lengua ", 10));
          notas.add(new Nota(" ingles ", 9));
          List<Nota> notasSobresalientes = Nota.buscarNotaSobresaliente(notas);
          for (Nota unaNota : notasSobresalientes) {
               System.out.println(unaNota.getValor() + " - " + unaNota.getAsignatura());
          }
          
          //Ejemplo Con Optional
          System.out.println("\nEjemplo Con Optional");
          List<NotaOptional> notasOpt = new ArrayList<NotaOptional>();
          notasOpt.add(new NotaOptional(" matematicas ", 3));
          notasOpt.add(new NotaOptional(" fisica ", 9));
          notasOpt.add(new NotaOptional(" quimica ", 10));
          Optional<List<NotaOptional>> oNotas = NotaOptional.buscarNotaSobresalienteOptional(notasOpt);
          if (oNotas.isPresent()) {
               for (NotaOptional unaNota : oNotas.get()) {
                    System.out.println(unaNota.getValor() + " - " + unaNota.getAsignatura());
               }
          }
     }
}
