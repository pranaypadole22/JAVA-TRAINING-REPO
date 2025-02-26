package day_3;
//Concept of method oveeriding-same name,same parameter,same return type but different inherited classes.(Runtime Polymorphism)
    class Emp{
        private int id;
        private String name;
        private  double bs;
        public Emp(){
            System.out.println("This is default constructor");
        }

        public Emp(int id,String name,double bs){
            this.id=id;
            this.name=name;
            this.bs=bs;
        }
        public String toString(){
            return "\nId= "+id+"\n Name="+name+"\nbs= "+bs;
        }
        public double calSal(){
            return bs;
        }
    }
    class Wemp extends Emp{
        private double hrs,rate;
        public Wemp(){
            super();
        }
        public Wemp(int id,String name,double bs,double hrs,double rate){
            super(id,name,bs);
            this.hrs=hrs;
            this.rate=rate;
        }
        public double calSal(){
            return super.calSal()+hrs*rate;
        }
        public String toString(){
           return  super.toString()+"\n Hrs="+hrs+"\nRate= "+rate;
        }
    }
    class Manager{
        private int id;
        private String name;
        private double bs;
        public Manager(){
            System.out.println("Default constructor");
        }
        public Manager(int id,String name,double bs){
            this.id=id;
            this.name=name;
            this.bs=bs;
        }
        public String toString(){
            return "\nId= "+id+"\n Name="+name+"\nbs= "+bs;
        }
        public double calSal(){
            return bs;
        }
    }

    class WManager extends Manager{
        private double hrs,rate;
        public WManager(){
            super();
        }
        public WManager(int id,String name,double bs,double hrs,double rate){
            super(id,name,bs);
            this.hrs=hrs;
            this.rate=rate;
        }
        public double calSal(){
            return super.calSal()+hrs*rate;
        }
        public String toString(){
            return  super.toString()+"\n Hrs="+hrs+"\nRate= "+rate;
        }
    }
public  class Overridingemo{
    public static void main(String[] args) {
        Emp e=new Wemp(2,"Pranay",60000,25,67);
        System.out.println("Type of obj="+e.getClass());
        System.out.println(e);
        double s=e.calSal();
        System.out.println("Salary="+s);

        Manager m= new WManager(22,"Pranay",90000,24,89);
        System.out.println(m);
        double sa= m.calSal();
        System.out.println("Salary="+sa);
    }
}
//Practice Problem
//batsman bowler




