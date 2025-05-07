import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private final DatabaseConnectionManager dcm;
    private final String INSERT_USER = "INSERT INTO users (first_name, last_name) VALUES (?, ?);";
    private final String FIND_ALL = "SELECT * FROM users;";

    public UserDaoImpl() {
        dcm = new DatabaseConnectionManager(
                "jdbc:postgresql://localhost:5432/mziuri",
                "postgres",
                "admin"
        );
    }

    @Override
    public void create(User user) {
        String firstName = user.getFirstName();
        String lastName = user.getLastName();

        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(INSERT_USER);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<User> findAll() {
        try (Connection con = dcm.getConnection()) {
            PreparedStatement ps = con.prepareStatement(FIND_ALL);
            ResultSet rs = ps.executeQuery();

            List<User> users = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString(3);

                User user = new User(id, firstName, lastName);
                users.add(user);
            }
            return users;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return List.of();
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(int id) {

    }
}
