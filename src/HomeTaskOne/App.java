package HomeTaskOne;

public class App {

    public static void main(String[] args) {

        byte numberOne = 5;
        short numberTwo = 13;
        long numberThree = 23;
        float numberFour = 2.5F;
        char symbol = 'a';
        boolean a = true;

        int numberFive = 25;
        int numberSix = 27;
        int numberSeven = 29;
        double numberEight = 30.5;
        double numberNine = 10.7;
        double numberTen = 12.9;

        int calcOne = 12 + 25;
        int calcTwo = 25 + 245;
        int calcThree = 65 + 12;
        int calcFour = 89 + 17;
        int calcFive = 90 + 54;

        double calculateOne = 12.5 + 13.9;
        double calculateTwo = 25.1 + 65.8;
        double calculateThree = 64.4 + 11.6;
        double calculateFour = 18.8 + 17.3;
        double calculateFive = 90.1 + 88.5;

        System.out.println("Calculate int variables: " + calcOne
                + " " + calcTwo + " " + calcThree + " " + calcFour + "" + calcFive
                + "\nCalculate double variables: " + calculateOne
                + " " + calculateTwo + " " + calculateThree + " " + calculateFour
                + " " + calculateFive);

        int numberEleven = 35;
        double numberThirteen = 12.2;

        int valueOne = numberFive + numberSix;
        int valueTwo = numberSeven - numberFive;
        int valueThree = numberEleven * numberOne;
        int valueFour = numberEleven / numberOne;
        int valueFive = numberTwo + numberOne;

        double valueSix = numberEight + numberTen;
        double valueSeven = numberNine * numberTen;
        double valueEight = numberEight - numberThirteen;
        double valueNine = numberEight / numberThirteen;
        double valueTen = numberThirteen + numberEight;

        System.out.println("------------------------------------------"
                + "\nInt variables: " + valueOne + " " + valueTwo
                + " " + valueThree + " " + valueFour + " " + valueFive
                + "\nDouble variables: " + valueSix + " " + valueSeven + " "
                + valueEight + " " + valueNine + " " + valueTen);

        boolean javaGoodLanguage = true;
        boolean ukraineBeautifulCountry = true;
        boolean iLikeFootball = true;
        boolean itIsVeryEasy = false;
        boolean hillelBadSchool = false;

        System.out.println("------------------------------------------\n"
                + javaGoodLanguage + " " + ukraineBeautifulCountry + " "
                + iLikeFootball + " " + itIsVeryEasy + " " + hillelBadSchool);


        int x = 1;
        int q = 1;
        q--;
        int w = 1;
        int e = 1;
        int r = 1;
        int t = 1;
        t++;
        int y = 1;
        int u = 1;
        System.out.println("------------------------------------------\nIncrements: "
                + x + " " + q + " " + w + " " + e + " "
                + r + " " + t + " " + y + " " + u);

        int[] array = {1, 12, 13, 16, 18, 23, 24, 27, 29, 30};
        int arrLength = array.length;
        System.out.println("------------------------------------------\nArray: " + arrLength);
    }
}
