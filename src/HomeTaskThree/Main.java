package HomeTaskThree;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setInfo();
        user.setScanner();

//  verifies in string is present the word o row that we've sent
        Support support = new Support();
        String verifyIfThereIsThisString = "Denis";
        support.setText(user.toString());
        support.verifyString(verifyIfThereIsThisString);

        Admin admin = new Admin();
        String veriAndDeleteString = "Den";
        admin.setText(user.toString());
        System.out.println("\n-------text before verification--------------");

        System.out.println(admin.getText());

        System.out.println("\n-------text after verification--------------");
        admin.removePartOfText(veriAndDeleteString);

    }
}
