package Bt;

abstract class Language implements Sayhello{
    private String name;
    private int age;

    public Language() {
    }

    public Language(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayhello(){
        System.out.println("welcome: ");
    }
}
