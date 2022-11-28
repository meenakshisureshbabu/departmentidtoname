package com.department.departmentidtoname.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.departmentidtoname.entity.DepartmentEntity;
import com.department.departmentidtoname.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentServiceInterface{
	
	@Autowired
	DepartmentRepository departmentrepository;
	
	
	@Override
	public Optional<DepartmentEntity> finddeptname(int deptid) {
		// TODO Auto-generated method stub
		return departmentrepository.findById(deptid);
		
	}
}
