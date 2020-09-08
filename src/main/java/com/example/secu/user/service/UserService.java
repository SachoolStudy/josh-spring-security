package com.example.secu.user.service;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.secu.user.dao.UserDAO;
import com.example.secu.user.vo.UserVO;


@Service
public class UserService implements UserDetailsService {

	@Resource
	private UserDAO userDAO;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserVO user = new UserVO();
		try {
			user = userDAO.selectUserVO(username);

			if( user == null ) {
				throw new UsernameNotFoundException(username);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

}
