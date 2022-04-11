const BOARDDETAIL_URL = BASE_URL+"/boarddetail";
const referrer = document.referrer;

var boardUpdate = function(boardid){
	const UPDATE_URL = "/update";
	var board_content_txt = document.getElementById("boardcontent").value;
	fetch(BOARD_URL+UPDATE_URL,{
		method:"POST",
		headers:{"Content-Type":"application/json"},
		body:JSON.stringify({
			boardid:boardid,
			board_content_txt:board_content_txt,
		}),
	}).then((response)=>{
		alert("게시물 수정 완료");
		location.reload();
	})
}

var boardDelete = function(boardid){
	const DELETE_URL = "/delete";
	fetch(BOARD_URL+DELETE_URL,{
		method:"POST",
		headers:{"Content-Type":"application/json"},
		body:JSON.stringify({
			boardid:boardid,
		}),
	}).then((response)=>{
		alert("게시물 삭제 완료");
		location.href = referrer;
	})
}