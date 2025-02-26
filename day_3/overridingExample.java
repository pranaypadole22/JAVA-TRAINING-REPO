package day_3;
class Player{
    public String title;

    public void Who(){
        System.out.println("I am Player");
    }
}
class Batsman extends Player{
    @Override
    public void Who() {
        super.Who();
        System.out.println("I am Batsman");
    }
}
class Bowler extends Player{
    @Override
    public void Who() {
        //super.Who();
        System.out.println("I am Bowler");
    }
}
public class overridingExample {
    public static void main(String[] args) {
        Player p1=new Batsman();
        Player p2=new Bowler();
        p1.Who();
        p2.Who();
    }
}
