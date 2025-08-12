import java.util.Scanner;

public class SwitchEx{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day:");
        String day = sc.nextLine();
        switch(day){
            case "Sunday" ,"Saturday" -> System.out.println("Weekend");
            case "Monday","Tuesday","Wednesday","Thursday","Friday"  ->System.out.println("Work day");
            default ->  System.out.println("Invalid");
        }
        sc.close();
    }
}