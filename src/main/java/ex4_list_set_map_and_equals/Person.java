package ex4_list_set_map_and_equals;

import java.util.Objects;

public class Person {
    private String name;
    // private int id;
    // private static int nextId;

    public Person(String name) {
        this.name = name;
        //this.id = nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name; }

}
