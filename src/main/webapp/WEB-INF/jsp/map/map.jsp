<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>������ ���� ǥ���ϱ�</title>
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=StvUbYWnrhaJcdl2wiwN"></script>
</head>
<body>
<div id="map" style="width:100%;height:400px;"></div>

<script>
var mapOptions = {
    center: new naver.maps.LatLng(37.557259, 127.151538),
    zoom: 10
};

var map = new naver.maps.Map('map', mapOptions);
</script>
</body>
</html>