package com.apt.map.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class AddrInfo {

    @Id
    public String id;

    // 1 �ñ����ڵ� 5 ����
    public String sigunguCode;
    // 2 ���Ա��Ϸù�ȣ 10 ����

    // 3 �������ڵ� 10 ���� PK5 (�ñ����ڵ�(5) + ���鵿�ڵ�(3) + 00)
    public String bupjungdongCode;
    // 4 �õ��� 40 ����
    public String siDoName;
    // 5 �ñ����� 40 ����
    public String siGunGuName;
    // 6 ���鵿�� 40 ����
    public String dongName;
    // 7 ���θ��ڵ� 12 ���� PK1 (�ñ����ڵ�(5)+���θ��ȣ(7))
    public String streetAddrCode;
    // 8 ���θ� 80 ����
    public String streetAddrName;
    // 9 ���Ͽ��� 1 ���� PK2
    public String underYn;
    // 10 �ǹ����� 5 ���� PK3
    public String buildingMainNumber;
    // 11 �ǹ��ι� 5 ���� PK4
    public String buildingSubNumber;
    // 12 �ǹ��� 40 ����
    public String buildingName;
    // 13 �����ȣ 5 ����
    // 14 �ǹ��뵵�з� 100 ���� ���� �ǹ��뵵�� ����� �޸�(,)�� ����
    // 15 �ǹ������� 1 ���� 0:�ܵ��ǹ�, 1:�ǹ���
    // 16 ���������� 8 ����
    public String subDongName;
    // 17 X��ǥ 15,6 ����
    public String xPoint;
    // 18 Y��ǥ 15,6 ����
    public String yPoint;

    // 19 �̵������ڵ� 2 ���� 31 : ����, 34 : ����, 63 : ����
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
