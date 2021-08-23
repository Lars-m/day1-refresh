package ex4_list_set_map_and_equals;

import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Person> persons = null; //= what can we add here to get a specific implementation so the following will work

        Person p1 = new Person("Peter");
        persons.add(p1);
        Person p2 = new Person("Peter");
        persons.add(p2);
        Person p3 = new Person("Janne");
        persons.add(p3);
        //Add a "billion" more Persons
        Person px = new Person("George");
        persons.add(px);
        // Given the data above, how could check whether "George" exists in the list ?
    }

    //Hint: OneLiner to do what we did above. Above was to make it very clear what we did
    //List<Person> persons = new ArrayList<Person>(Arrays.asList(new Person("Peter"),new Person("Peter"),new Person("Janne"),new Person("George")));
}
