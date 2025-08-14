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
