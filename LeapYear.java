import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        
        if (year % 400 == 0) {
            System.out.println(year + " is divisible by 400.");
        } else {
            System.out.println(year + " is not divisible by 400.");
        }
        
        
        scanner.close();
    }
}
