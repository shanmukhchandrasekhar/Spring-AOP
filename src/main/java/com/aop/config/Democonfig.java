package com.aop.config;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Democonfig {
	private static final Logger LOGGER = LoggerFactory.getLogger(Democonfig.class); 
	
@Before("allMethods()")
public void log() {
	LOGGER.info("get details metod called from aspect ");
}

@Before("allGet()")
public void firstAdvice() {
	LOGGER.info("saying hii from firstAdvice.....");
}

@Pointcut("execution(public * com.aop.controller.DemoController.get*())")
public void allGet() {
	
}
@Pointcut("within(com.aop.controller.DemoController)")
	public void allMethods() {
		
	}

@AfterReturning("execution(public * com.aop.controller.DemoController.getDetails())")
	public void logs() {
		LOGGER.info("get details metod called after from aspect ");
}
	
}
