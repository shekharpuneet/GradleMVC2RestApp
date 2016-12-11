package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;

@Controller
@RequestMapping("/user")
public class MainController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody User getUserInJSON(@PathVariable String name) {

		LOGGER.info("getUserInJSON function called.");

		User user = new User();
		user.setName(name);
		user.setStaffName(new String[] { "First", "Last" });

		return user;

	}

}