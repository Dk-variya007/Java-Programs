package oops;

//why we can create getter setter bcz private variable not access easily and uor private value not change by any one so we can access this value by getter setter
public class getr_setr {
    private int id;
    private String name;

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getId() {
        return this.id;
    }

    void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        getr_setr gs = new getr_setr();
        gs.setId(29);
        gs.setName("Divyesh");
        System.out.println("Name is " + gs.getName() + " and Id is " + gs.id);
    }
}
