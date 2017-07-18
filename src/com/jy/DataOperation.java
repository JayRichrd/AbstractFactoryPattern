package com.jy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataOperation {
	// 反射使用的包名
	private static final String PACKAGE_NAME = "com.jy";
	// User数据类型名
	private static final String USER = "User";
	// Department数据类型名
	private static final String DEPARTMENT = "Department";

	// 读取属性对象
	private static Properties mProperties;
	// 数据库名
	private static String dbname;

	static {
		try (FileInputStream mFis = new FileInputStream("./resources/db.properties");) { // Java7增强try语句定义输入文件流
			mProperties = new Properties();
			// 加载属性文件
			mProperties.load(mFis);
			// 从属性文件中读取属性值
			dbname = mProperties.getProperty("dbname");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 生成操作数据User的类
	 * 
	 * @return
	 */
	public static IUser createUser() {
		// 类的全路径
		String fullPath = PACKAGE_NAME + "." + dbname + USER;
		IUser iUser = null;
		try {
			// 使用反射构建对象
			Class<?> clazz = Class.forName(fullPath);
			iUser = (IUser) clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return iUser;
	}

	/**
	 * 生成操作数据Department的类
	 * 
	 * @return
	 */
	public static IDepartment createDepartment() {
		// 类的全路径
		String fullPath = PACKAGE_NAME + "." + dbname + DEPARTMENT;
		IDepartment iDepartment = null;
		try {
			// 使用反射构建对象
			Class<?> clazz = Class.forName(fullPath);
			iDepartment = (IDepartment) clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return iDepartment;
	}

}
