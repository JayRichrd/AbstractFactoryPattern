package com.jy;

public interface IFactory {
	// ������ͬ���ݿ��в���User����
	IUser createUser();

	// ������ͬ���ݿ����Department����
	IDepartment createDepartment();
}
