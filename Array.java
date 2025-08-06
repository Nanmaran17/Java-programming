import java.util.Scanner;

class main{
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        
        System.out.println("Enter the no of elements");
        int size = data.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements:");
        
        for(int i=0;i<size;i++){
            arr[i] = data.nextInt();
            
        }
        System.out.println("The elements of the array:");
        for(int num : arr){
            System.out.println("num");
            
        }
        data.close();
       
        
    }
}
