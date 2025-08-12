//code point at 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data1 = "Hello";
        String data2 = "Hello";
        int mystr = data1.codePointAt(0);
        int result = data1.compareTo(data2);
        System.out.print("Enter a character: ");
        char y = sc.next().charAt(0);
        int sec = data1.codePointAt(0);
        System.out.println("Code point at 0: " + mystr);
        System.out.println("Comparison result: " + result);
        System.out.println("You entered: " + y);
        System.out.println("Second code point (same as first here): " + sec);
        sc.close();
    }
}

// code point count


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
   
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the String1");
        String x = data.nextLine();
        System.out.println("Enter the String2");
        String y = data.nextLine();
       
        int a = x.codePointCount(0,4);
        System.out.println(a);
       
        int b = x.compareTo(y);
        System.out.println(b);
    }
}

// compare to ignore

import java.util.Scanner;

class Main {
    public static void main(String[] args21) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your character: ");
        String name = data.nextLine();
        System.out.println("Your GirlFriend Name!: ");
        String Hobby = data.nextLine();
        
        int myresult = name.compareToIgnoreCase(Hobby);
        String result = name.concat(Hobby);
        
        System.out.println(myresult);
        System.out.println(result);
    }
}

// equals ignore

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name =x.nextLine();
        System.out.println("Enter your age ");
        int age =x.nextInt();
        String str=" Hello";
        String hi="Hi %s Myage %d";
    
        System.out.println(str.equalsIgnoreCase("hello"));
        System.out.println(String.format(hi,name,age));
        
        
        
    }
}

//

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Char[] data = {'0','1','2','3','4','5','6','7','8','9'};
	    
		System.out.println(data);
		String mystring = "Maran";
		mystring.getChar(0,3 , data, 0);
		System.out.println(data);
		
	}
}

//getBytes

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    String name = "Maran";
	    byte [] a = name.getBytes();
	    System.out.println(a[3 ]);
		
	}
}
