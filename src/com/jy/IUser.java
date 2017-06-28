package com.jy;

import com.jy.bean.User;

public interface IUser {
	// 插入用户
	void insert(User user);

	// 根据id获取用户
	User getUser(int id);
}
