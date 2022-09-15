package com.myigituzun.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBeanReflect {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("com.myigituzun.source.MyBean");
		Constructor<?> constructor = clazz.getConstructor();
		Object object = constructor.newInstance();
		
		List <String> propertyNames = new ArrayList<>();
		Map<String, Method> getters = new HashMap<>();
		Map<String, Method> setters = new HashMap<>();
		for (Method method : clazz.getDeclaredMethods()) {
			if (method.getName().startsWith("get") && method.getParameterCount() == 0) {
				String subString = method.getName().substring(3);
				String property = Character.toLowerCase(subString.charAt(0)) + subString.substring(1);
				propertyNames.add(property);
				
				/*String subString = method.getName().substring(3);
				String property = Character.toLowerCase(subString.charAt(0)) + subString.substring(1);
				System.out.println(property);
				String set = "set" + subString;
				Class<?> parameterType[] = {method.getReturnType()};
				Method setter = clazz.getMethod(set, parameterType);
				System.out.println(setter.getName());*/
			}
		}
		
		for (String propertyName : propertyNames) {
			String title = Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1);
			Method getter = clazz.getMethod("get" + title);
			Class<?> parameterType[] = {getter.getReturnType()};
			Method setter = clazz.getMethod("set" + title, parameterType);
			setters.put(propertyName, setter);
			getters.put(propertyName, getter);
			System.out.println(getter.getName());
			System.out.println(setter.getName());
		}
		String propertyName = "myValue";
		
		Method getter = getters.get(propertyName);
		Method setter = setters.get(propertyName);
		
		/*String title = Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1);
		Method getter = clazz.getMethod("get" + title);
		Class<?> parameterType[] = {getter.getReturnType()};
		Method setter = clazz.getMethod("set" + title, parameterType);*/
		
		Object arguments[] = {98.45};
		setter.invoke(object, arguments);
		Object result = getter.invoke(object);
		System.out.println(result);
		
	}
}
