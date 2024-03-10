public class hybridinheritance {
    public static void main(String[] args) {
        Human ob=new Human();
        ob.eats();
    }
}
class Animals{
    String color;
    void colors(String color){
        this.color=color;
    }
    void eats(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Breathes");
    }
}
class Mammal extends Animals{
    void walk(){
        System.out.println("Walks");
    }
}
class Birds extends Animals{
    void fly(){
        System.out.println("Fly");
    }
}
class Fish extends Animals{
    void swim(){
        System.out.println("Swim");
    }
}
class Human extends Mammal{
    void speaks(){
        System.out.println("speak");
    }
}