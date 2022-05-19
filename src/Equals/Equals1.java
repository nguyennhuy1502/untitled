package Equals;

import java.util.Scanner;

public class Equals1 {
    public static void main(String[] args) {
        String name;
        System.out.println("Input name: ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        while (name.equals("a")){
            System.out.println("Welcome " + name);
            break;
        }
    }
}
