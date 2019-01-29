<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  
    <meta charset="UTF-8">
    <title>Line_Controls_Chart</title>

    <meta http-equiv="refresh" content="300">
    <!-- jQuery -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    <!-- google charts -->
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script src="https://www.google.com/jsapi"></script>
  </head>
  <body>
    <div style="text-align:right; width: 1100px;">
    	<font size=1>
    		<font color=blue>ex1</font>, 
    		<font color=red>ex2</font>, 
    		<font color=orange>ex3</font>, 
    		<font color=green>ex4</font>
    	</font>
    </div>
    
    <div style="text-align:right; width: 1100px;">
        <font size=2>update : <span id="clock"></span></font><br>
    </div>

    <div id="Line_Controls_Chart">
        <!-- 라인 차트 생성할 영역 -->
        <div id="lineChartArea" style="padding:0px 10px 0px 10px;"></div>
        <!-- 컨트롤바를 생성할 영역 -->
  		<div id="controlsArea" style="padding:0px 10px 0px 10px;"></div>
    </div>
  </body>
  
  	<script src="resources/chart/mychart.js"></script>
  	
</html>