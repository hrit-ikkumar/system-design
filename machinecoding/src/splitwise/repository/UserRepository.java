package splitwise.repository;

import splitwise.dao.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if(users == null) {
            users = new ArrayList<>();
        }

        users.add(user);
    }

    public List<User> getUsers(){
        return this.users;
    }
}
