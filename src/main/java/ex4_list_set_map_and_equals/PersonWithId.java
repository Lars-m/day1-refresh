package ex4_list_set_map_and_equals;

public class PersonWithId {
    private String name;
    private int id;
    private static int nextId;

    public PersonWithId(String name) {
        this.name = name;
        //this.id = nextId++;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name; }

    //Why only a getter for this field?
    public int getId() {return id;}
}
