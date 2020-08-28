package com.practice.model;

import java.time.LocalDate;

public class Asset {
	private int id;
	private String assetSN;
	private String assetName;
	private int departmentLocationId;
	private int employeeId;
	private String description;
	private LocalDate warrantyDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssetSN() {
		return assetSN;
	}
	public void setAssetSN(String assetSN) {
		this.assetSN = assetSN;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public int getDepartmentLocationId() {
		return departmentLocationId;
	}
	public void setDepartmentLocationId(int departmentLocationId) {
		this.departmentLocationId = departmentLocationId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getWarrantyDate() {
		return warrantyDate;
	}
	public void setWarrantyDate(LocalDate warrantyDate) {
		this.warrantyDate = warrantyDate;
	}
	
	
	
}
