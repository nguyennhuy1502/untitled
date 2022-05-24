package DesignPattern.Observer.Hotgirl;

public class Boy {
    public String Name;

    public Boy(String name) {
        Name = name;
    }

    public void Care() {
        System.out.println(Name + ": Are you OK?");
    }
}
