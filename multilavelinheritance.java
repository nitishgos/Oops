public class multilavelinheritance {
    public static void main(String[] args) {
        Dogs ob=new Dogs();
        ob.legs=4;
        ob.breed="german sheppard";
        ob.eats();
        System.out.println(ob.legs);
        System.out.println(ob.breed);
    }
}
class Animal{
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
class Mammal extends Animal{
    int legs;
}
class Dogs extends Mammal{
    String breed;
}
