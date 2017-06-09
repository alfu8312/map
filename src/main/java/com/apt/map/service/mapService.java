package com.apt.map.service;

import java.util.List;

import com.apt.map.domain.AddrInfo;
import com.apt.map.vo.AptInfoVo;

public interface mapService {

    List<AddrInfo> findAddrInfo(AptInfoVo aptInfoVo);

}
