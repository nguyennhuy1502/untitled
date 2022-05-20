package Random;

public class Game {
    private int id;
    private int Result;

    public Game() {
    }

    public Game(int id, int result) {
        this.id = id;
        Result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResult() {
        return Result;
    }

    public void setResult(int result) {
        Result = result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", Result=" + Result +
                '}';
    }
}
