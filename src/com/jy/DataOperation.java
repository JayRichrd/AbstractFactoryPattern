package com.jy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataOperation {
	// ����ʹ�õİ���
	private static final String PACKAGE_NAME = "com.jy";
	// User����������
	private static final String USER = "User";
	// Department����������
	private static final String DEPARTMENT = "Department";

	// ��ȡ���Զ���
	private static Properties mProperties;
	// ���ݿ���
	private static String dbname;

	static {
		try (FileInputStream mFis = new FileInputStream("./resources/db.properties");) { // Java7��ǿtry��䶨�������ļ���
			mProperties = new Properties();
			// ���������ļ�
			mProperties.load(mFis);
			// �������ļ��ж�ȡ����ֵ
			dbname = mProperties.getProperty("dbname");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���ɲ�������User����
	 * 
	 * @return
	 */
	public static IUser createUser() {
		// ���ȫ·��
		String fullPath = PACKAGE_NAME + "." + dbname + USER;
		IUser iUser = null;
		try {
			// ʹ�÷��乹������
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
	 * ���ɲ�������Department����
	 * 
	 * @return
	 */
	public static IDepartment createDepartment() {
		// ���ȫ·��
		String fullPath = PACKAGE_NAME + "." + dbname + DEPARTMENT;
		IDepartment iDepartment = null;
		try {
			// ʹ�÷��乹������
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
