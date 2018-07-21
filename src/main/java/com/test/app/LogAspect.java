package com.test.app;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
	
	
	@Before("execution (* com.test.app.*.*(..))")
	public void test() {
		System.out.print("testtt aspect");
	}
	
	@Before("execution (* com.test.app.service.*.*(..))")
	public void serviceaspect() {
		System.out.println("service aspect");
	}

}
