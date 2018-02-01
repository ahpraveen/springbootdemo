package com.company.rewardsplus.dao;

import org.springframework.data.repository.CrudRepository;
import com.company.rewardsplus.model.CustomerInfo;	


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerInfoRepository extends CrudRepository<CustomerInfo, Long> {
	
}