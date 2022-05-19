package Inheritance;

import java.util.Scanner;

public class School extends Class implements Rules{
    private int numberclass;
    private int numberstudent;
    Class aClass = new Class();
    Scanner scanner = new Scanner(System.in);

    public int getNumberclass() {
        return numberclass;
    }

    public void setNumberclass(int numberclass) {
        this.numberclass = numberclass;
    }

    public int getNumberstudent() {
        return numberstudent;
    }

    public void setNumberstudent(int numberstudent) {
        this.numberstudent = numberstudent;
    }

    public void Input(){
        super.Input();
        System.out.println("Input number class: ");
        numberclass = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input number student: ");
        numberstudent = scanner.nextInt();

    }
    public void Output(){
        super.Output();
        System.out.println("Output number class: " + numberclass);
        System.out.println("Output number student: " + numberstudent);
    }
    @Override
    public void general() {
        String generals;
        super.clas();
        scanner.nextLine();
        System.out.println("Input generals: ");
        generals = scanner.nextLine();
        System.out.println("Output generals: " + generals);
    }

}
