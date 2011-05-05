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
        users.put(1, new User(1, "Rune Flobakk"));
        users.put(2, new User(2, "John Doe"));
        users.put(3, new User(3, "Super Mario"));
    }

    public List<User> all() {
        return new ArrayList<User>(users.values());
    }

    public User get(int id) {
        return users.get(id);
    }
}
