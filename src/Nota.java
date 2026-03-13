import java.util.List;

public class Nota {
     private String asignatura;
     private int valor;
     
     public Nota (String asignatura, int valor) {
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
     
     public static Nota buscarNotaSobresaliente ( List< Nota > notas ) {
          Nota nota = null ;
          for ( Nota unaNota : notas ) {
               if ( unaNota . getValor () >= 9) {
                    nota = unaNota ;
               }
          }
          return nota ;
     }
}
