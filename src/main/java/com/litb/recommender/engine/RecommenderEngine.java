package com.litb.recommender.engine;

import java.util.List;

import com.litb.recommender.engine.context.UserContext;

public interface RecommenderEngine {

	/**
	 * Recommend products based on user historical behaviors.
	 * 
	 * @return recommended product ids
	 */
	List<Integer> recommend(UserContext context);
}
