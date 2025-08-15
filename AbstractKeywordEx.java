abstract class Car {
    public abstract void drive();

    public abstract void fly();

    public void music() {
        System.out.println("play music...");
    }
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("driving...");
    }
}

class UpdatedWagonR extends WagonR {
    public void fly() {
        System.out.println("flying...");
    }
}

public class AbstractKeywordEx {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.music();
        obj.fly();
    }
}


// The abstract keyword in Java is used to declare something that is incomplete and
//  meant to be implemented or extended later.It can be applied to classes and methods
//  Abstract Class Can have abstract methods (no body) and normal methods (with body).
 
//  Abstract Method :A method without a body (only signature).
// Declared inside an abstract class or interface.
// Must be implemented by the first concrete subclass.

// Abstract classes can have:Constructors 
//                            Fields 
//                           Concrete methods
//                            Static methods 
//                             Final methods
// Abstract methods cannot be final, static, or private (because they must be overridden).

// A concrete class in Java is simply a normal class that has a complete 
//implementation of all its methods — meaning it’s not abstract and not an interface.