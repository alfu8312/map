package com.apt.map;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.test.context.junit4.SpringRunner;

import com.apt.map.common.util.ApiGovHelper;
import com.apt.map.domain.AddrInfo;
import com.apt.map.domain.AptDealInfo;
import com.apt.map.repository.AddrInfoRepository;
import com.apt.map.repository.AptDealInfoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Autowired
    AptDealInfoRepository aptDealInfoRepository;

    @Autowired
    AddrInfoRepository addrInfoRepository;

    @Autowired
    ApiGovHelper api;

    @Autowired
    private Environment env;

    public String[] getActiveProfiles() {
        return env.getActiveProfiles();
    }

    @Test
    public void apiTest() throws Exception {
        // ApiGovHelper.getApiInfoApi();
        api.getApiInfoApi();
    }

    @Test
    public void insertAddrInfos() throws Exception {
        List<AddrInfo> addrInfos = new ArrayList<>();
        long str = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new FileReader("src/main/webapp/entrc_seoul.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String arr[] = line.split("\\|");
            AddrInfo vo = new AddrInfo();
            copyAddrInfoVo(arr, vo);
            addrInfos.add(vo);
        }
        System.out.println("TIME : " + (System.currentTimeMillis() - str));
        addrInfoRepository.save(addrInfos);
    }
    
    @Test
    public void updateAddrInfos() throws Exception {
        List<AddrInfo> addrInfos = new ArrayList<>();
        long str = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new FileReader("src/main/webapp/entrc_mod.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String arr[] = line.split("\\|");
            AddrInfo vo = new AddrInfo();
            copyAddrInfoVo(arr, vo);
            addrInfos.add(vo);
        }
        System.out.println("TIME : " + (System.currentTimeMillis() - str));
        addrInfoRepository.save(addrInfos);
    }
    
    private void copyAddrInfoVo(String[] arr, AddrInfo vo) {
        vo.setSigunguCode(arr[0]);
        vo.setBupjungdongCode(arr[2]);
        vo.setSiDoName(arr[3]);
        vo.setSiGunGuName(arr[4]);
        vo.setDongName(arr[5]);
        vo.setStreetAddrCode(arr[6]);
        vo.setStreetAddrName(arr[7]);
        vo.setUnderYn(arr[8]);
        vo.setBuildingMainNumber(arr[9]);
        vo.setBuildingSubNumber(arr[10]);
        vo.setBuildingName(arr[11]);
        if(arr.length > 15) {
            vo.setSubDongName(arr[15]);
        }
        if(arr.length > 16) {
            vo.setxPoint(arr[16]);
            vo.setyPoint(arr[17]);
        }
    }

    @Test
    public void createAPtDealInfo() {
        AptDealInfo vo = new AptDealInfo();
        vo.setAptName("°í´ö");
        Point point = new Point(127.146958, 37.5585073);
        vo.setLocation(new GeoJsonPoint(point));
        aptDealInfoRepository.save(vo);
        System.out.println(vo.getId());
    }

    @Test
    public void selectAptDealInfoList() {
        List<AptDealInfo> list = aptDealInfoRepository.findAll();
        System.out.println(list);
    }

    @Test
    public void encodingTest() throws Exception {
        String myKey = "GG7bI0mA7LpDE12u%2Fixhja860CpxEaDRVZTwojtsBPDI2xrm6D6K%2FvWTP9egcqhNOAVpClRG2WqTmkMs%2F82NcA%3D%3D";

        String ServiceKey = URLEncoder.encode(myKey, "UTF-8");
        System.out.println(ServiceKey);
    }
}
