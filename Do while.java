import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        int c;
        System.out.println("enter the number");
        c=data.nextInt();
        do{
           if(c%2==0){
                System.out.println("even number :"+c);
                c--;
            }
            else{
                System.out.println("odd number :"+c);
                c--;
            } 
        }
        
        while(c>=0);
        
        
       
    }
}



    
}while(bolean_expression );
