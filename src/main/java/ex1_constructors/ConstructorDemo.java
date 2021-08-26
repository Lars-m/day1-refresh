package ex1_constructors;


//How many constructors does this class have (0, or 1, or many) ?
class Dummy {
    String str;
    int number;

    public Dummy(String str, int number) {
        this.str = str;
        this.number = number;
    }

    public Dummy() {

    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Dummy d = new Dummy();
    }
}

