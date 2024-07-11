package oops.constuctore;

public class copy_constructerwithshallow {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Divyesh";
        s1.roll = 20;
        s1.password = "divyesh0910";
        s1.marks[0] = 100;
        s1.marks[1] = 20;
        s1.marks[2] = 43;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    Student() {

        System.out.println("Constructor is called.....");
        marks = new int[3];
    }

}
