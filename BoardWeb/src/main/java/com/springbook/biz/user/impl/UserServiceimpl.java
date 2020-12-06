package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceimpl implements UserService {
	private UserDAO userDAO;
	
	@Autowired
	public void setUserDAO(UserDAO userDAO) {//setter ������ó���� ���� �޼ҵ�
		this.userDAO=userDAO;
	}
	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
}
