public class cons {
    public static void main(String[] args) {
        Student s1 = new Student();  
          Student s2=new Student("Nitish");
        Student s3=new Student(14);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;
    Student() {
        System.out.println("This is Nitish....");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
