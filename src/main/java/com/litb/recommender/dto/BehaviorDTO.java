package com.litb.recommender.dto;

import java.util.Date;

public class BehaviorDTO {

	private BehaviorType behaviorType;
	
	private Date behaviorTime;
	
	private int productId;
	
	//private int userId;

	public BehaviorType getBehaviorType() {
		return behaviorType;
	}

	public void setBehaviorType(BehaviorType behaviorType) {
		this.behaviorType = behaviorType;
	}

	public Date getBehaviorTime() {
		return behaviorTime;
	}

	public void setBehaviorTime(Date behaviorTime) {
		this.behaviorTime = behaviorTime;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
}
