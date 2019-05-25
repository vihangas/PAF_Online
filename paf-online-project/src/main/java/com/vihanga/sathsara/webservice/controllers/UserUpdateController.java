package com.vihanga.sathsara.webservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vihanga.sathsara.webservice.beans.*;

@Controller
public class UserUpdateController {
	@RequestMapping(method = RequestMethod.PUT, value="/update/user")
	
	@ResponseBody
	public String updateUserRecord(@RequestBody User usrs) {
		System.out.println("In updateUserRecord");
		return UserRegistration.getInstance().upDateUser(usrs);
	}
}
