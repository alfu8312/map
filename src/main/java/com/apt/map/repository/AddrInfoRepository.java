package com.apt.map.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apt.map.domain.AddrInfo;

@Repository
public interface AddrInfoRepository extends MongoRepository<AddrInfo, String>{
    /**
     * ���θ��ڵ�, ����, �ι����� ��ȸ
     * @param stAddrCd
     * @param bdMainNum
     * @param bdSubNum
     * @return
     */
    List<AddrInfo> findByStreetAddrCodeAndBuildingMainNumberAndBuildingSubNumber(String stAddrCd, String bdMainNum, String bdSubNum);
}
