package com.jy;

import com.jy.bean.Department;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("��SqlServer������һ��Department��¼");
	}

	@Override
	public Department getUser(int id) {
		System.out.println("�����id��" + id);
		System.out.println("��SqlServer�и���idֵ��ȡһ��Department��¼");
		return null;
	}

	/**
	 * �޲ι��캯��
	 */
	public SqlServerDepartment() {
		super();
	}
	
	

}
