package day_4;

public class exception2 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside to 1st try");
            try{
                System.out.println("Inside to 2nd try");
                throw new ArrayIndexOutOfBoundsException();
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Handled IndexOutOfBound");
                throw new ArithmeticException();
            }
        }catch(ArithmeticException e){
            System.out.println("Handled Arithmetic exception in outer catch");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Nested Try-Catch demo....");
        }
    }
}
