import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class creation {
    public static void main(String[] args) {
         List<String> list = Arrays.asList("apple","banana","orange");
       Stream<String> stream =  list.stream();

       int arrr[] = {1,2,3,4,3};
        IntStream stream1 = Arrays.stream(arrr);


      Stream<Integer> inte =   Stream.of(1,2,3,4);


      //If you want to iterate then use Iterator
      Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);
      limit.forEach(System.out::println);


      //if you want to generate then use generate, like Math.random() * 100
      Stream.generate(() -> (double)Math.random() * 100).limit(100).forEach(System.out::println);
    }
}
