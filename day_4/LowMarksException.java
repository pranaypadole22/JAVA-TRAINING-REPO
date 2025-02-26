package day_4;

public class LowMarksException extends Exception {
    private String myMsg;
    public LowMarksException(String myMsg){
        this.myMsg=myMsg;
    }
    public String getMyMsg(){
        return myMsg;
    }
}
