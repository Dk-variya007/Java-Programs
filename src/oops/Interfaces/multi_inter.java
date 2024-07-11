package oops.Interfaces;

interface nonvage{
    void eatnonvage();
}
interface  vage{
    void eatvage();
}
class man implements nonvage,vage{
    @Override
    public void eatnonvage() {
        System.out.println("mans eat nonvage");
    }

    @Override
    public void eatvage() {
        System.out.println("mans eat vage");
    }
}
public class multi_inter {
    public static void main(String[] args) {
            man m=new man();
            m.eatnonvage();
            m.eatvage();
    }
}
