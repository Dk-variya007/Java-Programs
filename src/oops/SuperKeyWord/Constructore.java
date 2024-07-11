package oops.SuperKeyWord;
class A2{
    A2(int a){
        System.out.println("A class constructor "+a);
    }
}
class B2 extends  A2{
    B2(){
        super(20);
        System.out.println("b class Constructor");
    }
}
public class Constructore {
    public static void main(String[] args) {
        B2 b=new B2();

    }
}
