package ManagementHuman;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age > 1) {
            this.age = age;
        }else {
            System.out.println("Please enter your age again!");
            this.age = age;
        }
    }

    protected String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }
}
