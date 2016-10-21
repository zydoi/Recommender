package com.litb.recommender.repository;

import org.springframework.data.repository.CrudRepository;

import com.litb.recommender.entity.RecommendItem;


public interface RecommItemRepository extends CrudRepository<RecommendItem, Integer> {
	
}
