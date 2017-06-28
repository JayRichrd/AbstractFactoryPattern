package com.jy;

import com.jy.bean.Department;

public class SqlServerDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		System.out.println("在SqlServer中增加一条Department记录");
	}

	@Override
	public Department getUser(int id) {
		System.out.println("输入的id：" + id);
		System.out.println("在SqlServer中根据id值获取一条Department记录");
		return null;
	}

	/**
	 * 无参构造函数
	 */
	public SqlServerDepartment() {
		super();
	}
	
	

}
