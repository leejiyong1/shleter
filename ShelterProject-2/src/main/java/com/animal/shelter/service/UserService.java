package com.animal.shelter.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.animal.shelter.mapper.UserMapper;
import com.animal.shelter.vo.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserMapper userMapper;
	private final PasswordEncoder passwordEncoder;

    public User create(String username, String email, String password,String contact) {
        User user = new User();
        user.setName(username);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setContact(contact);
        userMapper.insertUser(user);
        return user;
    }

}
