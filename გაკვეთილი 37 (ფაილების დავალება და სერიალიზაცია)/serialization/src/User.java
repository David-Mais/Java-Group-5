import java.io.Serializable;

public class User implements Serializable {
    static String className = "User";
    String name;
    transient String password;

    Address address;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
