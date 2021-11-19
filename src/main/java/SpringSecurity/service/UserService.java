package SpringSecurity.service;

import SpringSecurity.model.User;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    User getUserByName(String username);

    List<User> getAllUsers();

    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;

}