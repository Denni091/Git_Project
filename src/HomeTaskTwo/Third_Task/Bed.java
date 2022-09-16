package HomeTaskTwo.Third_Task;

public class Bed {

    private String bedInfo;

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    public Bed(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    public Bed() {
    }

    public static void main(String[] args) {
        Bed bed = new Bed();
        bed.setBedInfo("Bed: Can use for rest");
        System.out.println(bed.getBedInfo());
    }
}
