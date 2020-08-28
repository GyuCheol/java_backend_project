package com.practice.model;

import java.math.BigDecimal;

public class Part {

	private int id;
	private String name;
	private int effectiveLife;
	private boolean batchNumberHasRequired;
	private BigDecimal minimumQuantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEffectiveLife() {
		return effectiveLife;
	}
	public void setEffectiveLife(int effectiveLife) {
		this.effectiveLife = effectiveLife;
	}
	public boolean getBatchNumberHasRequired() {
		return batchNumberHasRequired;
	}
	public void setBatchNumberHasRequired(boolean batchNumberHasRequired) {
		this.batchNumberHasRequired = batchNumberHasRequired;
	}
	public BigDecimal getMinimumQuantity() {
		return minimumQuantity;
	}
	public void setMinimumQuantity(BigDecimal minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
	}
	
	
	
}
