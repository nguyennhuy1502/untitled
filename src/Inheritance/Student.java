package Inheritance;


public class Student extends School {
    public static void main(String[] args) {
        School school = new School();
        System.out.println("Input: ");
        school.Input();
        System.out.println("Output: ");
        school.Output();
        System.out.println("Input general: ");
        school.general();
        System.out.println("Input Religion: ");
        school.religion();
    }
}
