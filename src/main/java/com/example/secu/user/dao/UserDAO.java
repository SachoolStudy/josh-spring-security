package com.example.secu.user.dao;

import com.example.secu.user.vo.UserVO;


public interface UserDAO {
	
	public UserVO selectUserVO(String username) throws Exception;
}
