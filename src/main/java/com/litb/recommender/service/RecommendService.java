package com.litb.recommender.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.litb.recommender.dto.BehaviorDTO;

@Service
public class RecommendService {

	public List<Integer> recommend(List<BehaviorDTO> behaviors) {
		List<Integer> recommendations = new ArrayList<>();
		
		return recommendations;
	}
	
}
