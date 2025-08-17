// 1. enum with constructor and field
// enum Status{
//     NEW("not started"),
//     IN_PROGRESS("work going on"),
//     COMPLETED("task done");

//     private String description;

//     private Status(String description){
//         this.description = description;
//     }

//      public String getdescription(){
// return description;
//     }
// }

// public class EnumEx {
//     public static void main(String[] args) {
//         for(Status s : Status.values()){
//             System.out.println(s + ":" + s.getdescription());
//         }
//     }
// }

//2. enum with switch statement
// enum Day{
//     SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
// }

// public class EnumEx{
//     public static void main(String[] args) {
//         Day d = Day.THURSDAY;

//         switch (d) {
//             case MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY -> System.out.println("working day");
                
//              default -> System.out.println("weekend");
//         }
//     }
// }

// 3. enum implementing an interface
// interface Operation{
//     int apply(int a, int b);
// }

// enum MathOperation implements Operation{
//     ADD{public int apply(int a, int b){return a+b ;}},
//     SUB{public int apply(int a, int b){return a-b ;}},
//     MUL{public int apply(int a, int b){return a*b ;}},
//     DIV{public int apply(int a, int b){return a/b ;}},
// }
// public class EnumEx{
//     public static void main(String[] args) {
//         System.out.println(MathOperation.ADD.apply(10,2));
//         System.out.println(MathOperation.SUB.apply(10,5));
//         System.out.println(MathOperation.MUL.apply(10,2));
//         System.out.println(MathOperation.DIV.apply(10,2));
//     }
// }

// 4. enum singletone pattern
enum Singleton{
    INSTANCE;

    public void showmsg(){
        System.out.println("hello from singleton");
    }
}
public class EnumEx {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.INSTANCE;
        Singleton obj2 = Singleton.INSTANCE;
        obj2.showmsg();
        System.out.println(obj1 == obj2);
        
    }
}










// enum (short for enumeration) is a special data type in Java that is used to define 
// a collection of named constants (fixed set of values).
// Introduced in Java 5.
// It makes the code more readable, type-safe, and maintainable compared to using
//  plain int or String constants.
// enum constants are public, static, and final by default.
// Every enum implicitly extends java.lang.Enum, so it cannot extend another class (but can implement interfaces).

// enum can have:fields ,constructors (private),methods
// We cannot use new to create enum objects → they are created automatically.
// Enums are type-safe → You can’t assign anything else to a variable of type Day.