package com.jy;

import com.jy.bean.User;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在SqlServer中增加一条User记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("输入的id：" + id);
		System.out.println("在SqlServer中根据id值获取一条User记录");
		return null;
	}

	/**
	 * 无参构造函数
	 */
	public SqlServerUser() {
		super();
	}

}
