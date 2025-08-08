import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        
        System.out.println("My ID Facebook");
        String[] credentials = displayLoginForm();
        String username = credentials[0];
        String password = credentials[1];
        
        if (validateCredentials(username, password)) {
            System.out.println("Login successful!.");
            System.out.println("Welcome to Instagram.");
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }
    
    public static String[] displayLoginForm() {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter your username or email: ");
        String username = data.nextLine();
        System.out.print("Enter your password: ");
        String password = data.nextLine();
        return new String[]{username, password};
    }
    public static boolean validateCredentials(String username, String password) {
        String correctUsername = "nanmaran";
        String correctPassword = "therila";
        return username.equals(correctUsername) && password.equals(correctPassword);
    }
}


