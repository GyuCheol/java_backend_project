package com.practice.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {

	private int id;
	private int transactionTypeId;
	private int supplierId;
	private int emergencyMaintenancesId;
	private int sourceWarehouseId;
	private int destinationWarehouseId;
	private LocalDate date;
	private LocalTime time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTransactionTypeId() {
		return transactionTypeId;
	}
	public void setTransactionTypeId(int transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getEmergencyMaintenancesId() {
		return emergencyMaintenancesId;
	}
	public void setEmergencyMaintenancesId(int emergencyMaintenancesId) {
		this.emergencyMaintenancesId = emergencyMaintenancesId;
	}
	public int getSourceWarehouseId() {
		return sourceWarehouseId;
	}
	public void setSourceWarehouseId(int sourceWarehouseId) {
		this.sourceWarehouseId = sourceWarehouseId;
	}
	public int getDestinationWarehouseId() {
		return destinationWarehouseId;
	}
	public void setDestinationWarehouseId(int destinationWarehouseId) {
		this.destinationWarehouseId = destinationWarehouseId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	
	
}
