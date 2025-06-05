 // Encapsulation: Using private variables and public methods to access them
 
class Person {
    private String name;  // Private variable for Encapsulation

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

// Inheritance: Parent class (Animal) and Child class (Dog)
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

class Dog extends Animal {  // Dog inherits from Animal
    @Override
    void eat() {
        System.out.println("Dogs eat bones.");
    }

    void bark() {
        System.out.println("Dog barks.");
    }
}

// Polymorphism: Compile-time polymorphism (method overloading) and Runtime polymorphism (method overriding)
class Calculator {
    // Compile-time Polymorphism: Method overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Abstraction: Using abstract class and method
abstract class Vehicle {
    abstract void run();  // Abstract method

    void display() {
        System.out.println("Vehicles are used for transportation.");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running.");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        // Encapsulation demonstration
        Person person = new Person();
        person.setName("John");
        System.out.println("Encapsulation: Name is " + person.getName());

        // Inheritance and Runtime Polymorphism demonstration
        Animal myAnimal = new Dog();  // Upcasting
        myAnimal.eat();  // Calls overridden method in Dog class

        // Accessing child-specific method using downcasting
        Dog myDog = (Dog) myAnimal;
        myDog.bark();

        // Compile-time Polymorphism demonstration
        Calculator calc = new Calculator();
        System.out.println("Polymorphism: Addition of two numbers: " + calc.add(5, 10));
        System.out.println("Polymorphism: Addition of three numbers: " + calc.add(5, 10, 15));

        // Abstraction demonstration
        Vehicle myVehicle = new Car();
        myVehicle.run();
        myVehicle.display();
    }
}
