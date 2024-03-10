public class cons1 {
    public static void main(String[] args) {
        Student s1=new Student("Nitish",14);
        s1.marks[0]=97;
        s1.marks[1]=98;
        s1.marks[2]=99;
        Student s2=new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        s1.marks[1]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]+"  ");
        }
    }
}
class Student{
    String name;
    int roll;
    int marks[];
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
        marks=new int[3];
    }
    //shallow copy constructor//
      Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
    //deep copy constructor//
    /*Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }*/

}
