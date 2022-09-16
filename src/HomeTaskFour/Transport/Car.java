package HomeTaskFour.Transport;

import HomeTaskFour.Interfacee.CarRule;

public abstract class Car extends Transport implements CarRule {

    @Override
    public void transportInfo() {

        System.out.println("The car is one of the type of transport, which we can to movement");
    }

    @Override
    public void history() {

        System.out.println("The first working steam-powered vehicle was designed—and quite possibly built—by Ferdinand Verbiest, " +
                "a Flemish member of a Jesuit mission in China around 1672.");
    }

    public void transportRule(){

        System.out.println("Car can drive" + "\n---------------------------");
    }
}
