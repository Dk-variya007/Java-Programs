package oops.constuctore;

public class copy_constructorewithdeepcopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Divyesh";
        s1.roll = 20;
        s1.password = "divyesh0910";
        s1.marks[0] = 100;
        s1.marks[1] = 20;
        s1.marks[2] = 43;

        Student1 s2 = new Student1(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student1{
    String name;
    int roll;
    String password;
    int marks[];

//deep copy Constructor
    Student1(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    Student1() {

        System.out.println("Constructor is called.....");
        marks = new int[3];
    }
}
