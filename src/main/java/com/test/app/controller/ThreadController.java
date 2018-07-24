package com.test.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.data.ThreadSetting;
import com.test.app.service.IThreadDao;

@RestController
@RequestMapping(path = "threads")
public class ThreadController {

	@Autowired
	IThreadDao threadDaoRepository;

	@GetMapping("thread-setting")
	public ResponseEntity<ThreadSetting> threadSetting() {
		return new ResponseEntity<ThreadSetting>(threadDaoRepository.getSetting(), HttpStatus.OK);
	}
}
