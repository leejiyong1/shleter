package com.animal.shelter;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.animal.shelter.mapper.UserMapper;
import com.animal.shelter.vo.User;

@SpringBootTest
class ShelterProject2ApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void findAllTest() {
		 List<User> users = userMapper.findAll();
		    assertThat(users).isNotNull();
		    if (!users.isEmpty()) {
		        assertThat(users.size()).isGreaterThan(0);
		    }
	}
}
