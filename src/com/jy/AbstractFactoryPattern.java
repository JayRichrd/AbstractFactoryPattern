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
		// // ���ݿ�����
		// int dbType = 0;
		// System.out.print("������Ҫ���������ݿ�����(1����SqlServer;2����Access):");
		// dbType = scanner.nextInt();
		//
		// // ��������Ĳ�ͬ���ɲ�ͬ�Ĺ�����
		// IFactory iFactory = null;
		// StringBuilder bdTypeSB = new StringBuilder("�㽫Ҫ��������");
		// switch (dbType) {
		// case 1: // ����SqlSerer���ݿ�
		// bdTypeSB.append("SqlServer");
		// iFactory = new SqlServerFactory();
		// break;
		// case 2: // ����Access���ݿ�
		// bdTypeSB.append("Access");
		// iFactory = new AccessFactory();
		// break;
		// default:
		// break;
		// }
		//
		// // ���ɲ�ͬ�����ݲ�����
		// System.out.println(bdTypeSB.toString());
		//
		// // ��������
		// int dataType = 0;
		// System.out.print("������Ҫ���������ݿ�����(1����User;2����Department):");
		// dataType = scanner.nextInt();
		//
		// // ��������ѡ����Ҫ��������������
		// StringBuilder dataTypeSB = new StringBuilder("�㽫Ҫ��������������");
		// switch (dataType) {
		// case 1: // ����User
		// dataTypeSB.append("User");
		// System.out.println(dataTypeSB.toString());
		// IUser iUser = iFactory.createUser();
		// iUser.insert(new User());
		// iUser.getUser(4);
		// break;
		// case 2: // ����Department
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
		// // �ͷ���Դ
		// dataTypeSB = null;
		// bdTypeSB = null;
		// scanner.close();

		// ����User����
		IUser iUser = DataOperation.createUser();
		iUser.insert(new User());
		iUser.getUser(1);

		// ����Department����
		IDepartment iDepartment = DataOperation.createDepartment();
		iDepartment.insert(new Department());
		iDepartment.getUser(2);

	}

}
