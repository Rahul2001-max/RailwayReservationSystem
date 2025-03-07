package com.example.UserService.Service;
import com.example.UserService.Entity.User;
import java.util.List;

public interface UserServices {
    User createUser(User user);
    User getUserById(Long id);
    List<User> getAllUsers();
}
