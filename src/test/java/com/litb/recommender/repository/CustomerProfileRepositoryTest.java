package com.litb.recommender.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.litb.recommender.App;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class CustomerProfileRepositoryTest {

	@Autowired
	private CustomerProfileRepository repos;
	
	@Test
	public void test() {
		repos.findAll();
	}
}
