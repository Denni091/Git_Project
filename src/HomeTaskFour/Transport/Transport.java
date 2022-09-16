package HomeTaskFour.Transport;

import HomeTaskFour.Interfacee.TransportRule;

public abstract class Transport implements TransportRule {

    public void transportInfo() {
        System.out.println("We can use different modes of transport ");
    }

    public void history() {
        System.out.println("In other words, the action of transport is defined as a particular movement " +
                "of an organism or thing from a point A (a place in space) to a point B.");
    }

    public void transportRule(){
        System.out.println("HomeTask.Transport must move" + "\n---------------------------");
    }
}
