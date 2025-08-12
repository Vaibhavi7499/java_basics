class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand  + price  + name );
    }

     public static void show1(Mobile obj) {
        System.out.println(obj.brand  + obj.price  + name );
    }
}

public class StaticVarEx {
    public static void main(String args[]) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1500;
        // Mobile.name = "phone";

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Samsung";
        // obj1.price = 2000;
        // // Mobile.name = "smartphone";
Mobile.name="smartphone";
        obj.show();
        // obj1.show();
        Mobile.show1(obj);
    }
}


// static is a keyword in Java used for class-level members.
// A static variable or method belongs to the class, not to any specific object.
// Only one copy exists for all objects of the class.
// Can be accessed without creating an object (using ClassName.member).

// 2. Static Variables
// A static variable is shared among all objects of the class.
// It is stored in the Method Area of JVM memory.
// Initialized only once when the class is loaded.
// All instances share the same value.
// Can be accessed using ClassName.variableName.

// 3. Static Methods
// A static method belongs to the class rather than an instance.
// Can be called without creating an object.
// Cannot access non-static instance variables/methods directly (because static methods are loaded before objects are created).
// Can access only static data directly.


// For Static Variables
// Shared across all objects.
// Created when class is loaded, destroyed when JVM ends.
// Default values are assigned (like instance variables).

// For Static Methods
// Can call other static methods directly.
// Can access static variables directly.
// Cannot use this or super (because they relate to objects, not classes).

// Static Variables
// To count the number of objects created (object counter).
// To store constants (public static final PI = 3.14).

// Static Methods
// Utility classes like Math, Collections.
// Factory methods to create objects.




// A static block in Java is a special block of code that runs once when the class is loaded into memory — before the main method or any object creation happens.
//  static {
//         System.out.println("Static block executed");
//     }
//     You can’t use a constructor for static variables because constructors run after object creation.

//     Class.forName(ClassName:"Mobole"); If your class is loaded but we cant create object of that class
//  so your class is not print then to call class with static block we use this.