package util;

import javax.servlet.http.HttpSession;

public class Auth {
	
	public static int isAuth(HttpSession session) {
		String employeeId = (String)session.getAttribute("employeeId");
		String adminId = (String)session.getAttribute("adminId");
		System.out.println(adminId);
		System.out.println(employeeId);
		if(adminId != null && !adminId.equals(Constants.TEMP_ADMIN)) {
			return Constants.AUTH_ADMIN;
		}else {
			session.setAttribute("adminId", Constants.TEMP_ADMIN);
		}
		if(employeeId != null && !employeeId.equals(Constants.TEMP_EMP)) {
			return Constants.AUTH_EMP;
		}else {
			session.setAttribute("employeeId", Constants.TEMP_EMP);
		}
		return Constants.NO_AUTH;
	}
}
