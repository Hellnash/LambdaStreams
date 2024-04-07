package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    @SuppressWarnings("All")
    public static void main(String[] args) {

        //filter(Predicate -> Boolean Valued Function -> Method which returns boolean value)
        //if Predicate == true data will be filtered
        List<String> names = List.of("Adhvait", "Atul", "Vinod", "Digamber");
        List<String> newNames = names.stream().filter(str -> str.startsWith("A")).collect(Collectors.toList());
        System.out.println("Names starting with A "+newNames);
        //collect method will collect all the elements after filtering and store it to a list

        //map(Function -> a general method which returns any value not boolean)
        //peek(Funtion) -> unlike map it automatically returns the stream withou any return statement
        List<Integer> integers = List.of(34, 8, 97, 101, 234);
        List<Integer> squares = integers.stream().map(i -> i * i).toList();
        System.out.println("Squares of Integers "+integers+" :: "+squares);

        //forEach(Consumer type Object) method will iterate over the stream
        System.out.println("Iterating over the collection/group of objects");
        integers.forEach(System.out::println);

        //sorted(Comparator class object) method will sort the list
        System.out.println("Sorted Integers");
        integers.stream().sorted().forEach(System.out::println);

        //max and min(Comparator type object)
        Integer minimum = integers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Minimum Value of the integers "+minimum);
        Integer maximum = integers.stream().max(Integer::compareTo).get();
        System.out.println("Maximum Value of the integers "+maximum);

        //peek
        //reduce
    }
}
