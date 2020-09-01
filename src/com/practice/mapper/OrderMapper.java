package com.practice.mapper;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.practice.model.EMOrderAmount;

public interface OrderMapper {
	
	List<EMOrderAmount> getEMOrderAmountListByDepartment(@Param("departmentId") int deparmentId, @Param("from") LocalDate from, @Param("to") LocalDate to);
	
	
}
