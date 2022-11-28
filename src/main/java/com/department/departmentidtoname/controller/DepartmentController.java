package com.department.departmentidtoname.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.department.departmentidtoname.entity.DepartmentEntity;
import com.department.departmentidtoname.service.DepartmentServiceInterface;

@RestController
@RequestMapping("/departmentname")
public class DepartmentController {

	@Autowired
	DepartmentServiceInterface deptservice;
	
	@GetMapping(value="/getDeptName")
	DepartmentEntity getDepartmentName(@RequestParam String deptId)
	{
		System.out.println("Inside the controller...");
		int deptid = Integer.parseInt(deptId);
		Optional<DepartmentEntity> deptentity = deptservice.finddeptname(deptid);
		DepartmentEntity dep = new DepartmentEntity();
		//dep.setDeptId(deptid);
		dep = deptentity.get();
		//dep.setDeptName(deptentity.get().toString().toString());
		System.out.println("Dept Name returned::"+dep.getDeptName());
		return dep;
		
		
	}
	
}
