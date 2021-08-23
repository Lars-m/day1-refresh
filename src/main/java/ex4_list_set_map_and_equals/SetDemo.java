package ex4_list_set_map_and_equals;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>(); //= what can add here to get a specific implementation

        Person p1 = new Person("Peter");
        personSet.add(p1);
        Person p2 = new Person("Peter");
        personSet.add(p2);
        Person p3 = new Person("Janne");
        personSet.add(p3);
        //Add a "billion" more Persons
        Person px = new Person("George");
        personSet.add(px);

        System.out.println("p1 --> " + p1.getName());
        System.out.println("p2 --> " + p2.getName());
        //We are using a Set. How come we could insert two ""identical" Persons?
        //How can we solve this problem, to prevent duplicates?

        // Given the data above, how could check whether "George" exists in the list ?
    }


    //Hint --> Initializing a set in a "one-liner" using Java-8 Streams
    /*Set<Person> set = Stream.of(new Person("Peter"),new Person("Peter"),new Person("Janne"),new Person("George")).
            collect(Collectors.toCollection(HashSet::new)); */
}