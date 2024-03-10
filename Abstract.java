public class Abstract {
    public static void main(String[] args) {
        Horse ob=new Horse();
        ob.walk();
    }
}
abstract class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal can eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk(){
        System.out.println("Horse walk with 4 legs");
    }

}