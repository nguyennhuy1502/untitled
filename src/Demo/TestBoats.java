package Demo;

public class TestBoats {
    public static void main(String[] args){
        Boat b1 = new Boat();
        Saildboat b2 = new Saildboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
