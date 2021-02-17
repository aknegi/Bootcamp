package Question1;

public abstract class User extends Library implements BookInfo {
    protected String name;
    protected int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}