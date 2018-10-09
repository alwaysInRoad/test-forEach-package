package com.zr.test.test;

import java.util.Set;

import com.zr.test.utils.ClassUtils;

public class Test {
	public static void main(String[] args) {
		String packageName = "com.zr.test.entity"; //填入完整包名，如com.org.String
		//packageName包名     false：不遍历子包
		Set<String> classNames = ClassUtils.getClassName(packageName, false);
		if (classNames != null) {
			for (String className : classNames) {
				System.out.println(className);
			}
		}
	}
}
