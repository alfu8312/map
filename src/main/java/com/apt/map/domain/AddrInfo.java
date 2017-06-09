package com.apt.map.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AddrInfo {

    @Id
    public String id;

    // 1 시군구코드 5 문자
    public String sigunguCode;
    // 2 출입구일련번호 10 문자

    // 3 법정동코드 10 문자 PK5 (시군구코드(5) + 읍면동코드(3) + 00)
    public String bupjungdongCode;
    // 4 시도명 40 문자
    public String siDoName;
    // 5 시군구명 40 문자
    public String siGunGuName;
    // 6 읍면동명 40 문자
    public String dongName;
    // 7 도로명코드 12 문자 PK1 (시군구코드(5)+도로명번호(7))
    public String streetAddrCode;
    // 8 도로명 80 문자
    public String streetAddrName;
    // 9 지하여부 1 문자 PK2
    public String underYn;
    // 10 건물본번 5 숫자 PK3
    public String buildingMainNumber;
    // 11 건물부번 5 숫자 PK4
    public String buildingSubNumber;
    // 12 건물명 40 문자
    public String buildingName;
    // 13 우편번호 5 문자
    // 14 건물용도분류 100 문자 복수 건물용도가 존재시 콤마(,)로 구분
    // 15 건물군여부 1 문자 0:단독건물, 1:건물군
    // 16 관할행정동 8 문자
    public String subDongName;
    // 17 X좌표 15,6 숫자
    public String xPoint;
    // 18 Y좌표 15,6 숫자
    public String yPoint;

    // 19 이동사유코드 2 문자 31 : 생성, 34 : 변동, 63 : 삭제
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSigunguCode() {
        return sigunguCode;
    }

    public void setSigunguCode(String sigunguCode) {
        this.sigunguCode = sigunguCode;
    }

    public String getBupjungdongCode() {
        return bupjungdongCode;
    }

    public void setBupjungdongCode(String bupjungdongCode) {
        this.bupjungdongCode = bupjungdongCode;
    }

    public String getSiDoName() {
        return siDoName;
    }

    public void setSiDoName(String siDoName) {
        this.siDoName = siDoName;
    }

    public String getSiGunGuName() {
        return siGunGuName;
    }

    public void setSiGunGuName(String siGunGuName) {
        this.siGunGuName = siGunGuName;
    }

    public String getDongName() {
        return dongName;
    }

    public void setDongName(String dongName) {
        this.dongName = dongName;
    }

    public String getStreetAddrCode() {
        return streetAddrCode;
    }

    public void setStreetAddrCode(String streetAddrCode) {
        this.streetAddrCode = streetAddrCode;
    }

    public String getStreetAddrName() {
        return streetAddrName;
    }

    public void setStreetAddrName(String streetAddrName) {
        this.streetAddrName = streetAddrName;
    }

    public String getUnderYn() {
        return underYn;
    }

    public void setUnderYn(String underYn) {
        this.underYn = underYn;
    }

    public String getBuildingMainNumber() {
        return buildingMainNumber;
    }

    public void setBuildingMainNumber(String buildingMainNumber) {
        this.buildingMainNumber = buildingMainNumber;
    }

    public String getBuildingSubNumber() {
        return buildingSubNumber;
    }

    public void setBuildingSubNumber(String buildingSubNumber) {
        this.buildingSubNumber = buildingSubNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getSubDongName() {
        return subDongName;
    }

    public void setSubDongName(String subDongName) {
        this.subDongName = subDongName;
    }

    public String getxPoint() {
        return xPoint;
    }

    public void setxPoint(String xPoint) {
        this.xPoint = xPoint;
    }

    public String getyPoint() {
        return yPoint;
    }

    public void setyPoint(String yPoint) {
        this.yPoint = yPoint;
    }

}
