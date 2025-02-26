package day_3;
interface UPI{
    void doTransaction();//by default public & abstract.
}
class PhonePay implements UPI{
    private String pname;
    public PhonePay(String pname){
        this.pname=pname;
    }
    public void doTransaction(){
        System.out.println("Doing transaction with "+pname);
    }
}
class GooglePay implements UPI{
    private String gname;
    public GooglePay(String gname){
        this.gname=gname;
    }
    public void doTransaction(){
        System.out.println("Doing transaction with "+gname);
    }
}
class AmazonPay implements UPI{
    private String aname;
    public AmazonPay(String aname){
        this.aname=aname;
    }
    public void doTransaction(){
        System.out.println("Doing transaction with "+aname);
    }
}
public  class interfaceDemo2 {
    public static void main(String[] args) {
        UPI u=new PhonePay("PhonePay");
        u.doTransaction();

        u=new GooglePay("GooglePay");
        u.doTransaction();

        u=new AmazonPay("AmazonPay");
        u.doTransaction();
    }
}
//abstract class ,method
//interaces