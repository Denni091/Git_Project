package HomeTaskFour.Transport;

public final class Bus extends Car {

    @Override
    public void transportInfo() {

        System.out.println("Bus info: ");

        System.out.println("Public transport for transporting people");
    }

    public void history() {

        System.out.println("History: Regular intercity bus services by steam-powered buses were pioneered " +
                "in England in the 1830s by Walter Hancock ");
    }

    @Override
    public void transportRule() {
        System.out.println("Bus must have a route" + "\n---------------------------");
    }
}
