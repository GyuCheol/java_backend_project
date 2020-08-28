package com.practice.model;

import java.time.LocalDate;

public class EmergencyMaintenance {

	private int id;
	private int assetId;
	private int priorityId;
	private String descriptionEmergency;
	private String otherConsiderations;
	private LocalDate emRequestDate;
	private LocalDate emStartDate;
	private LocalDate emEndDate;
	private String emTechnicianNote;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public int getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}
	public String getDescriptionEmergency() {
		return descriptionEmergency;
	}
	public void setDescriptionEmergency(String descriptionEmergency) {
		this.descriptionEmergency = descriptionEmergency;
	}
	public String getOtherConsiderations() {
		return otherConsiderations;
	}
	public void setOtherConsiderations(String otherConsiderations) {
		this.otherConsiderations = otherConsiderations;
	}
	public LocalDate getEmRequestDate() {
		return emRequestDate;
	}
	public void setEmRequestDate(LocalDate emRequestDate) {
		this.emRequestDate = emRequestDate;
	}
	public LocalDate getEmStartDate() {
		return emStartDate;
	}
	public void setEmStartDate(LocalDate emStartDate) {
		this.emStartDate = emStartDate;
	}
	public LocalDate getEmEndDate() {
		return emEndDate;
	}
	public void setEmEndDate(LocalDate emEndDate) {
		this.emEndDate = emEndDate;
	}
	public String getEmTechnicianNote() {
		return emTechnicianNote;
	}
	public void setEmTechnicianNote(String emTechnicianNote) {
		this.emTechnicianNote = emTechnicianNote;
	}
	
	
	
}
