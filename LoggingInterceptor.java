package com.foo.Interceptors;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
 

public class LoggingInterceptor implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target)
		throws Throwable {
	        System.out.println("LoggingInterceptor : Before stocksDAO!");
	}
}