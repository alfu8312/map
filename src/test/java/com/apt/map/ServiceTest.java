package com.apt.map;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.test.context.junit4.SpringRunner;

import com.apt.map.domain.AptDealInfo;
import com.apt.map.repository.AptDealInfoRepository;
import com.apt.map.util.ApiGovUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

	@Autowired
	AptDealInfoRepository aptDealInfoRepository;

	@Autowired
	ApiGovUtil api;

	@Autowired
	private Environment env;

	public String[] getActiveProfiles() {
		return env.getActiveProfiles();
	}

	@Test
	public void apiTest() throws Exception {
		api.getApiInfoApi();
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
