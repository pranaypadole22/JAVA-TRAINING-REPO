package day_4;

public class UserDefinedEx {
    public static void main(String[] args) {
        Account ac=new Account(101,5000);
        System.out.println(ac);
        try{
            ac.withdraw();
        }catch (LowBalException e){
            System.out.println(e.getMyMsg());
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Final Balance is "+ac.getBalance());
        }
    }
}
