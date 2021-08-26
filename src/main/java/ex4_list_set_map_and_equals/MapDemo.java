package ex4_list_set_map_and_equals;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<PersonWithId,Integer> personMap = new HashMap<>();//= what can we add here to get a specific implementation so the following will work
        PersonWithId p1 = new PersonWithId("Peter");
        personMap.put(p1,p1.getId());
        //How can we add p1 to personMap?
        PersonWithId p2 = new PersonWithId("Peter");
        //add p2 to personMap
        PersonWithId p3 = new PersonWithId("Janne");
        //add p3 to personMap


        //Add a "billion" more Persons
        PersonWithId px = new PersonWithId("George");
        //app px to personMap

        // Given the data above, how could check whether "George" exists in the list and get him ?
    }
}
