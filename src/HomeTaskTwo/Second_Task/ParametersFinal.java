package HomeTaskTwo.Second_Task;

public class ParametersFinal {

    private final String variable;
    private final int variableTwo;
    private final double variableThree;

    //   Возможно подвох заключается в том, что с параметром final нельзя сделать setter?
    public String getVariable() {
        return variable;
    }

    public int getVariableTwo() {
        return variableTwo;
    }

    public double getVariableThree() {
        return variableThree;
    }

//    Так же заметил, что не получается сделать дефолтный конструктор, компилятор ругается!
    public ParametersFinal(String variable, int variableTwo, double variableThree) {
        this.variable = variable;
        this.variableTwo = variableTwo;
        this.variableThree = variableThree;
    }
}
