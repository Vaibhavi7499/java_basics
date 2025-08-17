// class OuterClass{
//     public void show(){
//         System.out.println("in show");
//     }

//     static class InnerClass{
//         public void demo(){
//         System.out.println("in demo");
//     }
//     }
// }

// public class InnerClassEx {
//     public static void main(String[] args) {
//         OuterClass obj = new OuterClass();
//         obj.show();

//         // OuterClass.InnerClass obj1 = obj.new InnerClass();  
//         OuterClass.InnerClass obj1 = new OuterClass.InnerClass();   //for static class
//         obj1.demo();
//     }
// }


//Anonymous inner class
// class OuterClass {
//     public void show() {
//         System.out.println("in show");
//     }
// }

// public class InnerClassEx {
//     public static void main(String[] args) {
//         OuterClass obj = new OuterClass() {
//             public void show() {
//                 System.out.println("in new show");
//             }
//         };
//         obj.show();
//     }
// }


//Anonymous inner class

abstract class OuterClass {
    public abstract void show() ;
    public abstract void demo() ;
}

public class InnerClassEx {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass() {
            public void show() {
                System.out.println("in new show");
            }

             public void demo() {
                System.out.println("in new demo");
            }
        };
        obj.show();
        obj.demo();
    }
}