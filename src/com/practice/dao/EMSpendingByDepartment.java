package com.practice.dao;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.practice.config.MyBatisConfig;
import com.practice.dao.model.MonthlyCostByDepartment;
import com.practice.mapper.OrderMapper;
import com.practice.model.Department;
import com.practice.model.EMOrderAmount;

public class EMSpendingByDepartment {
	
	public MonthlyCostByDepartment getMonthlyCostByDepartment(Department department, LocalDate from, LocalDate to) {
		MonthlyCostByDepartment result = new MonthlyCostByDepartment(department.getId(), department.getName());
		
		try (SqlSession session = MyBatisConfig.getSessionFactory().openSession()) {
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			List<EMOrderAmount> list = mapper.getEMOrderAmountListByDepartment(department.getId(), from, to);
			
			for (EMOrderAmount item : list) {
				result.addCost(item);
			}
		}
		
		return result;
	}
	
}
