package com.apt.map;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.test.context.junit4.SpringRunner;

import com.apt.map.domain.AptDealInfo;
import com.apt.map.repository.AptDealInfoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

	@Autowired
	AptDealInfoRepository aptDealInfoRepository;

	@Test
	public void createAPtDealInfo() {
		AptDealInfo vo = new AptDealInfo();
		vo.setAptName("°í´ö·¡¹Ì¾ÈÈú½ºÅ×ÀÌÆ®");
		Point point = new Point(127.146958, 37.5585073);
		vo.setLocation(new GeoJsonPoint(point ));
		aptDealInfoRepository.save(vo);

	}

	@Test
	public void encodingTest() throws Exception {
		String myKey = "GG7bI0mA7LpDE12u%2Fixhja860CpxEaDRVZTwojtsBPDI2xrm6D6K%2FvWTP9egcqhNOAVpClRG2WqTmkMs%2F82NcA%3D%3D";

		String ServiceKey = URLEncoder.encode(myKey, "UTF-8");
		System.out.println(ServiceKey);
	}
}
