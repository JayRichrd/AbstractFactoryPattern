package com.jy;

public interface IFactory {
	// 创建不同数据库中操作User的类
	IUser createUser();

	// 创建不同数据库操作Department的类
	IDepartment createDepartment();
}
