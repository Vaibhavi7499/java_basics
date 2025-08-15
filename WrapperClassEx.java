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



// In Java, a wrapper class is a class that wraps (encapsulates) a primitive data
//  type into an object so it can be used where objects are required (like in
//   collections, generics, etc.).
//   But Java collections (ArrayList, HashMap, etc.) cannot store primitives directly — they work with objects.
// Wrapper classes allow us to:

// Treat primitive values as objects.

// Use them in collections, generics, method parameters.

// Provide utility methods (parsing, conversions).

// Since Java 5:

// Autoboxing → primitive → wrapper automatically.

// Unboxing → wrapper → primitive automatically.

// Immutable → Once created, wrapper objects cannot change their value.

// Stored in Heap → Unlike primitives stored in stack.