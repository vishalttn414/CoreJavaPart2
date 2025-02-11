// Ques: Create thread using Lambda function.

public class Question5 {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Thread is created Successfully using Lambda function");
        });

        thread.start();
    }
}

