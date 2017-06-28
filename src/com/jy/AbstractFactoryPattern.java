package com.jy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import com.jy.bean.Department;
import com.jy.bean.User;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		//
		// // 数据库类型
		// int dbType = 0;
		// System.out.print("请输入要操作的数据库类型(1代表SqlServer;2代表Access):");
		// dbType = scanner.nextInt();
		//
		// // 根据输入的不同生成不同的工厂类
		// IFactory iFactory = null;
		// StringBuilder bdTypeSB = new StringBuilder("你将要操作的是");
		// switch (dbType) {
		// case 1: // 操作SqlSerer数据库
		// bdTypeSB.append("SqlServer");
		// iFactory = new SqlServerFactory();
		// break;
		// case 2: // 操作Access数据库
		// bdTypeSB.append("Access");
		// iFactory = new AccessFactory();
		// break;
		// default:
		// break;
		// }
		//
		// // 生成不同的数据操作类
		// System.out.println(bdTypeSB.toString());
		//
		// // 数据类型
		// int dataType = 0;
		// System.out.print("请输入要操作的数据库类型(1代表User;2代表Department):");
		// dataType = scanner.nextInt();
		//
		// // 根据输入选择需要操作的数据类型
		// StringBuilder dataTypeSB = new StringBuilder("你将要操作数据类型是");
		// switch (dataType) {
		// case 1: // 操作User
		// dataTypeSB.append("User");
		// System.out.println(dataTypeSB.toString());
		// IUser iUser = iFactory.createUser();
		// iUser.insert(new User());
		// iUser.getUser(4);
		// break;
		// case 2: // 操作Department
		// dataTypeSB.append("Department");
		// System.out.println(dataTypeSB.toString());
		// IDepartment iDepartment = iFactory.createDepartment();
		// iDepartment.insert(new Department());
		// iDepartment.getUser(5);
		// break;
		// default:
		// break;
		// }
		//
		// // 释放资源
		// dataTypeSB = null;
		// bdTypeSB = null;
		// scanner.close();

		// 操作User数据
		IUser iUser = DataOperation.createUser();
		iUser.insert(new User());
		iUser.getUser(1);

		// 操作Department数据
		IDepartment iDepartment = DataOperation.createDepartment();
		iDepartment.insert(new Department());
		iDepartment.getUser(2);

	}

}
