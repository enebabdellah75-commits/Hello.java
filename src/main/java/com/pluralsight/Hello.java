package com.pluralsight;

public class Hello {

    // creat a main method because that where all our cod run
    public static void main(String[] args) {
        sayGoodbye();
        sayGoodnorning();
        sayHello();
    }
    // otehr method go below this commont

    //make a method called sayHello that prints hello world
    public static void sayHello() {
        System.out.println("hello world");
    }

    // make a method called sayGoodbye that prints Goodbye!
    public static void sayGoodbye() {
        System.out.println("Goodbye");
    }


    // make a method called sayGoodmorning that pring Goodmorning
    public static void sayGoodnorning() {
        System.out.println("Goodmorning");
    }

}
