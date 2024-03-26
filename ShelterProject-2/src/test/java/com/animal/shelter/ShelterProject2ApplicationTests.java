package com.animal.shelter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.animal.shelter.mapper.UserMapper;
import com.animal.shelter.vo.User;

@SpringBootTest
class ShelterProject2ApplicationTests {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	public void findAllTest() {
		List<User> users = userMapper.findAll();
		assertThat(users).isNotNull();
		if (!users.isEmpty()) {
			assertThat(users.size()).isGreaterThan(0);
		}
	}

	@Test
	public void registerUserTest() {
		User newUser = new User();
		newUser.setName("Test User");
		newUser.setEmail("test@example.com");
		// 비밀번호를 암호화합니다.
		String encodedPassword = passwordEncoder.encode("password123");
		newUser.setPassword(encodedPassword);
		newUser.setContact("010-1234-5678");

		int result = userMapper.insertUser(newUser);
		assertEquals(1, result);

		assertNotNull(newUser.getUserID());

		// 데이터베이스에 저장된 비밀번호가 원래 비밀번호와 일치하는지 확인합니다.
		User registeredUser = userMapper.findById(newUser.getUserID());
		assertTrue(passwordEncoder.matches("password123", registeredUser.getPassword()));
	}
}
