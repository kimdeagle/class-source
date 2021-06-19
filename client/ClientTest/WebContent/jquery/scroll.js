//scroll.js

//1. 태그를 만든다.
// - <div id="bar"></div>
// - <body>의 첫번째 자식

//2. CSS 적용한다.
$(document).ready(function() {
    var bar = $("<div id='bar'></div>").css({
        width: 0,
        height: "5px",
        "background-color": "cornflowerblue",
        position: "fixed",
        left: 0,
        top: 0
    });

    $("body").prepend(bar);

    //3. 이벤트 매핑
    $(document).scroll(function() {
        
        var x = $(document).scrollTop() * 100 / ($(document).outerHeight() - $(window).outerHeight());
    
        bar.css("width", x+"%");
    });

});

