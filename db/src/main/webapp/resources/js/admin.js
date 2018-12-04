$(function(){
	var nameCnt = 0;
	setName = setInterval(function() {
			var tempName = String.fromCharCode(
					nameCnt > 10 ? 68 : getRandomIntInclusive(65,90),
					nameCnt > 13 ? 66 : getRandomIntInclusive(65,90),
					32,
					nameCnt > 19 ? 83 : getRandomIntInclusive(65,90),
					nameCnt > 22 ? 85 : getRandomIntInclusive(65,90),
					nameCnt > 27 ? 76 : getRandomIntInclusive(65,90),
					32,
					nameCnt > 28 ? 65 : getRandomIntInclusive(65,90),
					nameCnt > 31 ? 68 : getRandomIntInclusive(65,90),
					nameCnt > 34 ? 77 : getRandomIntInclusive(65,90),
					nameCnt > 16 ? 73 : getRandomIntInclusive(65,90),
					nameCnt > 16 ? 78 : getRandomIntInclusive(65,90))
			$("#adminLogo").html("<h1>"+tempName+"</h1>");
			nameCnt++;
			if(nameCnt > 35) {
				   clearInterval(setName);
			}
	}, 100);
	
});

//65~90
function getRandomIntInclusive(min, max) {
	  return Math.floor(Math.random() * (max - min + 1)) + min;
}
