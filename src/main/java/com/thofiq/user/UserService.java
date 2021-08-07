package com.thofiq.user;

import java.util.List;

public interface UserService {

    User getById(String userid);

    List<User> getUsers();

    User createUser(User user);
}
