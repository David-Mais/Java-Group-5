import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String URL = "jdbc:postgresql://localhost:5432/mziuri";
        final String USER = "postgres";
        final String PASSWORD = "admin";

//        DatabaseConnectionManager dcm = new DatabaseConnectionManager(
//                URL, USER, PASSWORD
//        );
//
//        try {
//            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Connected to PostgreSQL database");
//
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM students;");
//
//            while (rs.next()) {
//                System.out.println(
//                        rs.getInt(1) + " " +
//                        rs.getString(2) + " " +
//                        rs.getString(3) + " " +
//                        rs.getInt(4)
//                );
//            }
//
//
//            Connection con2 = dcm.getConnection();
//            Statement stmt2 = con2.createStatement();
//            stmt2.executeUpdate("CREATE TABLE jdbctest(" +
//                    "id SERIAL PRIMARY KEY," +
//                    "first_name VARCHAR(50)" +
//                    ");");
//        } catch (SQLException e) {
//            System.err.println("Error connecting to PostgreSQL database");
//            System.err.println(e);
//        }


        UserDao ud = new UserDaoImpl();

        User user = new User(-1, "Davit", "Maisuradze");
//        ud.create(user);

        List<User> users = ud.findAll();
//        users.forEach(System.out::println);

        for (User u : users) {
            if (u.getId() == 43) {
                System.out.println(u);
            }
        }
    }
}
