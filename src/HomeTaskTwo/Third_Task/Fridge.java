package HomeTaskTwo.Third_Task;

public class Fridge {

    private String fridgeInfo;

    public String getFridgeInfo() {
        return fridgeInfo;
    }

    public void setFridgeInfo(String fridgeInfo) {
        this.fridgeInfo = fridgeInfo;
    }

    public Fridge(String fridgeInfo) {
        this.fridgeInfo = fridgeInfo;
    }

    public Fridge(){

    }

    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.setFridgeInfo("Fridge: You can keep food frozen");
        System.out.println(fridge.getFridgeInfo());
    }
}
