package HomeTaskFour;

import HomeTaskFour.Animal.DoberMann;
import HomeTaskFour.Animal.GermanShepherd;
import HomeTaskFour.Animal.PitBull;
import HomeTaskFour.Transport.AirPlane;
import HomeTaskFour.Transport.Bus;
import HomeTaskFour.Transport.Train;

public class Main {

    public static void main(String[] args) {
        Train train = new Train();
        train.transportInfo();
        train.history();
        train.transportRule();

        Bus bus = new Bus();
        bus.transportInfo();
        bus.history();
        bus.transportRule();

        AirPlane airPlane = new AirPlane();
        airPlane.transportInfo();
        airPlane.history();
        airPlane.transportRule();

        DoberMann doberMann = new DoberMann();
        doberMann.animalInfo();

        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.animalInfo();

        PitBull pitBull = new PitBull();
        pitBull.animalInfo();
    }
}
