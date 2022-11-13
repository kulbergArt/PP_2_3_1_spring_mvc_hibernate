package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void create(User user);

    List<User> listUsers();

    void deleteUser(int id);

    User updateUser(User user);
}
