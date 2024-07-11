package oops.SuperKeyWord;
class A1{
    void show(){
        System.out.println("hello A");
    }
}
class  B1 extends A1{
    void show(){
        super.show();
        System.out.println("hello B");
    }
}
public class Method {
    public static void main(String[] args) {
        B1 b=new B1();
        b.show();
    }
}
