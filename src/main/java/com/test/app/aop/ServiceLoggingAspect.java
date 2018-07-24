package com.test.app.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServiceLoggingAspect {

	private static final Logger logger = Logger.getLogger(ServiceLoggingAspect.class.getName());

	@Before(value = "@within(org.springframework.stereotype.Service) || @annotation(org.springframework.stereotype.Service)")
	public void test(JoinPoint joinpoint) {
		logger.info("ASPWECT LOGGING:" + joinpoint.getSignature().getName());

	}

	@Before("execution (* com.test.app.service.*.*(..))")
	public void serviceaspect() {
		System.out.println("service aspect");
	}

}
