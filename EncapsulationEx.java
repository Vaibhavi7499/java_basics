class Human {
    private int age;
    private String name;

    public void setAgeName(int a, String n) {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class EncapsulationEx {
    public static void main(String args[]) {
        Human obj = new Human();
        obj.setAgeName(20, "vaibhavi");

        System.out.println(obj.getAge() + ":" + obj.getName());
    }
}


// Encapsulation in Java is the object-oriented programming principle of wrapping data (variables) and methods (functions) into a single unit and restricting direct access to that data.

// Think of it like a capsule — you hide the medicine inside and only allow controlled access through a protective cover.

// Hiding the internal state of an object.

// Providing controlled access to it using getters and setters.
// Make instance variables private (hidden from outside classes).

// Provide public getter and setter methods to access/update them.

// Data security → Prevents unauthorized changes.

// Control → You decide how data is modified.

// Flexibility → You can change internal logic without affecting outside code.

// Maintainability → Code is easier to debug and modify.