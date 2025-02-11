//Using (instance) Method reference create and apply add and subtract method and using (Static) Method
// reference create and apply multiplication method for the functional interface created.

interface Sample{
    int solve(int a, int b);
}

class Helper {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Helper helper = new Helper();

        Sample addition = helper::add;
        Sample subtraction = helper::subtract;

        Sample multiplication = Helper::multiply;

        int a = 20;
        int b= 10;

        System.out.println("Numbers are " + a+ " and " + b);
        System.out.println("Addition of " + a + " and "+ b +" equals " + addition.solve(a,b));
        System.out.println("Subtraction of " + a + " and "+ b +" equals " + subtraction.solve(a,b));
        System.out.println("Multiplication of " + a + " and "+ b +" equals "+ multiplication.solve(a,b));
    }
}