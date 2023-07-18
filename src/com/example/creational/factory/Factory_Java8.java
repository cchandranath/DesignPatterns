package com.example.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Factory_Java8 {
	private static Map<String, Supplier<Parent_Class>> map = new HashMap();
	
	static 
	{
		map.put("CLAZZ1", Class1::new);
		map.put("CLAZZ2", Class2::new);
	};
	
	public static Parent_Class getClazz(String clazz) {
		return map.get(clazz.toUpperCase()).get();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent_Class clazz = Factory_Java8.getClazz("clazz2");
		clazz.some_method();
	}

}
