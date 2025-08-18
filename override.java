class Vehicle{
    public void drive(){
        System.out.println("driving vehicle");
        
    }
}
class Bike extends Vehicle {
    @Override
    public void drive()
   {
       System.out.println("driving bike");
   }
}
class car extends Vehicle {
    @Override
    public void drive()
   {
       System.out.println("driving car");
   }
}

class Main{
    public static void main(String[]args) {
        Vehicle v= new Bike();
        v.drive();
        
        Vehicle a=new car();
        a.drive();
        
        Vehicle b= new Vehicle();
        b.drive();
        
    }
}
