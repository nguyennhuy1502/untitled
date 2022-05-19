package Inheritance;


import java.util.Scanner;

public class Class extends Person implements Rules{
    private String clas;
    private String teacher;
    Person ps = new Person();
    Scanner scanner = new Scanner(System.in);

    public Class(String clas, String teacher) {
        this.clas = clas;
        this.teacher = teacher;
    }

    public Class(String name, String gender, int date, String address, String clas, String teacher) {
        super(name, gender, date, address);
        this.clas = clas;
        this.teacher = teacher;
    }

    public Class() {
    }
    public void Input() {

        System.out.println("Input name: ");
        ps.setName(scanner.nextLine());

        System.out.println("Input gender: ");
        ps.setGender(scanner.nextLine());

        System.out.println("Input date: ");
        ps.setDate(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Input address: ");
        ps.setAddress(scanner.nextLine());

        System.out.println("Input Class: ");
        clas = scanner.nextLine();

        System.out.println("Input Teacher: ");
        teacher = scanner.nextLine();

    }

    public void Output(){
        System.out.println("Output name: " + ps.getName());
        System.out.println("Output gender: " + ps.getGender());
        System.out.println("Output date: "+ ps.getDate());
        System.out.println("Output address: "+ ps.getAddress());
        System.out.println("Output class: "+ clas);
        System.out.println("Output teacher: "+ teacher);

    }

    @Override
    public void general() {

    }

    @Override
    public void clas() {
        String clas;
        System.out.println("Input class: ");
        clas = scanner.nextLine();
        System.out.println("Output class: " + clas);
    }

}
