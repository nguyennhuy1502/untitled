package Techvify.DAO;

public record Language(String id,String name) {
    public Language(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }
}
