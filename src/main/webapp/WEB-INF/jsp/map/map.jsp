<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <title>간단한 지도 표시하기</title>
    <script type="text/javascript" src="https://openapi.map.naver.com/openapi/v3/maps.js?clientId=StvUbYWnrhaJcdl2wiwN"></script>
</head>
<body>
<div id="map" style="width:500px;height:500px;"></div>

<script>
var mapOptions = {
    center: new N.LatLng(37.557259, 127.151538),
    zoom: 10
};

var map = new naver.maps.Map('map', mapOptions);

var markerOptions = {
    position: new N.LatLng(37.557259, 127.151538),
    map: map,
    title: '고래힐'
};
var marker = new naver.maps.Marker(markerOptions);

var markerListener = naver.maps.Event.addListener(marker, 'click', function() {
    map.setZoom(11);
    map.setCenter(marker.getPosition());

    naver.maps.Event.removeListener(listener);
});

var mapElement = map.getElement();

var listener = naver.maps.Event.addDOMListener(mapElement, 'click', function(e) {
    console.log(e);
});

</script>
</body>
</html>