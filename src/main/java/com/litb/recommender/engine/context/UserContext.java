package com.litb.recommender.engine.context;

import java.util.Date;
import java.util.List;

import com.litb.recommender.dto.BehaviorType;

public class UserContext {
	
	List<UserBehavior> behaviorHistory;
	
	public List<UserBehavior> getBehaviorHistory() {
		return behaviorHistory;
	}


	public void setBehaviorHistory(List<UserBehavior> behaviorHistory) {
		this.behaviorHistory = behaviorHistory;
	}


	public static class UserBehavior {
		
		private BehaviorType behaviorType;
		
		private Date behaviorTime;
		
		private int productId;
	
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
}
