public class oops {
    public static void main(String[] args) {
         Student ob = new Student();
        ob.setname("Nitish");
        System.out.println(ob.name);
        ob.setpercentage(98, 96, 95);
        System.out.println(ob.percentage);
        ob.setpassword(1234);
        System.out.println(ob.getpassword());
        Pen p1=new Pen();
        p1.setcolor("red");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
    }
}


class Student {
    String name;
    int percentage;
    private int password;

    void setname(String Setname) {
        name = Setname;
    }

    void setpercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }

    void setpassword(int newpassword) {
        password = newpassword;
    }
    int getpassword(){
        return password;
    }
}
class Pen{
    private  String color;
    private  int tip;
    void setcolor(String color){
        this.color=color;
    }
    void settip(int tip){
        this.tip=tip;
    }
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
}
