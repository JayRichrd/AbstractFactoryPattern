package com.jy;

import com.jy.bean.User;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("��Access������һ��User��¼");
	}

	@Override
	public User getUser(int id) {
		System.out.println("�����id��" + id);
		System.out.println("��Access�и���idֵ��ȡһ��User��¼");
		return null;
	}

}
