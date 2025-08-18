class VaibhaviException extends Exception{
    public VaibhaviException(String string){
        super(string);
    }
}

public class ExceptionEx {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            j = 18 / i;
            throw new VaibhaviException("this is custom exception");
            //if(j==0)
            // throw new ArithmeticException();
        } catch (ArithmeticException e) {
            j=18/1;
            System.out.println("ArithmeticException");
        }
        catch (VaibhaviException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("something went wrong");
        }
        System.out.println(j);
    }
}

// class Exception1 {
//     static void demo(int age) throws Exception {
//         if (age < 18)
//             throw new Exception("Age must be 18 or above ");
//         else
//             System.out.println("valid age");
//     }
// }

// public class ExceptionEx {

// //     public static void main(String[] args) throws Exception {//declared throws
// // Exception1.demo(20);
// public static void main(String[] args) {
//     try {
//         Exception1.demo(20);
//     } catch (Exception e) {
// System.out.println("caught exception " + e.getMessage());
//     }
// }
//     }
//e is the Exception object.
//getMessage() is a method of the Throwable class (superclass of all exceptions).
//It returns the detail message string of the exception (the text passed when the exception was created).

//This is Checked exception must be handled (try-catch) or declared (throws).


// An exception is an unexpected event that disrupts the normal flow of a
// program.
// In Java, exceptions are objects that describe an error.

// Object
// └── Throwable
// ├── Error (serious problems, not handled usually)
// └── Exception
// ├── Checked Exceptions (compile-time)
// └── Unchecked Exceptions (runtime)

// 1. Error
// Serious issues that applications should not handle.
// Examples: OutOfMemoryError, StackOverflowError.

// 2. Checked Exceptions
// Checked at compile time.
// Must be handled using try-catch or throws.
// Examples: IOException, SQLException, ClassNotFoundException.

// 3. Unchecked Exceptions
// Checked at runtime (subclass of RuntimeException).
// Usually caused by programming mistakes.
// Examples: NullPointerException, ArrayIndexOutOfBoundsException,
// ArithmeticException.

// try → Block of code to monitor.
// catch → Handles exception.
// finally → Always executes (close resources like DB connection).
// throw → Used to explicitly throw an exception.
// throws → Used in method signature to declare exceptions.