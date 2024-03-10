public class hierinheritance {
    public static void main(String[] args) {
        Mammal ob1=new Mammal();
        Birds ob2=new Birds();
        Fish ob=new Fish();
        ob1.eats();
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
