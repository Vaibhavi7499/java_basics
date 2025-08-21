public class WrapperClassEx {
    public static void main(String[] args) {
        int n1 = 20;
        // Integer obj = Integer.valueOf(n1);  //manual boxing
        // int primitive = obj.intValue();     //manual unboxing


         Integer obj = n1;        //autoboxing
        int primitive = obj;      //autounboxing
        System.out.println(obj);
        System.out.println(primitive);
    }
}

// In Java, wrapper classes are object representations of primitive data types.
// They “wrap” a primitive value inside an object.
// Example:
// int → Integer
// char → Character
// double → Double
// 👉 All wrapper classes are in the package java.lang.

// In Java, a wrapper class is a class that wraps (encapsulates) a primitive data
//  type into an object so it can be used where objects are required (like in
//   collections, generics, etc.).
//   But Java collections (ArrayList, HashMap, etc.) cannot store primitives directly — they work with objects.
// Object Requirement : Many frameworks (like Collections, JDBC, Hibernate) work only with objects, not primitives.
// Example: ArrayList<int> ❌ → ArrayList<Integer> ✅

// Utility Methods:Wrapper classes provide useful methods.
// Example: Integer.parseInt("123") converts a string to int.

// Autoboxing and Unboxing :Java automatically converts between primitives and wrappers.
// Makes coding easier.

// Nullability :Wrappers can be null (primitives cannot). Useful in databases where a value can be missing.

// Type Conversion:Wrappers help convert values between different types.
// Example: Double.valueOf("3.14").

// Autoboxing → primitive → wrapper automatically.

// Unboxing → wrapper → primitive automatically.

// Immutable → Once created, wrapper objects cannot change their value.

// Stored in Heap → Unlike primitives stored in stack.