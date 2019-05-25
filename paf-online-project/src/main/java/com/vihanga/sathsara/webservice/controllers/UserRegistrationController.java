package com.vihanga.sathsara.webservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vihanga.sathsara.webservice.beans.*;

@Controller
public class UserRegistrationController {
	@RequestMapping(method = RequestMethod.POST, value="/register/user")
	
	@ResponseBody
	public UserRegistrationReply registerUser(@RequestBody User user) {
		 System.out.println("In registeruser");
	        UserRegistrationReply usrregreply = new UserRegistrationReply();           
	        UserRegistration.getInstance().add(user);
	        
	        usrregreply.setName(user.getName());
	        usrregreply.setAge(user.getAge());
	        usrregreply.setRegistrationNumber(user.getRegistrationNumber());
	        usrregreply.setRegistrationStatus("Successful");
	       
	        return usrregreply;
	}
}
