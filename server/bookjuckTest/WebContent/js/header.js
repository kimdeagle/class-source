
/* 국내도서 중분류 */
$("#internalbook").mouseenter(function() {
	var p = $("#internalbook").offset();	
	$("#internalMCategory").css("left", p.left);
	$("#internalMCategory").css("top", p.top + 50);
	$("#internalMCategory").show();
});

$("#internalbook").mouseleave(function() {
	$("#internalMCategory").hide();
});

$("#internalMCategory").mouseenter(function() {
	$("#internalMCategory").show();
});

$("#internalMCategory").mouseleave(function() {
	$("#internalMCategory").hide();
});

/* 해외도서 중분류 */
$("#externalbook").mouseenter(function() {
	var p = $("#externalbook").offset();	
	$("#externalMCategory").css("left", p.left);
	$("#externalMCategory").css("top", p.top + 50);
	$("#externalMCategory").show();
});

$("#externalbook").mouseleave(function() {
	$("#externalMCategory").hide();
});

$("#externalMCategory").mouseenter(function() {
	$("#externalMCategory").show();
});

$("#externalMCategory").mouseleave(function() {
	$("#externalMCategory").hide();
});
