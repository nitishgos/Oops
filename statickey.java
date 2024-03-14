public class statickey {
    public static void main(String[] args) {
        Student ob1=new Student();
        ob1.setname("nitish");
        ob1.schoolname="KV";
        System.out.println(ob1.schoolname);
        Student ob2=new Student();
        System.out.println(ob2.schoolname);
    }
}
class Student{
    String name;
    int roll;
     static String schoolname;
     void setname(String name){
      this.name=name;
     }
     String getname(){
        return this.name;
     }
     void setroll(int roll){
        this.roll=roll;
     }
     int getroll(){
        return this.roll;
     }
     static int avgmark(int phy,int chem,int math){
        return (phy+chem+math)/3;
     }
}
