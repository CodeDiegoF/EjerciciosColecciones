import java.util.List;
import java.util.Optional;

public class NotaOptional {
     private String asignatura;
     private int valor;
     
     public NotaOptional (String asignatura, int valor) {
          this.asignatura = asignatura;
          this.valor = valor;
     }
     
     public String getAsignatura() {
          return asignatura;
     }
     
     public void setAsignatura(String asignatura) {
          this.asignatura = asignatura;
     }
     
     public int getValor() {
          return valor;
     }
     
     public void setValor(int valor) {
          this.valor = valor;
     }
     
     public static Optional<NotaOptional> buscarNotaSobresalienteOptional(List<NotaOptional> notas) {
          for (NotaOptional unaNota : notas) {
               if (unaNota.getValor() >= 9) {
                    return Optional.of(unaNota);
               }
          }
          return Optional.empty();
     }
}
