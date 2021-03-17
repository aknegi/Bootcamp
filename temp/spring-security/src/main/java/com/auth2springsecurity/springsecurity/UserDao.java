package com.auth2springsecurity.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class UserDao {

    @Autowired
    UserRepository userRepository;

    AppUser loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        System.out.println(user);
        if (username != null) {
            return new AppUser(user.getUsername(), user.getPassword(), Arrays.asList(new GrantAuthorityImpl(user.getRole())));
        } else {
            throw new RuntimeException();
        }

    }
}
