package com.myigituzun.library;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ClassReflector {
	private Class<?> type;
	private Constructor<?> constructor;
	private Map<String, PropertyReflector> properties = new HashMap<>();

	public ClassReflector(Class<?> type) throws NoSuchMethodException, SecurityException {
		setType(type);
	}

	public ClassReflector(String className) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		setType(Class.forName(className));
	}

	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) throws NoSuchMethodException, SecurityException {
		this.type = type;
		this.constructor = type.getConstructor();
		findProperties();
	}

	private void findProperties() throws NoSuchMethodException, SecurityException {
		for (Method method : type.getDeclaredMethods()) {
			if (method.getName().startsWith("get") && method.getParameterCount() == 0) {
				String subString = method.getName().substring(3);
				String property = Character.toLowerCase(subString.charAt(0)) + subString.substring(1);
				String title = Character.toUpperCase(property.charAt(0)) + property.substring(1);
				Method getter = type.getMethod("get" + title);
				Class<?> parameterType[] = { getter.getReturnType() };
				Method setter = type.getMethod("set" + title, parameterType);

				PropertyReflector propertyReflector = new PropertyReflector(this, title, getter, setter);
				properties.put(property, propertyReflector);
			}
		}
	}

	public Map<String, PropertyReflector> getProperties() {
		return properties;
	}

	public Object newInstance()
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		return constructor.newInstance();
	}

	public void setValue(Object object, String property, Object value)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		PropertyReflector propertyReflector = getProperties().get(property);
		Method setter = propertyReflector.getSetter();
		Object arguments[] = { value };
		setter.invoke(object, arguments);
	}

	public Object getValue(Object object, String property)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		PropertyReflector propertyReflector = getProperties().get("myValue");
		Method getter = propertyReflector.getGetter();
		Object result = getter.invoke(object);
		return result;
	}
}
