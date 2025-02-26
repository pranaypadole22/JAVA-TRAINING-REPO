package day_4;
import java.util.Scanner;
public class Account {
    private int accNo;
    private double balance;
    public Account(int accNo,double balance){
        this.accNo=accNo;
        this.balance=balance;
    }
     public String toString(){
        return "\nAccNo="+accNo+"\n Balance="+balance;
    }
    public double getBalance(){
        return balance;
    }
    public void withdraw() throws LowBalException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        double amt=sc.nextDouble();
        if(amt>balance){
            throw new LowBalException("Exception:Bal is Low...(Paise t tak ga )");
        }else{
            balance=balance-amt;
            System.out.println("Balance after withdraw is "+balance);
        }
    }
}
