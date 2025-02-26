package day_3;
//Method overloading Example
public class area {
    public double areaCalculator( double r){
        return 3.14*r*r;
    }
    public  int areaCalculator(int length,int breadth){
        return length*breadth;
    }

    public static void main(String[] args) {
        area obj= new area();
        System.out.println("Area of circle: "+obj.areaCalculator(5.6));
        System.out.println("Area of rectangle: "+obj.areaCalculator(6,5));
    }
}
