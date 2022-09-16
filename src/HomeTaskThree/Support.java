package HomeTaskThree;

public class Support extends User {

    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


    @Override
    public boolean verifyString(String verifStr) {

        if (text.contains(verifStr)) {
            System.out.println("\nText contains");
            return true;

        } else {
            System.out.println("Text does not contains");
            return false;
        }
    }
}
