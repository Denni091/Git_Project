package HomeTaskFour.Transport;

import HomeTaskFour.Interfacee.TrainRule;

public final class Train extends Car implements TrainRule {

    @Override
    public void transportInfo() {

        System.out.println("---------------------------\nTrain info: ");

        System.out.println("In rail transport, a train is a series of connected vehicles that run along " +
                "a railway track and transport people or freight");
    }

    @Override
    public void history() {

        System.out.println("History: Railways existed as early as 1550, in Germany. These pathways of wooden rails called " +
                "wagonways were the \nbeginning of modern rail transport, " +
                "making it easier for horse-drawn wagons or carts to move along dirt roads.");
    }

    public void transportRule() {

        System.out.println("Train must run on railway tracks" + "\n---------------------------");
    }
}
