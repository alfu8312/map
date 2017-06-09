package com.apt.map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apt.map.domain.AddrInfo;
import com.apt.map.repository.AddrInfoRepository;
import com.apt.map.repository.AptDealInfoRepository;
import com.apt.map.service.mapService;
import com.apt.map.vo.AptInfoVo;

@Service
public class mapServiceImpl implements mapService {

    @Autowired
    AddrInfoRepository addrInfoRepository;
    @Autowired
    AptDealInfoRepository aptDealInfoRepository;
    
    @Override
    public List<AddrInfo> findAddrInfo(AptInfoVo aptInfoVo) {
        
        return null;
    }
}
