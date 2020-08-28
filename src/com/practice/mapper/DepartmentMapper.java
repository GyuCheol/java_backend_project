package com.practice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.practice.model.Department;

public interface DepartmentMapper {
	
	@Select("SELECT * FROM departments")
	List<Department> getAllDepartment();
	
}
