package com.practice.dao.model;

import java.util.ArrayList;

import com.practice.model.EMOrderAmount;

public class MonthlyCostByDepartment {
	
	private int departmentId;
	private String departmentName;
	private ArrayList<EMOrderAmount> amountList = new ArrayList<>();
	
	
	public MonthlyCostByDepartment(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	public ArrayList<EMOrderAmount> getAmountList() {
		return amountList;
	}

	public void addCost(EMOrderAmount cost) {
		this.amountList.add(cost);
	}
	
	public boolean removeCost(EMOrderAmount cost) {
		return this.amountList.remove(cost);
	}
	
	public boolean contains(EMOrderAmount cost) {
		return this.amountList.contains(cost);
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
	
	
}
