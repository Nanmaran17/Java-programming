class cars{
    void sound(){
        System.out.println("Cars makes a sound");
        
    }
}

class BMW extends cars{
    void sound(){
        System.out.println("BMW");
        
    }
}

class Audi extends cars{
    void sound(){
        System.out.println("Audi");
        
    }
}

class Benz extends cars{
    void sound(){
        System.out.println("Benz");
        
    }
}

public class Main{
    public static void main(String[]args){
        cars a;
        
        a = new BMW();
        a.sound();
        
        a = new Audi();
        a.sound();
        
        a = new Benz();
        a.sound();
    }
}

//family branch

import java.util.Scanner;
class Family{
    Scanner data = new Scanner(System.in);
    void sound(){
        System.out.println("Family Branch");
        
    }
}

class Thaatha extends Family{
    void sound(){
        System.out.println("Enter the Thaatha name");
        int a = data.nextInt();
        
        
    }
}

class Aaya extends Family{
    void sound(){
        System.out.println("Enter the Aaya name");
        int a = data.nextInt();
        
    }
}

class Appa extends Family{
    void sound(){
        System.out.println("Enter the Appa name");
        int a = data.nextInt();
        
    }
}

class Amma extends Family{
    void sound(){
        System.out.println("Enter the Amma name");
        int a = data.nextInt();
    }
}

public class Main{
    public static void main(String[]args){
        Family a;
        
        a = new Thaatha();
        a.sound();
        
        a = new Aaya();
        a.sound();
        
        a = new Appa();
        a.sound();
        
         a = new Amma();
        a.sound();
    }
}

//four wheeler

import java.util.Scanner;
class Vehicle{
    void vehicle(){
        System.out.println("Vehicle");
    }
}

class FourWheeler extends Vehicle{
    FourWheeler(){
        System.out.println("FourWheeler");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("Car");
    }
}

public class Main{
    public static void main(String[] args){
        Car obj = new Car();
        
    }
}

// heiraricle

import java.util.Scanner;
class Vehicle{
    
    Vehicle(){
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        System.out.println("This is a car");
    }
}

class Bus extends Vehicle{
    Bus(){
        System.out.println("This is a bus");
    }
}

public class Main{
    public static void main(String[] args){
        Car obj1 = new Car();
        Bus obj2 = new Bus();
        
    }
}

//Multiple inheritance

import java.util.Scanner;
interface Audi{
    
    default void modleofAudi(){
        System.out.println("This is a modleAudi");
    }
}

interface BMW{
    default void modleofBMW(){
        System.out.println("This is a modleBMW");
    }
}

class Car implements Audi,BMW{
    Car(){
        System.out.println("This is a Cars");
    }
}

public class Main{
    public static void main(String[] args){
        Car obj = new Car();
        obj.modleofAudi();
        obj.modleofBMW();
    }
}
