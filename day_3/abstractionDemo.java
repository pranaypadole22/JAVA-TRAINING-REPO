package day_3;
//Task(Problem Statement)
////Write ans abstract class RBI with abstract method showInterestrate Extend to its SBI,AXIS,ICICI class create array of object and invoke the method
abstract class RBI{
        abstract void showInterestRate();
}
 class SBI extends RBI{
    void showInterestRate(){
        System.out.println("SBI interest Rate 10%");
    }
}
class AXIS extends RBI{
    @Override
    void showInterestRate() {
        System.out.println("AXIS interest Rate 2%");
    }
}
class ICICI extends RBI{
    @Override
    void showInterestRate() {
        System.out.println("ICICI interest Rate 12%");
    }
}
public class abstractionDemo {     
    public static void main(String[] args) {
        //by using normal object creation method.
//        RBI r1=new SBI();
//        RBI r2=new AXIS();
//        RBI r3=new ICICI();
//        r1.showInterestRate();
//        r2.showInterestRate();
//        r3.showInterestRate();
//
        // Using Array of object method
        RBI[] banks = {new SBI(), new AXIS(), new ICICI()};

        for (RBI bank : banks) {
            bank.showInterestRate();
        }
    }
}
