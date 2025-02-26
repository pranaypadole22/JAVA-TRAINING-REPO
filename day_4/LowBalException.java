package day_4;
//Custom/User-defined Exception in Java-
//1)Write a class extend it from Exception class.
//2)Write Proper data members and constructors,methods.
//3)Throw the object of this exception,were ever required.
public class LowBalException extends Exception {
    private String myMsg;
    public LowBalException(String myMsg){
        this.myMsg=myMsg;
    }
    public String getMyMsg(){
        return myMsg;
    }

}
