package com.mysite.sbbmybatis.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	// signup
	// username, psw 스트링
	void addUser(User user);
	User getPswByUsername(String username); // User user 도 가능
}
