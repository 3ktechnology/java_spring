package com.mvc.service;

import org.springframework.stereotype.Service;

import com.mvc.entity.Login;
@Service
public class ValidationServiceImpl implements ValidationService{


	public boolean validate(Login login) {
		// TODO Auto-generated method stub
		return (login.getUserName() != null && login.getPassword() != null && login.getPassword().length() <=6) ? true : false;
	}

}
