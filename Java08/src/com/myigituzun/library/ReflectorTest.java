package com.myigituzun.library;

import com.myigituzun.source.MyBean;

public class ReflectorTest {
	public static void main(String[] args) throws Exception {
		//String className = "com.myigituzun.source.MyBean";
		ClassReflector classReflector = new ClassReflector(MyBean.class);
		Object object = classReflector.newInstance();
		
		classReflector.setValue(object, "myValue", 98.45);
		Object result = classReflector.getValue(object, "myValue");
		
		System.out.println(result);
	}
}
