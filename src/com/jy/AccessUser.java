package com.jy;

import com.jy.bean.User;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在Access中增加一条User记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("输入的id：" + id);
		System.out.println("在Access中根据id值获取一条User记录");
		return null;
	}

}
