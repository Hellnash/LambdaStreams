package stream;

import java.util.ArrayList;
import java.util.List;

public class CodeCompare {
    public static void main(String[] args) {

        //Traditional Method
        //6 lines of boilerplate code
        List<Integer> integers = List.of(2, 6, 9, 5, 4);
        List<Integer> evenIntegers = new ArrayList<>();
        for (Integer i: integers) {
            if(i%2==0){
                evenIntegers.add(i);
            }
        }
        System.out.println("Result using traditional approach \n"+evenIntegers);

        //Same task using Stream API in one line
        System.out.println("Result using stream API ");
        integers.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
    }
}
