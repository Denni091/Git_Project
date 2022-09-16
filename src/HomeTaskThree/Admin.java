package HomeTaskThree;

public class Admin extends User {
    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public boolean verifyString(String verifStr) {

        if (text.contains(verifStr)) {
            return true;

        } else {
            System.out.println("There is no such a string");
            return false;
        }
    }

    @Override
    public void removePartOfText(String textThatNeedToBeRemoved) {
        String text2 = null;
        if (verifyString(textThatNeedToBeRemoved)) {
            text2 = text.replace(textThatNeedToBeRemoved, "");
        }
        System.out.println(text2);
    }
}
