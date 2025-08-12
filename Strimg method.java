progran

class main{
    
    public class CodePoint {
        
        public static void main(String[] args) {
            Scanner data = new Scanner(System.in);
            String data1 = "Hi";
            String data2 = "Hi"; 
            int a = data1.codePointAt(0);
            System.out.println("Code point at index 0: " + a);
            int b = data2.codePointBefore(1);
            System.out.println("Code point before index 1: " + b);

            
        
        }
    }
}
