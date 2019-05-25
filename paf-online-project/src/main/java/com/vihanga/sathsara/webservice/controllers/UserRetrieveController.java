package com.vihanga.sathsara.webservice.controllers;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vihanga.sathsara.webservice.beans.*;


@Controller
public class UserRetrieveController {
	@RequestMapping(method = RequestMethod.GET, value="/user/alluser")
	
	@ResponseBody
	public List<User> getAllUsers(){
		return UserRegistration.getInstance().getUserRecords();
	}
}
