package com.apt.map.vo;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

public class AptInfoVo {
    
    
    
    
    
   

    

    public String id;

    public String city;
//    <������>������</������>
//    <�����������ڵ�>0009</�����������ڵ�>
//    <�������ι��ڵ�>0000</�������ι��ڵ�>
//    <�������ñ����ڵ�>11110</�������ñ����ڵ�>
//    <���������鵿�ڵ�>11500</���������鵿�ڵ�>
//    <�����������ڵ�>1</�����������ڵ�>
//    <�Ϸù�ȣ>11110-2203</�Ϸù�ȣ>
//    <����>9</����>
//    <�����ڵ�>11110</�����ڵ�>
    public String parcelAddr;
    // <����Ʈ>��ȭ��ǳ�������̽���(9-0)</����Ʈ>
    public String aptName;
    //     <�������>94.51</�������>
    public String area;
    // ��-��-��
    public String dealYmd;
    // <��>2015</��>
    public String dealYear;
    // <��>12</��>
    public String dealMonth;
    // <��>1~10</��>
    public String dealDay;
    // <�ŷ��ݾ�> 82,500</�ŷ��ݾ�>
    public String dealAmount;
    // <��>11</��>
    public String floor;
    // <����⵵>2008</����⵵>
    public String buildYear;
    // <���θ�>������8��</���θ�>
//    <���θ�ǹ�����ȣ�ڵ�>00004</���θ�ǹ�����ȣ�ڵ�>
//    <���θ�ǹ��ι�ȣ�ڵ�>00000</���θ�ǹ��ι�ȣ�ڵ�>
//    <���θ�ñ����ڵ�>11110</���θ�ñ����ڵ�>
//    <���θ��Ϸù�ȣ�ڵ�>03</���θ��Ϸù�ȣ�ڵ�>
//    <���θ����������ڵ�>0</���θ����������ڵ�>
//    <���θ��ڵ�>4100135</���θ��ڵ�>
    public String streetAddr;
}
