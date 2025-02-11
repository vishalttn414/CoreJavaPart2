//Write the following a functional interface and implement it using lambda:
//
//    -> First number is greater than second number or not Parameter (int ,int ) Return boolean
//   ->  Increment the number by 1 and return incremented value Parameter (int) Return int
//    -> Concatination of 2 string Parameter (String , String ) Return (String)
//    -> Convert a string to uppercase and return . Parameter (String) Return (String)

interface compareNum {
    boolean isGreater(int a, int b);
}

interface numIncrement {
    int incrementer(int a);
}

interface concatStrings {
    String concatinate(String a, String b);
}

interface toUpperCase {
    String convert(String a);
}

public class Question1 {
    public static void main(String args[]) {
        compareNum compare = (a,b) -> a > b;
        numIncrement increment = (a) -> a + 1;
        concatStrings concat = (a,b) -> a + b;
        toUpperCase convert = (a) -> a.toUpperCase();

        System.out.println("is 1 > 2? " + compare.isGreater(1,2));
        System.out.println("increment 4 by 1 is equal to " + increment.incrementer(4));
        System.out.println("Concating vishal yadav: " + concat.concatinate("vishal"," yadav"));
        System.out.println("vishal in upperCase is " + convert.convert("vishal"));
    }
}