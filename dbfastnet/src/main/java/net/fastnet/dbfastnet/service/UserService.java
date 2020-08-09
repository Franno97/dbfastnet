package net.fastnet.dbfastnet.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import net.fastnet.dbfastnet.controller.UserRegistrationDto;
import net.fastnet.dbfastnet.entities.User;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registration);
}