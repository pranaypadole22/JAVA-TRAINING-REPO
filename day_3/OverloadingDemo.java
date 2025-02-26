package day_3;
//Concept method overloading- Same name but different parameters,datatypes,order.
public class OverloadingDemo {
    public double add(double x,double y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public double add(double x,double y,double z){
        return x+y+z;
    }

    public static void main(String[] args) {
        OverloadingDemo obj=new OverloadingDemo();
        System.out.println("Add two int's "+obj.add(2,3));
        System.out.println("Add three double's "+obj.add(2.2,3.3,5.5));
        System.out.println("Add three int's "+obj.add(2,3,12));

    }
}

//Q.2
