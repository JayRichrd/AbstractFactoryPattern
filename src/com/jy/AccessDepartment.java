package com.jy;

import com.jy.bean.Department;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("��Access������һ��Department��¼");
	}

	@Override
	public Department getUser(int id) {
		System.out.println("�����id��" + id);
		System.out.println("��Access�и���idֵ��ȡһ��Department��¼");
		return null;
	}

	/**
	 * �޲ι��캯��
	 */
	public AccessDepartment() {
		super();
	}

}
