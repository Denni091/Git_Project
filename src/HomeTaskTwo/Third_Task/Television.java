package HomeTaskTwo.Third_Task;

public class Television {

    private String televisionInfo;

    public String getTelevisionInfo() {
        return televisionInfo;
    }

    public void setTelevisionInfo(String televisionInfo) {
        this.televisionInfo = televisionInfo;
    }

    public Television(String televisionInfo) {
        this.televisionInfo = televisionInfo;
    }

    public Television() {
    }

    public static void main(String[] args) {
        Television television = new Television();
        television.setTelevisionInfo("Television: You can use for watch TV program");
        System.out.println(television.getTelevisionInfo());
    }
}
