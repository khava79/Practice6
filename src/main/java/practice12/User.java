package practice12;

public class User {
    private String name;
    private int Age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        Age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public String getEmail() {
        return email;
    }
}
