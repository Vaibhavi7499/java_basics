// class Thread1 extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++)
//             System.out.println("hii");
//         try {
//             Thread.sleep(10);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }

//     // public void run() {
//     //     show();
//     // }
// }

// class Thread2 extends Thread {
//     public void run() {
//         for (int i = 0; i < 100; i++)
//             System.out.println("hELLO");
//         try {
//             Thread.sleep(10);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }

//     // public void run() {
//     //     show();
//     // }
// }

// public class ThreadEx {
//     public static void main(String[] args) {
//         Thread1 obj = new Thread1();
//         Thread2 obj1 = new Thread2();
//         obj.start();
//         try {
//             Thread.sleep(5);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         obj1.start();
//     }
// }

//Runnable interface

// class Thread1 implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hii");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class Thread2 implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hELLO");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class ThreadEx {
//     public static void main(String[] args) {
//         // Runnable obj = new Thread1();
//         // Runnable obj1 = new Thread2();
//         Runnable obj = () -> {
//             for (int i = 1; i <= 5; i++) {
//                 System.out.println("hii");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         };
//         Runnable obj1 = () -> {
//             for (int i = 1; i <= 5; i++) {
//                 System.out.println("hELLO");
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         };

//         Thread t1 = new Thread(obj);
//         Thread t2 = new Thread(obj1);
//         t1.start();
//         t2.start();
//     }
// }



//Race condition

class Counter{
    int count=0;
    public synchronized void increment(){
        count++;
    }
}

public class ThreadEx {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();

        Runnable obj = () -> {
            for (int i = 1; i <= 1000; i++) {
               c.increment();
            }
        };
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
               c.increment();
            }
        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
