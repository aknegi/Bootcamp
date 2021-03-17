package com.auth2springsecurity.springsecurity;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByUsername(String username);
}
