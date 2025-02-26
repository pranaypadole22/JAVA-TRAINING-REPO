//package day_4;
//
//import java.util.Scanner;
//
//public class Student {
//    private double mark;
//    public Student(double mark){
//        this.mark=mark;
//    }
//    public String toString(){
//        return "\nMark="+mark;
//    }
//    public double getMarks(){
//        return mark;
//    }
//    public void withdraw() throws LowMarksException{
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Marks ");
//        double Inmarks = sc.nextDouble();
//        if(Inmarks<30){
//            throw new LowMarksException("Exception:Marks is Less you are fail");
//        }else{
//            balance=balance-amt;
//            System.out.println("Balance after withdraw is "+balance);
//        }
//    }
//}
//
////Write a mystack class write 2 methods push pop and from push get stack overlow exception and from pop stack underflow exception.
////grading system lowmarksException