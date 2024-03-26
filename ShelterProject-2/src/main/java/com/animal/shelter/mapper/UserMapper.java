package com.animal.shelter.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.animal.shelter.vo.User;

@Mapper
public interface UserMapper {
	 @Select("SELECT * FROM users")
	 List<User> findAll();
	 
	 @Insert("INSERT INTO Users(name, email, password, contact) VALUES(#{name}, #{email}, #{password}, #{contact})")
	 int insertUser(User user);
	 
	 
}
