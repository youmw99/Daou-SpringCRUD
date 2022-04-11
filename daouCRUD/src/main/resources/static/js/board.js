var boardInsert = function(usercd){
	const INSERT_URL = "/insert";
	var board_content_txt = document.getElementById("newboarditem").value;
	fetch(BOARD_URL+INSERT_URL,{
		method:"POST",
		headers:{"Content-Type":"application/json"},
		body:JSON.stringify({
			usercd:usercd,
			board_content_txt:board_content_txt,
		}),
	}).then((response)=>{
		alert("게시물 등록 완료");
		location.reload();
	})
}