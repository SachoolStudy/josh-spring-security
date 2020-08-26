package com.example.secu.sample.dao;

import com.example.secu.sample.vo.UserVO;


public interface UserDAO {
	
	public UserVO selectUserVO(String username) throws Exception;
}
