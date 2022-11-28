package com.department.departmentidtoname.service;
import java.util.Optional;

import com.department.departmentidtoname.entity.DepartmentEntity;

public interface DepartmentServiceInterface {
	
	
	Optional<DepartmentEntity> finddeptname(int deptid);

}
