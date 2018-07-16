package com.test.app;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.data.User;
import com.test.app.data.Users;
import com.test.app.service.IUserDao;
import com.test.app.service.Threader;

@RestController
@RequestMapping("/*")
public class IndexController {

	private static final Logger logger = Logger.getLogger(IndexController.class.getName());
	
	@Autowired
	Threader masterThreader;
	
	@Autowired
	IUserDao iUserDao;

	@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<Users> index() throws InterruptedException {
		logger.info("index controller*****************************************");
		Users users = iUserDao.getAll();
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}

	@GetMapping(path = "mapping")
	public @ResponseBody User testMapping() {
		logger.info("mapping method");
		User user = new User();
		user.setAge(30);
		user.setName("maryon");
		return user;
	}

	@PostMapping(path = "post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody User posttest(@RequestBody User user) {
		logger.info("run the concurrency");
		masterThreader.startMainThread();
		return user;
	}

	
}
