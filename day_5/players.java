package day_5;

public class players {
    private String name;
    private String jersy_no;
    private double run;

    public players(String name, String jersy_no, double run) {
        this.name = name;
        this.jersy_no = jersy_no;
        this.run = run;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJersy_no() {
        return jersy_no;
    }

    public void setJersy_no(String jersy_no) {
        this.jersy_no = jersy_no;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }
    public String toString(){
        return"name: "+name+"\tjersy_no: "+jersy_no+"\tRun: "+run;
    }

}
