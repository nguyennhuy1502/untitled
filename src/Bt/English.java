package Bt;

import java.util.Scanner;

public class English extends Language{
    @Override
    public void sayhello() {
        System.out.println("Welcome English: ");
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        setName(scanner.nextLine());
        System.out.println("Age: ");
        setAge(scanner.nextInt());
        scanner.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}
