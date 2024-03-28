package com.animal.shelter.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.animal.shelter.vo.SiteUser;

@Mapper
public interface UserMapper {
	 @Select("SELECT * FROM users")
	 List<SiteUser> findAll();
	 
	 @Insert("INSERT INTO Users(name, email, password, contact) VALUES(#{name}, #{email}, #{password}, #{contact})")
	 int insertUser(SiteUser user);
	 
	 @Select("SELECT * FROM users where name = #{name}")
	 Optional<SiteUser> findById(String name);
	 
	 
}
