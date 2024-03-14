public class com {
    public static void main(String[] args) {
        Complex ob=new Complex(2,5);
        Complex ob1=new Complex(1,3);
        Complex ob3= Complex.add(ob,ob1);
        ob.printComplex();
        ob3.printComplex();
    }
}
class Complex{
    int real;
    int imag;
    Complex(int r,int i){
        real=r;
        imag=i;
    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    public static Complex Subs(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }else 
        if(real!=0 && imag==0){
            System.out.println(real);
        }else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}