package com.litb.recommender.repository;

import org.springframework.data.repository.CrudRepository;

import com.litb.recommender.entity.CustomerProfile;

public interface CustomerProfileRepository extends CrudRepository<CustomerProfile, Long> {

}
