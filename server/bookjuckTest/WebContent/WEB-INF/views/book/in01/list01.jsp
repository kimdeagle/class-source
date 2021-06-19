<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>북적북적</title>

	<!-- CSS, Bootstrap, JavaScript -->
	<%@include file="/WEB-INF/views/inc/asset.jsp" %>
	
	<!-- sidemenu.css -->
	<link rel="stylesheet" href="/bj/css/category.css">
	
	<style>
	
		/* 이미지 셀 */
		table td:nth-child(1) {
			height: 200px;
		}
		
		/* 텍스트 셀 */
		table td:nth-child(2) {
			width: 500px;
			height: 200px;
		}
		
		/* 텍스트 margin */
		table td:nth-child(2) div {
			margin: 5px 15px;
		}
		
		/* 수량 및 버튼 셀 */
		table td:nth-child(3) {
			width: 200px;
			height: 200px;
			text-align: right;
		}
	
		/* 이미지 */
		table td .image {
			height: 200px;
		}
		
		/* 텍스트 > 제목 */
		table td .title {
			font-size: 2em;
		}
		
		table td .info {
			
		}
		
		table td .subinfo {
		
		}
		
		/* 도서 소개 */
		table td .intro {
			height: 45px;
			overflow: hidden;
		}
		
		table td .price {
		
		}
		
		/* 텍스트 > 판매가 */
		table td .price span {
			font-size: 1.2em;
		}
		
		/* 텍스트 > 판매가격 */
		table td .price strong {
			color: red;
			font-size: 1.5em;
		}
		
		/* 수량 > + , - 버튼 */
		table td .amount input[type=button] {
			outline: none !important;
		}
		
		/* 수량 > 텍스트박스 */
		table td .amount input[type=text] {
			width: 50px;
			height: 30px;
			text-align: right;
		}
		
		/* 버튼 */
		table td .btns button {
			display: inline-block;
			width: 57%;
			margin-top: 7px;
		}
	
	</style>

</head>
<body>
    <div class="container">
    
       	<!-- header.jsp -->
		<%@include file="/WEB-INF/views/inc/header.jsp" %>

		<!-- category.jsp -->
        <%@include file="/WEB-INF/views/inc/category.jsp" %>
        
		<!-- section -->
		<section class="contentsection">
        <h6>국내도서 > 소설 > 한국소설</h6>
        <table id="tblbooklist" class="">
        	<tbody>
        		<tr>
        			<td>
        				<img src="/bj/image/바이러스 X.png" id="image1" class="image">
        			</td>
        			<td>
        				<div id="title1" class="title">대체불가 라틴아메리카</div>
        				<div id="info1" class="info">장재준 | 의미와재미</div>
        				<div id="subinfo1" class="subinfo">2021년 1월 20일 | 292쪽</div>
        				<div id="intro1" class="intro">다양성과 혼종성, 식민성과 근대성이 공존하는 곳.<br />잉카, 마야, 아스텍 문명을 품은 땅에서 이민족의 오랜 야만을 인내한 사람들.</div>
        				<div id="price1" class="price"><s>정가 17,000원</s>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>판매가 </span><strong>15,300</strong>원</div>
        			</td>
        			<td>
        				<div id="amount1" class="form-inline amount">
        					<input type="button" value="-" id="minus1" class="btn btn-default btn-sm">
        					<input type="text" value="1" id="cnt1" class="form-control">
        					<input type="button" value="+" id="plus1" class="btn btn-default btn-sm">
        				</div>
        				<div id="btns1" class="btns">
	        				<button id="cart1" class="btn btn-success btn-lg cart">장바구니</button>
	        				<button id="buy1" class="btn btn-primary btn-lg buy">바로구매</button>
	        				<button id="baro1" class="btn btn-warning btn-lg baro">바로드림</button>
        				</div>
        			</td>
        		</tr>        		
        	</tbody>
        </table>
        <hr>
        
        </section>
        
       	<!-- footer.jsp -->
		<%@include file="/WEB-INF/views/inc/footer.jsp" %>
		
		
    </div>

   	<!-- chat.jsp -->
	<%@include file="/WEB-INF/views/inc/chat.jsp" %>
	
	<!-- top.jsp -->
	<%@include file="/WEB-INF/views/inc/top.jsp" %>


	<!-- header JavaScript -->
	<script src="/bj/js/header.js"></script>

    <script>
		
	</script>

</body>
</html>