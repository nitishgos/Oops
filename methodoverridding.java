public class methodoverridding {
    public static void main(String[] args) {
        Deer ob=new Deer();
        ob.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
