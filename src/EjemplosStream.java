import java.util.*;
import java.util.stream.*;


public class EjemplosStream {
     public static void main(String[] args) {
          Stream< String > streamEmpty = Stream.empty () ;
          System.out.println("streamEmpty count = " + streamEmpty.count());
          System.out.println("===============================================================");

          Collection < String > collection = Arrays.asList ("a", "b", "c");
          Stream < String > streamOfCollection = collection. stream ();
          System.out.println("streamOfCollection toList = " + streamOfCollection.collect(Collectors.toList()));
          System.out.println("===============================================================");

          Stream < String > streamOfCollectionUpper = collection.stream ().map(String::toUpperCase);
          System.out.println("streamOfCollection uppercase = " + streamOfCollectionUpper.collect(Collectors.joining(", ")));
          System.out.println("===============================================================");

          Stream < String > streamBuilder = Stream . < String > builder ().add ("a").add ("b").add ("c").build ();
          System.out.println("streamBuilder sorted = " + streamBuilder.sorted().collect(Collectors.toList()));
          System.out.println("===============================================================");

          Stream < Integer > streamIterated = Stream.iterate (40 , n -> n + 2) . limit (20) ;
          System.out.println("streamIterated first 20 = " + streamIterated.collect(Collectors.toList()));
          System.out.println("===============================================================");

          IntStream intStream = IntStream.range (1 , 3);
          System.out.println("intStream range(1,3) = " + intStream.boxed().collect(Collectors.toList()));
          System.out.println("===============================================================");

          LongStream longStream = LongStream.rangeClosed (1 , 3);
          System.out.println("longStream rangeClosed(1,3) = " + longStream.boxed().collect(Collectors.toList()));
          System.out.println("===============================================================");

          Random rd = new Random ();
          DoubleStream doubleStream = rd.doubles (3);
          System.out.println("doubleStream random(3) = " + doubleStream.boxed().collect(Collectors.toList()));
          System.out.println("===============================================================");

          Stream < Integer > stream = Stream.of (1 ,2 ,3 ,4);
          System.out.println("stream of sum = " + stream.mapToInt(Integer::intValue).sum());
          System.out.println("===============================================================");

          List < Integer > myList = new ArrayList <>() ;
          for (int i = 0; i < 100; i ++) myList.add ( i ) ;
          System.out.println("myList size = " + myList.size());
          System.out.println("===============================================================");

          // sequential stream
          Stream < Integer > sequentialStream = myList.stream () ;
          System.out.println("sequentialStream count = " + sequentialStream.count());
          System.out.println("===============================================================");

          // parallel stream
          Stream < Integer > parallelStream = myList.parallelStream () ;
          System.out.println("parallelStream count = " + parallelStream.count());
          System.out.println("=============================================================");
          
          List < Integer > myList2 = new ArrayList < >();
          for (int i = 0; i < 100; i ++) myList2.add ( i ) ;
          myList2.stream ().filter ( p -> p > 90).forEach( p -> System.out.print( p + " "));
          System.out.println("\n===============================================================");
          
          Stream < String > namesUpper = Stream.of (" aBc", "d", "ef") ;
          List < String > namesUpperCase = namesUpper.map( s -> s .toUpperCase ()).collect (Collectors.toList());
          System.out.print("namesUpperCase = " + namesUpperCase);
          System.out.println("\n===============================================================");
          
          Stream < String > namesOrder = Stream.of ("aBc ", "d", "ef", " 123456 ") ;
          List < String> reverseSorted = namesOrder.sorted (Comparator.reverseOrder()).collect (Collectors.toList()) ;
          System.out.print("reverseSorted = " + reverseSorted);
          System.out.println("\n===============================================================");
          
          Stream< String > namesDistinct = Stream.of ("aB ", "ab", "cd", "cd", "ab");
          List< String > distinct = namesDistinct.distinct().collect (Collectors.toList()) ;
          System.out.print("distinct = " + distinct);
          System.out.println("\n===============================================================");
          
          Stream.iterate(10 , n -> n + 2).limit(10).forEach (n -> System.out.print(n + " "));
          System.out.println("\n===============================================================");
          
          Stream < Integer > numbersReduce = Stream.of (1 ,2 ,3 ,4 ,5) ;
          Optional < Integer > intOptional = numbersReduce.reduce (( i , j ) -> i * j ) ;
          if( intOptional.isPresent()){
               System.out.print (" Multiplication = "+ intOptional.get ());
          }
          System.out.println("\n===============================================================");
          
          Stream < Integer > numbersCount = Stream . of (1 , 2 , 3 , 4 , 5) ;
          long cant = numbersCount.count () ;
          System.out.print (" Number of elements = " + cant ) ;
          System.out.println("\n===============================================================");
          
   
          Stream < Integer > numbers3 = Stream.of (1 , 2 , 3 , 4 , 5) ;
          System.out.println (" Stream contains 4? " + numbers3.anyMatch( i -> i == 4) ) ;
          

          Stream < Integer > numbers4 = Stream.of (1 , 2 , 3 , 4 , 5) ;
          System.out.println (" Stream contains all elements less than 10? " + numbers4.allMatch( i -> i < 10)) ;
          
          Stream < Integer > numbers5 = Stream.of (1 , 2 , 3 , 4 , 5) ;
          System.out.print (" Stream doesn ’t contain 10? " + numbers5 . noneMatch ( i -> i == 10) );
          System.out.println("\n===============================================================");
          
          Stream < String > names4 = Stream.of ("Pankaj","Amit","David", "Dave") ;
          Optional < String > firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst() ;
          if( firstNameWithD.isPresent() ) {
               System.out.print(" First Name starting with D = " + firstNameWithD.get());
          }
          System.out.println("\n===============================================================");
          
          // Creando la List
          List < Product > productList = Arrays.asList ( new Product(23,"potatoes") ,
                                                          new Product (14, "orange") ,
                                                          new Product (13,"lemon") ,
                                                          new Product (23,"bread") ,
                                                          new Product (13, "sugar"));
          System.out.print("Product list = " + productList);
          System.out.println("\n===============================================================");
          
          //Convertiendo a Collection (Collection, List or Set)
          List < String > productCollection = productList.stream ().map( Product::getName).collect(Collectors.toList ());
          productCollection.forEach(System.out::println);
          productList.forEach(p -> System.out.println("id: " + p.getId() + " - nombre: " + p.getName()));
          //Convertiendo a String
          String listToString = productList.stream().map( Product::getName).collect(Collectors.joining (", ", "[", "]"));
          System.out.println("listToString = " + listToString);
     }
}
