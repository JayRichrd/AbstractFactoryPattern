package com.jy;

import com.jy.bean.User;

public interface IUser {
	// �����û�
	void insert(User user);

	// ����id��ȡ�û�
	User getUser(int id);
}
