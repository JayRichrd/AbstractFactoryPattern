package com.jy;

import com.jy.bean.Department;

public interface IDepartment {
	// 插入部门
	void insert(Department department);

	// 根据id获取部门
	Department getUser(int id);
}
