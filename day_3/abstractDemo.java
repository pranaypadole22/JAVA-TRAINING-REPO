package day_3;
////abstract class:
//// 1.it is class whose obj is not created
//// 2.it contains constructor,abstract method as well as non abstract method;
////3.it is wriiten without abstract method also;
//// abstract method:
//// 1.it is a method which do not have implemaentation
//// 2.it is must overriden in derived classes.
//abstract class Shape{
//    public Shape(){
//        System.out.println("Default constructor");
//    }
//    public void dis(){
//        System.out.println("In non-abs method disp()");
//    }
//    public abstract int  area();
//}
//  class Circle extends Shape{
//   private double r;
//   public Circle(double r){
//       this.r=r;
//   }
//   public void area(){
//       System.out.println("Area of circle is"+3.14*r*r);
//   }
//   public String toString(){
//       return "\nRadius="+r;
//   }
//}
//
//abstract  class Rectangle extends Shape{
//    private double len,brd;
//
//}
//
//public class abstractDemo {
//    public static void main(String[] args) {
//        //Array of objects
//        Shape Saar[]=new Shape[2];
//        Saar[0] = new Circle(4.5);
//        //Saar[1] = new Rectangle(4, 5);
//
////   Shape S=new Circle(4.5); //it gives error bcoz obj of abstract class not be created
//        for (Shape s:Saar) {
//            System.out.println("Type of Obj is :"+s.getClass());
//            System.out.println(s);
//            s.area();
//
//        }
//
//}
//}
//Example
// Abstract class Shape
abstract class Shape {
    abstract void draw(); // Abstract method

    void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

// Subclass Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Main class
public class abstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();  // Upcasting: Parent reference, Child object
        Shape s2 = new Rectangle();

        s1.draw();    // Calls Circle's draw()
        s1.display(); // Calls Shape's display()

        s2.draw();    // Calls Rectangle's draw()
        s2.display(); // Calls Shape's display()
    }
}
