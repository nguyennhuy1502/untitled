package Bt;

public class Main{
    public static void main(String[] args) {
        Language language = new English();
        language.input();
        language.output();
        language.sayhello();
        Language language1 = new Vietnam();
        language1.input();
        language1.output();
        language1.sayhello();

        if (language.getAge() == language1.getAge() && language.getName().equals(language1.getName())){
            System.out.println("Ok!");
        }else {
            System.out.println("No!");
        }
    }
}
