package com.jy;

import com.jy.bean.Department;

public interface IDepartment {
	// ���벿��
	void insert(Department department);

	// ����id��ȡ����
	Department getUser(int id);
}
