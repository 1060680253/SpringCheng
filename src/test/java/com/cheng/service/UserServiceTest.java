package com.cheng.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  

import com.cheng.baseTest.SpringTestCase;
import com.cheng.domain.User;
import com.cheng.service.UserService;

public class UserServiceTest extends SpringTestCase {
	
	@Autowired  
    private UserService userService; 
	
	@Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}
