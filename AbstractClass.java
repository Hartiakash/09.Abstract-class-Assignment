package Abstract_Class_Assignment;

/**
 * @author JALA Academy
 *
 * 01. Create an abstract class with abstract and non-abstract methods.
 * 02. Create a subclass for an abstract class. Create an object in the child class for the
 * abstract class and access the non-abstract methods
 * 03. Create an instance for the child class in child class and call abstract methods
 * 04. Create an instance for the child class in child class and call non-abstract methods
 */

abstract class Animal {
    //An abstract method doesn't have its body
    abstract void sound();

    //non-abstract method
    void eat() {
        System.out.println("Animal is eating");
    }
}

//subclass for an abstract class
class Lion extends Animal {
    //provide implementation of abstract method
    void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        Animal A = new Lion();
        //accessing the non-abstract methods
        A.eat();

        //instance for the child class
        Lion L = new Lion();
        //calling abstract methods
        L.sound();
        //calling non-abstract methods
        L.eat();
    }
}
