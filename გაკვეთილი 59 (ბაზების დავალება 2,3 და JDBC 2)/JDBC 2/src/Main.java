import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatabaseConnectionManager db = new DatabaseConnectionManager();
        try {
            db.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        UserDao ud = new UserDaoImpl();

        User user = new User(-1, "Davit", "Maisuradze");

//        ud.createUser(user);

        List<User> users = ud.findAll();
//        users.forEach(System.out::println);

        User davit = ud.findById(2);
//        System.out.println(davit);
//        davit.setFirstName("დავით");
//        davit.setLastName("ყიფშიძე");
//
//        ud.updateUser(davit);

        ud.deleteUser(2);
    }
}
