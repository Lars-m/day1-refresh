package ex3_interface_polymorphishm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

interface TransportStrategy {
    String goToAirport();

    /*  // New stuff you can do with interfaces
        static TransportStrategy busStrategy() {
            return () -> "Cool, went to airport by bus";
        }
        static TransportStrategy taxiStrategy() {
            return () -> "Went to airport by Taxi";
        }
        static TransportStrategy ownCarStrategy() {
            return () -> "Went to airport by car. But GOOOOOSh, it's expensive to park";
        }
     */
}

class TaxiStrategy implements TransportStrategy {
    @Override
    public String goToAirport() {
        return "Went to airport by Taxi";
    }
}
class BusStrategy implements TransportStrategy {
    @Override
    public String goToAirport() {
        return "Went to airport by Bus";
    }
}
class OwnCarStrategy implements TransportStrategy {
    @Override
    public String goToAirport() {
        return "Went to airport by car. But GOOOOOSh, it's expensive to park";
    }
}
class BikeStrategy implements TransportStrategy {
    @Override
    public String goToAirport() {
        return "Bike";
    }
}

public class InterfacePolymorphishDemo {

    List<TransportStrategy>  strategies = new ArrayList<TransportStrategy>(Arrays.asList(
            new BusStrategy(),
            new OwnCarStrategy(),
            new TaxiStrategy()));

    Random random = new Random();

    TransportStrategy getRandomStrategy(int i){
        int index = random.nextInt(i);
        return strategies.get(index);
    }

    public void test() {
        strategies.add(new BikeStrategy());
        strategies.add(()-> "Walk");
        System.out.println("Lets go to the airport using random strategies");
        for(int i = 0; i < 10; i++){
            System.out.println(getRandomStrategy(strategies.size()).goToAirport());
        }
    }

    //Here we will play around with the example :-)
    public static void main(String[] args) {

      new InterfacePolymorphishDemo().test();
    }

}
