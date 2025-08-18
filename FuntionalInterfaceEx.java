@FunctionalInterface
interface interface1{
    void show();
}

public class FuntionalInterfaceEx {
    public static void main(String[] args) {
        // interface1 obj = new interface1() {
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };

        interface1 obj = () ->System.out.println("in show");  //Lambda expression
        obj.show();
    }
}
