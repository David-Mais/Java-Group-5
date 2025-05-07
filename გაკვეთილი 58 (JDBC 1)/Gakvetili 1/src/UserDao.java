import java.util.List;

public interface UserDao {
    void create(User user);
    List<User> findAll();
    User findById(int id);
    void update(User user);
    void delete(int id);
}
