package com.auth2springsecurity.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
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
            List<Role> roles = user.getRoleList();
            List<GrantAuthorityImpl> grantAuthorities = new ArrayList<>();

            for (Role userRole : roles) {
                grantAuthorities.add(new GrantAuthorityImpl(userRole.getUserRole()));
            }
            return new AppUser(user.getUsername(), user.getPassword(), grantAuthorities);
        } else {
            throw new RuntimeException();
        }
    }

}
