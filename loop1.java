import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the element");
        int n;
        n=data.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
                
            }
            System.out.println();
        }
    }
    
}
