package com.auth2springsecurity.springsecurity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(userRepository.count()<1){
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            User user1 = new User();
            user1.setUsername("user");
            user1.setPassword(passwordEncoder.encode("pass"));
            user1.setRole("ROLE_USER");

            User user2 = new User();
            user2.setUsername("admin");
            user2.setPassword(passwordEncoder.encode("pass"));
            user2.setRole("ROLE_ADMIN");

            userRepository.save(user1);
            userRepository.save(user2);
            System.out.println("Total users saved::"+userRepository.count());

        }
    }
}
