package ex3_interface_polymorphishm;

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

public class InterfacePolymorphishDemo {

    //Here we will play around with the example :-)
    public static void main(String[] args) {

    }

}
