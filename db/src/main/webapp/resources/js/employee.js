function signIn(){
	$.ajax({
        type: 'POST',
        url: "signIn.do",
        data: {
            "empId": $('#empId').val(),
            "pass": $('#pass').val()          
        },
        success: function(r) {
        	console.log(r);
        	if(r == '3') {
            	alert("로그인에 성공했습니다");		 
            	 $('#contact').hide();
            	 $('#about').hide();
            	 $('#hello').html('만나서 반가웡');
            	 $('#logout').show();


        	}else {
            	alert("아이디 확인 부탁yo");		        		        		
        	}
        	
        }
    });	
}