package day_5;
//it is used to compare collection.
//it is used for sorting
//it is sort on one criteria
//it has only method.
//      public int CompareTo(Object obj){
//          //this=first object;
//          }
//For ascending
//-It returns 1,value1>value2.
//It returns -1,value1<value2
//It returns 0,value1==value2
//It is in package java.lang
public class comparableInterface implements Comparable<comparableInterface>{
    private int rollNo;
    private String name;
    private double marks;

    public comparableInterface() {
        super();
    }
    public comparableInterface(int rollNo, String name, double marks) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public String toString(){
        return"[Roll No;"+rollNo+"\tName:"+name+"\tmarks:"+marks+"]";
    }

    @Override
    public int compareTo(comparableInterface s2) {
        //this=& of 1st student
        //Ascending sorting
        if(this.marks >s2.marks)
            return 1;
        else
            if(this.marks< s2.marks)
                return -1;
                else
                    return 0;
    }
}
