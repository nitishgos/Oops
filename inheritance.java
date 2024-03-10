public class inheritance {
    public static void main(String[] args) {
        Fish sharke=new Fish();
        sharke.swim();
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
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
    void flips(){
        System.out.println("Flips");
    }
}
