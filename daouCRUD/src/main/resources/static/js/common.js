const BASE_URL = "http://localhost:8080";
const BOARD_URL = BASE_URL+"/board";

var goTop = function(username){
	location.href=BOARD_URL+"?username="+username;
}