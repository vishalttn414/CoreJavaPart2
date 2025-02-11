//Implement multiple inheritance with default method inside interface.

interface Parent1{
    default void display(){
        System.out.println("This is Parent1 method");
    }
}

interface Parent2{
    default void display(){
        System.out.println("This is Parent2 method");
    }
}
class A implements Parent1,Parent2{
    public void display(){
        Parent1.super.display();
        Parent2.super.display();
        System.out.println("This is class A method");

    }
}

public class Question2 {
    public static void main(String[] args) {
        A obj=new A();
        obj.display();
    }
}
