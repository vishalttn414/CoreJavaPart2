// WAP using java 8:
//    -> Collect all  even numbers from a list using stream

import java.util.*;
public class Question3a{
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
