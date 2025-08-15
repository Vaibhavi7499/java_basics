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
