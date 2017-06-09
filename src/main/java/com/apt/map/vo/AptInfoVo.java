package com.apt.map.vo;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

public class AptInfoVo {
    
    
    
    
    
   

    

    public String id;

    public String city;
//    <법정동>사직동</법정동>
//    <법정동본번코드>0009</법정동본번코드>
//    <법정동부번코드>0000</법정동부번코드>
//    <법정동시군구코드>11110</법정동시군구코드>
//    <법정동읍면동코드>11500</법정동읍면동코드>
//    <법정동지번코드>1</법정동지번코드>
//    <일련번호>11110-2203</일련번호>
//    <지번>9</지번>
//    <지역코드>11110</지역코드>
    public String parcelAddr;
    // <아파트>광화문풍림스페이스본(9-0)</아파트>
    public String aptName;
    //     <전용면적>94.51</전용면적>
    public String area;
    // 년-월-일
    public String dealYmd;
    // <년>2015</년>
    public String dealYear;
    // <월>12</월>
    public String dealMonth;
    // <일>1~10</일>
    public String dealDay;
    // <거래금액> 82,500</거래금액>
    public String dealAmount;
    // <층>11</층>
    public String floor;
    // <건축년도>2008</건축년도>
    public String buildYear;
    // <도로명>사직로8길</도로명>
//    <도로명건물본번호코드>00004</도로명건물본번호코드>
//    <도로명건물부번호코드>00000</도로명건물부번호코드>
//    <도로명시군구코드>11110</도로명시군구코드>
//    <도로명일련번호코드>03</도로명일련번호코드>
//    <도로명지상지하코드>0</도로명지상지하코드>
//    <도로명코드>4100135</도로명코드>
    public String streetAddr;
}
