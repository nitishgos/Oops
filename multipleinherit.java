public class multipleinherit {
    public static void main(String[] args) {
        Beer ob=new Beer();
        ob.eat();
    }
}
interface carnivore{
    void eat();
}
interface harbivore{
    void eat();
}
class Beer implements carnivore,harbivore{
    public void eat(){
        System.out.println("Eat grass and meat both");
    }
}
