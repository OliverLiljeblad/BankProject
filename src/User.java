public class User {
    private String name = "Oliver";
    private int id;
    private int password;

    public User(String name, int id, int password){
        this.name = name;
        this.id = id;
        this.password = password;
    }
    public User() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
