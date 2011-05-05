package wicketkickoff.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    private Map<Integer, User> users = new HashMap<Integer, User>();

    public UserRepository() {
        users.put(1, new User("Rune Flobakk"));
        users.put(2, new User("John Doe"));
        users.put(3, new User("Super Mario"));
    }

    public List<User> all() {
        return new ArrayList<User>(users.values());
    }

    public User get(int id) {
        return users.get(id);
    }
}
