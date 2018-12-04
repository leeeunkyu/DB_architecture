function selectEmployeeList(index){
	$.ajax({
		  url: "selectEmployeeList.do",
		  method: "GET",
		  data: { index : index },
		  contentType: "application/json",
		  dataType : "json"
	})
	.done(function( doneData ) {
		for(var i = 0; i < doneData.length; i++) {
			$('#index'+i+' .empId').html(doneData[i].empId);
			$('#index'+i+' .empNm').html(doneData[i].empNm);
			$('#index'+i+' .empEdulevel').html(doneData[i].empEdulevel);
			$('#index'+i+' .empExe').html(doneData[i].empExe);
			$('#index'+i+' .positionCode').html(doneData[i].positionCode);
		}
	})
	.fail(function(faileData) {
	})
	.always(function(alwaysData) {
	});
}

function nextPage(i) {
	var index = parseInt(i)
	selectEmployeeList(index+1);
	$('#firstPage').html(index+1);
	$('#secondPage').html(index+2);
	$('#thirdPage').html(index+3);
}

function prePage(i) {
	var index = parseInt(i)
	if(index >= 4) {
		selectEmployeeList(index-3);
		$('#firstPage').html(index-3);
		$('#secondPage').html(index-2);
		$('#thirdPage').html(index-1);
		
	}
}