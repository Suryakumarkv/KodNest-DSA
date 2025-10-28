import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,8,9,6,7,4,1,2,3);

        List<Integer> filteredList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((a,b) -> b - a)
                .limit(3)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(filteredList);

//        List<Integer> newMappedList =filteredList.stream().map(x -> x/2).collect(Collectors.toList());
//        System.out.println(newMappedList);

//        Integer stream = Stream.iterate(0, n -> n + 1).limit(101).map(n -> n/10).distinct().peek(System.out::println).max((a, b) -> a-b).get();
//        System.out.println(stream);

        Long stream = Stream.iterate(0, n -> n + 1).limit(101).map(n -> n/20).count();
        System.out.println(stream);
    }
}
