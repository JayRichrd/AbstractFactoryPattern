package com.jy;

import com.jy.bean.User;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("��SqlServer������һ��User��¼");
	}

	@Override
	public User getUser(int id) {
		System.out.println("�����id��" + id);
		System.out.println("��SqlServer�и���idֵ��ȡһ��User��¼");
		return null;
	}

	/**
	 * �޲ι��캯��
	 */
	public SqlServerUser() {
		super();
	}

}
