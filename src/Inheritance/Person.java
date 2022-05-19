package Inheritance;

import java.util.Scanner;

public class Person extends Religion{
    private String name;
    private String gender;
    private int date;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, int date, String address) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        if(date > 0 && date < 32){
            this.date = date;
        }
        else {
            System.out.println("No date!");
            this.date = date;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    void religion() {
        String rel;
        System.out.println("Input Religion: ");
        Scanner scanner = new Scanner(System.in);
        rel = scanner.nextLine();
        System.out.println("Output Religion: " + rel);
    }
}
