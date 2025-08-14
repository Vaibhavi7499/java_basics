class A {
    public A() {
        this(6);
        System.out.println("in A");

    }

    public A(int a) {
        System.out.println("in A int ");

    }

}

class B extends A {
    public B() {
        super();
        System.out.println("in B");

    }

    public B(int b) {
        System.out.println("in B int");

    }

}

public class SuperEx {
    public static void main(String[] args) {
        B obj = new B();
    }
}


// The final keyword in Java is a non-access modifier that can be applied to 
// variables, methods, and classes — but it behaves differently in each case.
// A final variable becomes a constant once assigned a value — you can’t change it afterward.
// A final method cannot be overridden by subclasses.
// If a method parameter is declared as final, it cannot be reassigned within that method.