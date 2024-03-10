public class INTERFACE {
    public static void main(String[] args) {
        king ob=new king();
        ob.move();
    }
}
interface chessplayer{
    void move();
}
class king implements chessplayer{
    public void move(){
        System.out.println("Move left,right,up,down,diagonal by 1");
    }
}
