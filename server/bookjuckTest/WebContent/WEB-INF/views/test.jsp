<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>북적북적</title>

	<%@include file="/WEB-INF/views/inc/asset.jsp" %>
	
	<!-- slick -->
	<link rel="stylesheet" type="text/css" href="http://kenwheeler.github.io/slick/slick/slick.css" />
	<link rel="stylesheet" type="text/css" href="http://kenwheeler.github.io/slick/slick/slick-theme.css" />
	<script src="http://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g=" crossorigin="anonymous"></script>
	<script type="text/javascript" src="http://kenwheeler.github.io/slick/slick/slick.min.js"></script>
	
<style>

    .btns {
        margin-top:70px;
        margin-left:auto;
        margin-right:auto;
        margin-bottom:-50px;
        text-align:center;
    }

    .btns > input {
        margin-left:auto;
        margin-right:auto;
        width:220px;
    }

    #booktable {
        margin:70px auto;
        border:1px solid #ccc;
    }

    .tblitem {
        width:220px;
        text-align:center;
        padding:20px;
    }

    #bestmonth {
        margin:70px auto;
        text-align:center;
    }

    #bestmonthtitle {
        border-top:1px dashed #ccc;
        text-align:center;
        width:500px;
        padding-top:50px;
        margin-left:auto;
        margin-right:auto;

    }

    .monthitem {
        width:160px;
    }

    /* 슬라이더 */

    .slick-items {
        width:60%;
        margin:70px auto;
    }

    .slick-item {
        text-align:center;
    }

    .slick-item > img {
        margin-left:auto;
        margin-right:auto;
    }

    /*post slider*/

    .post-slider{
        width:70%;
        margin:px auto;
        position:relative;
    }
    .post-slider .silder-title{
        text-align:center;
        margin:30px auto;
    }
    .post-slider .next{
        position:absolute;
        top:50%;
        right:30px;
        font-size:2em;
        color:gray;
        cursor: pointer;
    }
    .post-slider .prev{
        position:absolute;
        top:50%;
        left:30px;
        font-size:2em;
        color:gray;
        cursor: pointer;
    }
    .post-slider .post-wrapper{
        width:84%;
        height:350px;
        margin:0px auto;
        overflow: hidden;
        padding:10px 0px 10px 0px;
    }
    .post-slider .post-wrapper .post{
        width:300px;
        height:300px;
        margin:0px 10px;
        display:inline-block;
        background:white;
        border-radius: 5px;
    }
    .post-slider .post-wrapper .post .post-info{
        font-size:15px;
        height:30%;
        padding-left:10px;
    }
    .post-slider .post-wrapper .post .slider-image{
        width:100%;
        height:175px;
        border-top-left-radius:5px;
        border-top-right-radius:5px;
    }

    .slick-dots li button:before {
        color:#F4A259;
    }

    .slick-dots li.slick-active button:before {
        color:#BC4B51;
    }

</style>

</head>
<body>
    <div class="container">
    
       	<!-- header.jsp -->
		<%@include file="/WEB-INF/views/inc/header.jsp" %>

        <!-- 도서 회전 영역 -->
        <section>
            <div class="slick-items">
                <div class="slick-item">
                    <img src="image/달러구트 꿈 백화점.png" class="book-sm">
                    <h6>달러구트 꿈 백화점</h6>
                    <p>여기는 잠들어야만 입장할 수 있는 ‘달러구트 꿈 백화점’입니다</p>
                </div>
        
                <div class="slick-item">
                    <img src="image/어떻게 살 것인가.png" class="book-sm">
                    <h6>어떻게 살 것인가</h6>
                    <p>멘붕 사회에 해독제로 쓰일 책</p>
                </div>
        
                <div class="slick-item">
                    <img src="image/유럽 도시 기행 1.png" class="book-sm">
                    <h6>유럽 도시 기행 1</h6>
                    <p>‘인생은 너무 짧은 여행’이란 말에 끌려 시작한 유럽 탐사</p>
                </div>
        
                <div class="slick-item">
                    <img src="image/일중독자의 여행.png" class="book-sm">
                    <h6>일중독자의 여행</h6>
                    <p>형과 함께한 특별한 길</p>
                </div>
        
                <div class="slick-item">
                    <img src="image/일인칭 단수.png" class="book-sm">
                    <h6>일인칭 단수</h6>
                    <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                </div>
            </div>

        </section>

        <section>
            <div class="btns">
                <input type="button" class="btn btn-default btn-lg btn-general" value="추천도서">
                <input type="button" class="btn btn-default btn-lg btn-general" value="베스트도서">
                <input type="button" class="btn btn-default btn-lg btn-general" value="화제의 신간">
            </div>

            <table id="booktable">
                <tr>
                    <td>
                        <div class="tblitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="tblitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="tblitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="tblitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="tblitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="tblitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                </tr>
            </table>
        </section>

        <section>
            <h3 id="bestmonthtitle">월간베스트</h3>
            <table id="bestmonth">
                <tr>
                    <td>
                        <div class="monthitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="monthitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="monthitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="monthitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                    <td>
                        <div class="monthitem">
                            <img src="image/일인칭 단수.png" class="book-sm">
                            <h6>일인칭 단수</h6>
                            <p>하루키 월드를 구성하는 다채로운 요소들을 한데 만나볼 수 있는 단편집</p>
                        </div>
                    </td>
                </tr>
            </table>
        </section>
        
       	<!-- footer.jsp -->
		<%@include file="/WEB-INF/views/inc/footer.jsp" %>
    </div>

    <!-- 북적이에게 문의하기 -->

    <div id="bookjeok">
        <label for="character">
        <img src="image/bookjeok/chatbtn.png" id="chatbtn">
        <h6>북적이에게</h6>
        <h6>문의하기</h6>
        </label>
    </div>

    <!-- top -->
    <div id="top">
        <span class="glyphicon glyphicon-chevron-up"></span>
        <h6>TOP</h6>
    </div>
    
    <!-- 국내도서 중분류 -->
    

    <!-- 스크립트 영역 -->
    <!-- 도서 회전 -->
    <script type="text/javascript">

	    $(document).ready(function () {
	        $('.slick-items').slick({
	            autoplay : true,
	            dots: true,
	            speed : 300 /* 이미지가 슬라이딩시 걸리는 시간 */,
	            infinite: true,
	            autoplaySpeed: 3000 /* 이미지가 다른 이미지로 넘어 갈때의 텀 */,
	            arrows: true,
	            slidesToShow: 3,
	            slidesToScroll: 1,
	            fade: false
	        });
	    });

	</script>
	
	<!-- header JavaScript -->
	<script src="/bj/js/header.js"></script>

</body>
</html>