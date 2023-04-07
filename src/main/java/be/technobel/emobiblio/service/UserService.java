package be.technobel.emobiblio.service;

//import org.springframework.security.core.userdetails.UserDetailsService;

import be.technobel.emobiblio.models.entity.User;

public interface UserService/* extends UserDetailsService */{
    User getUserById(Long id);

    User createUser(User user);

    User updateUser(Long id, User userDetails);

    void deleteUser(Long id);
}
