package com.myigituzun.reflect;

import java.lang.reflect.*;

public class MyDataReflect {
	public static void main(String[] args) throws Exception {
		
		Class<?> clazz = Class.forName("com.myigituzun.source.MyData");
		Constructor<?> constructor = clazz.getConstructor();
		Object object = constructor.newInstance();
		
		for (Field field : clazz.getFields()) {
			System.out.println(field.getName() + " " + field.getType().getName());
		}
		
		Field myDoubleField = clazz.getField("myDouble");
		myDoubleField.set(object, 98.78);
		Object myDoubleValue = myDoubleField.get(object);
		
		System.out.println(myDoubleValue);
	}
}
