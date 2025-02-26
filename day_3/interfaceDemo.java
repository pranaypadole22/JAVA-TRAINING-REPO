package day_3;
//Interface
//1.It is a suntactical contract between consumer and provider

interface  Transaction{
    //public  abstract.
    void showTransaction();
    double getAmount();
}
class College implements Transaction{
    private String cname;
    private double fees;
    public College(String cname,double fees){
        this.cname=cname;
        this.fees=fees;
    }
    public void showTransaction(){
        System.out.println("College Name: "+cname);
        System.out.println("Fees"+fees);
    }
    public double getAmount(){
        return fees;
    }
}

class Mall implements Transaction{
    private String mname;
    private double bill_amt;
    public Mall(String mname,double bill_amt){
        this.mname=mname;
        this.bill_amt=bill_amt;
    }

    @Override
    public void showTransaction() {
        System.out.println("Mall Name: "+mname);
        System.out.println("Bill"+bill_amt);
    }
    public double getAmount(){
         return bill_amt;
    }
}
public class interfaceDemo {
    public static void main(String[] args) {
Transaction t=new Mall("ASD",4000);
t.showTransaction();

t=new College("SDS",1000);
t.showTransaction();

    }
}
