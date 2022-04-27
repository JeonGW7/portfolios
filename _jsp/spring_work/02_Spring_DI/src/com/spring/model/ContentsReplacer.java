package com.spring.model;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ContentsReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] objarr)
			throws Throwable {
		
		return "this method is replaced... !!!";
	}

}//class-end
