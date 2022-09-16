package HomeTaskTwo.First_Task;

public class Variables {

    private String variable;
    private byte variableOne;
    private short variableTwo;
    private int variableThree;
    private long variableFour;
    private float variableFive;
    private double variableSix;
    private char a = 'a';
    private boolean b;


//    getter and setter
    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public byte getVariableOne() {
        return variableOne;
    }

    public void setVariableOne(byte variableOne) {
        this.variableOne = variableOne;
    }

    public short getVariableTwo() {
        return variableTwo;
    }

    public void setVariableTwo(short variableTwo) {
        this.variableTwo = variableTwo;
    }

    public int getVariableThree() {
        return variableThree;
    }

    public void setVariableThree(int variableThree) {
        this.variableThree = variableThree;
    }

    public long getVariableFour() {
        return variableFour;
    }

    public void setVariableFour(long variableFour) {
        this.variableFour = variableFour;
    }

    public float getVariableFive() {
        return variableFive;
    }

    public void setVariableFive(float variableFive) {
        this.variableFive = variableFive;
    }

    public double getVariableSix() {
        return variableSix;
    }

    public void setVariableSix(double variableSix) {
        this.variableSix = variableSix;
    }

    public char getA() {
        return a;
    }

    public void setA(char a) {
        this.a = a;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

// Конструкторы по возрастанию
    public Variables() {
    }

    public Variables(String variable) {
        this.variable = variable;
    }

    public Variables(String variable, byte variableOne) {
        this.variable = variable;
        this.variableOne = variableOne;
    }

    public Variables(String variable, byte variableOne, short variableTwo) {
        this.variable = variable;
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
    }

    public Variables(String variable, byte variableOne, short variableTwo, int variableThree) {
        this.variable = variable;
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
        this.variableThree = variableThree;
    }

    public Variables(String variable, byte variableOne, short variableTwo, int variableThree, long variableFour) {
        this.variable = variable;
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
        this.variableThree = variableThree;
        this.variableFour = variableFour;
    }

    public Variables(String variable, byte variableOne, short variableTwo, int variableThree,
                     long variableFour, float variableFive) {
        this.variable = variable;
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
        this.variableThree = variableThree;
        this.variableFour = variableFour;
        this.variableFive = variableFive;
    }

    public Variables(String variable, byte variableOne, short variableTwo, int variableThree,
                     long variableFour, float variableFive, double variableSix) {
        this.variable = variable;
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
        this.variableThree = variableThree;
        this.variableFour = variableFour;
        this.variableFive = variableFive;
        this.variableSix = variableSix;
    }

    public Variables(String variable, byte variableOne, short variableTwo, int variableThree,
                     long variableFour, float variableFive, double variableSix, char a) {
        this.variable = variable;
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
        this.variableThree = variableThree;
        this.variableFour = variableFour;
        this.variableFive = variableFive;
        this.variableSix = variableSix;
        this.a = a;
    }

    public Variables(String variable, byte variableOne, short variableTwo, int variableThree,
                     long variableFour, float variableFive, double variableSix, char a, boolean b) {
        this.variable = variable;
        this.variableOne = variableOne;
        this.variableTwo = variableTwo;
        this.variableThree = variableThree;
        this.variableFour = variableFour;
        this.variableFive = variableFive;
        this.variableSix = variableSix;
        this.a = a;
        this.b = b;

    }
}
