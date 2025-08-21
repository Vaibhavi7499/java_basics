class UpcastingClass {
    public void show() {
        System.out.println("in upcasting class");
    }
}

class DowncastingClass extends UpcastingClass {
    
    public void show1() {
        System.out.println("in downcasting class");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        UpcastingClass obj = (UpcastingClass) new DowncastingClass(); // Upcasting
        obj.show();

        DowncastingClass obj1 = (DowncastingClass) obj; // Downcasting
        obj1.show1();
    }
}


// 1. Upcasting in Java:
// Converting a child class reference into a parent class reference.
// Done automatically (implicit casting).
// Safe conversion because every child is a type of parent.
// To achieve runtime polymorphism (method overriding).
// To write more generic code that works with parent type but executes child’s behavior.

// 2. Downcasting in Java :
// Converting a parent class reference into a child class reference.
// Done manually using casting operator (Child).
// Not always safe → requires instanceof check.

// Animal a = new Animal();
// Dog d = (Dog) a; // Runtime error: ClassCastException
// That’s why we use instanceof:
// if (a instanceof Dog) {
//     Dog d = (Dog) a;
//     d.fetch();
// }

// The instanceof operator in Java checks:
// Whether an object reference is an instance of a given class or its subclass.
// Returns true or false.

// 1.Type Checking
//  if (n instanceof Integer) {
//         System.out.println("It's an Integer");
//     } else if (n instanceof Double) {
//         System.out.println("It's a Double");
//     }