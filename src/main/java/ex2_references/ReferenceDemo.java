package ex2_references;

class Player {
    String name;
    int points;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getPoints() {return points;}
    public void setPoints(int points) {this.points = points; }
}


public class ReferenceDemo {
   public static void main(String[] args) {
        Player player1;
        player1 = new Player("Peter");
        Player player2;
        player2 = new Player("Janne");
        player2 = player1;
        player2.setName("John");

        //What is the name of Player-1. Answer WITHOUT running the code, and then check by running the example
        System.out.println("Name of Player-1 "+player1.getName());
    }
}
