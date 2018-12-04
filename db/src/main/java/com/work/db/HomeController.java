package com.work.db;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.work.dto.Employee;
import com.work.service.EmployeeService;

import util.Auth;
import util.Constants;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private ModelAndView mv;
	
	@Autowired
	private EmployeeService employeeService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public ModelAndView home(HttpSession session) {
		int authCode = Auth.isAuth(session);
		
		mv = new ModelAndView("home");
		mv.addObject("authCode", authCode);
		mv.addObject("employeeList", selectEmployeeList(1));
		
		return mv;
	}
	
	@RequestMapping(value = "/signUp.do", method = RequestMethod.POST)
	public ModelAndView signUp(HttpSession session, Employee employee) {
		int authCode = Auth.isAuth(session);

		mv = new ModelAndView("home");
		System.out.println(employee);
		employeeService.signUp(employee);
		mv.addObject("authCode", authCode);

		return mv;
	}
	
	@RequestMapping(value = "/signIn.do", method = RequestMethod.POST)
	@ResponseBody
	public int signIn(HttpSession session, Employee employee) {
		int result = employeeService.signIn(employee);
		session.setAttribute("employeeId", employee.getEmpId());
		return result;
	}
	
	@RequestMapping(value = "/selectEmployeeList.do", method = RequestMethod.GET)
	@ResponseBody
	public ArrayList<Employee> selectEmployee(HttpSession session, int index) {
		int authCode = Auth.isAuth(session);
		
		ArrayList<Employee> employeesList;
		if(authCode == Constants.AUTH_ADMIN) {
			employeesList = (ArrayList<Employee>) employeeService.selectEmployeeList(index);			
		}
		else {
			employeesList = new ArrayList<Employee>();
		}
		return employeesList;
	}
	
	@RequestMapping(value = "/admin.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView admin() {
		mv = new ModelAndView("admin");
		return mv;
	}
	
	@RequestMapping(value = "/signInAdmin.do", method = RequestMethod.POST)
	public ModelAndView signInAdmin(HttpSession session, String id, String password) {
		mv = new ModelAndView("home");
		if("master".equals(id) && "12345".equals(password)) {
			session.setAttribute("adminId", id);			

			int authCode = Auth.isAuth(session);

			mv.addObject("employeeList", selectEmployeeList(1));
			mv.addObject("authCode", authCode);
		}
		return mv;
	}
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.POST)
	public ModelAndView logout(HttpSession session) {
		mv = new ModelAndView("home");
		session.invalidate();
		return mv;
	}
	
	
	public ArrayList<Employee> selectEmployeeList(int index) {
		ArrayList<Employee> employeesList = (ArrayList<Employee>) employeeService.selectEmployeeList(1);
		if(employeesList == null)
			employeesList = new ArrayList<>();
		return employeesList;
	}
}
