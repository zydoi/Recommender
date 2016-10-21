package com.litb.recommender.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.litb.recommender.dto.BehaviorDTO;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
public class RecommendController {
	
	@ApiOperation(value = "Recommendation based on the user behaviors.")
	@RequestMapping(value = "recommend", method = RequestMethod.GET, produces = "application/json")
	public List<Integer> recommendItems(String customerId, List<BehaviorDTO> behaviors) {
		return new ArrayList<>();
	}
}