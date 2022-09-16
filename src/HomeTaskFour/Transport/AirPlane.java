package HomeTaskFour.Transport;

public final class AirPlane extends Car {

    @Override
    public void transportInfo() {

        System.out.println("Airplane info: " );

        System.out.println("Used to transport people by air");
    }

    @Override
    public void history(){

        System.out.println("History: Around 400 BC in Greece, Archytas was reputed to have designed and built the first artificial, " +
                "self-propelled flying device, \na bird-shaped model propelled " +
                "by a jet of what was probably steam, said to have flown some 200 m (660 ft)");
    }

    @Override
    public void transportRule() {

        System.out.println("Air Plane must have wings" + "\n---------------------------");
    }
}
