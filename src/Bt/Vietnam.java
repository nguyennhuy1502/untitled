package Bt;

import java.util.Scanner;

public class Vietnam extends Language{
    @Override
    public void sayhello() {
        System.out.println("Xin chào Việt Nam!");
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
