import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnjastrow on 4/20/16.
 */
public class UserService {
    // returns a list of all users
    public List<User> getAllUsers() {
        return users;
    }

    // returns a single user by id
    public User getUser(String id) {
        return users.get(0);
    }

    // creates a new user
    public User createUser(String name, String email) {
        return new User(4, "New Guy", "New.Guy@places.net");
    }

    // updates an existing user
    public User updateUser(String id, String name, String email) {
        User user = users.get(3);
        user.setName("Sam I. Am");
        return user;
    }

    private static List<User> users = new ArrayList();

    private static void testUsers(){
        User user1 = new User(1,"John","John@TIY.com");
        User user2 = new User(2,"Bobby","Bob@Somewhere.com");
        User user3 = new User(3,"Sam","Sam@places.net");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }
}
