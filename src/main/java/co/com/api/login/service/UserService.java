package co.com.api.login.service;

import co.com.api.login.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
