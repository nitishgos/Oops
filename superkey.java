public class superkey {
    public static void main(String[] args) {
        Horse ob=new Horse();
        System.out.println(ob.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="White";
        System.out.println("Horse constructor called");
    }
}
