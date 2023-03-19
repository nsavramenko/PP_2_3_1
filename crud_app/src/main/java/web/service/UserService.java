package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    void updateUser(Long id, User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> listUsers();
}
