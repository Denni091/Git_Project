package HomeTaskThree;

import java.util.Scanner;

public class User {

    private String name;
    private String surName;
    private String email;
    private String password;
    private String gender;
    private String country;
    static Scanner scanner;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        User.scanner = scanner;
    }


    public void setInfo() {

        setName("Boris");
        setSurName("Jonson");
        setEmail("boris1259@gmail.com");
        setPassword("qwerty");
        setGender("man");
        setCountry("United Kingdom");

        System.out.println("Name: " + getName() + "\nSurname: " + getSurName()
                + "\nEmail: " + getEmail() + "\nPassword: " + getPassword()
                + "\nGender: " + getGender() + "\nCountry: " + getCountry()
                + "\n----------------------------------------");
    }

    public  void setScanner() {

        scanner = new Scanner(System.in);
        System.out.print("Write your name: ");
        name = scanner.nextLine();

        System.out.print("Write your surname: ");
        surName = scanner.nextLine();

        System.out.print("Write your email: ");
        email = scanner.nextLine();

        System.out.print("Write your password: ");
        password = scanner.nextLine();

        System.out.print("Write your gender: ");
        gender = scanner.nextLine();

        System.out.print("Write your Country: ");
        country = scanner.nextLine();

        scanner.close();
    }


    public String outPut(){

        return  toString();
    }

    public  boolean verifyString(String verifStr){
        return true;
    };

    public void removePartOfText(String textThatNeedToBeRemoved){
    }

    @Override
    public String toString() {
        return "HomeTaskThree.User{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
