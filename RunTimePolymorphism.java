class Demo {
    public void show() {
        System.out.println("in Demo");
    }
}

class Demo1 extends Demo {
    public void show() {
        System.out.println("in Demo1");
    }
}

class Demo2 extends Demo {
    public void show() {
        System.out.println("in Demo2");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();

        obj = new Demo1();
        obj.show();

        obj = new Demo2();
        obj.show();

    }

}


// Dynamic Method Dispatch in Java also called runtime polymorphism is the
//  mechanism by which the overridden method that gets executed is determined at
//   runtime (not compile time) based on the actual object the reference is pointing to.
//   Decided at runtime using the object type, not the reference type.
//   At compile time, the compiler only checks if the method exists in the reference type.
// At runtime, the JVM looks at the actual object type and calls the correct overridden method.