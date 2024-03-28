package com.animal.shelter.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.animal.shelter.mapper.UserMapper;
import com.animal.shelter.vo.SiteUser;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserSecurityService implements UserDetailsService{
	
	private final UserMapper userMapper;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Optional<SiteUser> _user = this.userMapper.findById(name);
		if(_user.isEmpty()) {
			//해당email이 없을경우 예외처리
			throw new UsernameNotFoundException("사용자를 찾을수 없습니다.");
		}
		
		SiteUser user = _user.get();
		//list에 그랜티드 어스리티를 이용해 권한을 담는다
		List<GrantedAuthority> authorities = new ArrayList<>();
		//이메일이 어드민일경우 권한을 admin으로주고
		if("admin".equals(name)) {
			authorities.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
		}else {
			//권한을 유저로준다
			authorities.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
		}
		//이메일, 비밀번호, 권한리턴
		return new User(user.getEmail(), user.getPassword(), authorities);
	}
	
	
}
