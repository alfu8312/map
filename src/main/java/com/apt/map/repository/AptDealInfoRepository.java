package com.apt.map.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apt.map.domain.AptDealInfo;

@Repository
public interface AptDealInfoRepository extends MongoRepository<AptDealInfo, String>{

}
