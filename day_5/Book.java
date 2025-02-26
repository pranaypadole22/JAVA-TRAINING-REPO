package day_5;
//It is a example of ArrayList(Collection framework)
public class Book {
    private String name,author;
    private double price;
    public Book(){
        super();
    }
    public Book(String name,String author,double price) {
        this.name = name;
        this.author=author;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getauthor(){
        return author;
    }
    public void setauthor(String author){
        this.author=author;
    }
    public double getprice(){
        return price;
    }
        public void setprice(double price){
        this.price=price;
    }
    public String toString(){
        return"name: "+name+"\tauthor: "+author+"\tprice: "+price;
    }
}

