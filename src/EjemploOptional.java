import java.util.*;
public class EjemploOptional {
     public static void main(String[] args) {
          
          //Ejemplo Sin Optional
//               List < Nota > notas = new ArrayList < Nota >() ;
//               notas.add (new Nota (" matematicas ", 3) ) ;
//               notas.add (new Nota (" lengua ", 10) ) ;
//               notas.add (new Nota (" ingles ", 5) ) ;
//               Nota nota = Nota.buscarNotaSobresaliente (notas) ;
//               System . out . println ( nota.getValor () + " - " + nota.getAsignatura () ) ;
          
          
          //Ejemplo Con Optional
          List < NotaOptional > notas = new ArrayList < NotaOptional>();
          notas.add (new NotaOptional (" matematicas ", 3) ) ;
          notas.add (new NotaOptional (" fisica ", 7) ) ;
          notas.add (new NotaOptional (" química ", 10) ) ;
          Optional < NotaOptional > oNota = NotaOptional.buscarNotaSobresalienteOptional(notas) ;
          if ( oNota.isPresent () ) {
               NotaOptional nota = oNota.get() ;
               System.out.println ( nota.getValor () + "-" + nota.getAsignatura () + " es sobresaliente " ) ;
          }
     }
}
