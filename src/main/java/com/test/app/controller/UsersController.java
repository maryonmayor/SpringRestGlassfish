package com.test.app.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.data.User;
import com.test.app.data.Users;
import com.test.app.service.IUserDao;

@RestController
@RequestMapping(path = "users")
public class UsersController {

	@Autowired
	IUserDao iUserDao;

	@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<Users> index() throws InterruptedException {
		Users users = iUserDao.getAll();
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

	@GetMapping("list")
	public ResponseEntity<List<User>> users() {
		return new ResponseEntity<List<User>>(iUserDao.listOfUsers(), HttpStatus.OK);
	}

}
