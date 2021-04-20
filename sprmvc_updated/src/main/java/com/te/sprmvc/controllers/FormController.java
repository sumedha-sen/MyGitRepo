package com.te.sprmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.sprmvc.beans.EmployeeBean;

import com.te.sprmvc.dao.EmployeeDao;

@Controller
public class FormController {
	
	@Autowired
	private EmployeeDao dao;
	
	@GetMapping("/login0")
	public String getLoginForm() {
		return "loginForm";
	}
	
	
	@GetMapping("/searchForm")
	public String getSearchForm(ModelMap map,HttpSession session) {
		if(session.getAttribute("emp")!=null) {
			return "searchForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}
		
	}
	
	@GetMapping("/showdelete")
	public String getDeleteForm(ModelMap map,HttpSession session) {
		if(session.getAttribute("emp")!=null) {
			return "deleteForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}
		
	}
	
	@GetMapping("/delete")
	public String deleteform(int id,ModelMap map,@SessionAttribute(name="emp", required=false) EmployeeBean employeebean) {
		if(employeebean!=null) {
			boolean deletedata=dao.deleteEmpData(id);
			 if(deletedata) {
				 map.addAttribute("msg", "Data deleted successfully" );
				 
			 }else {
				 map.addAttribute("msg",  "Data not found for" + id);
			 }
			 return "deleteForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}// end of getDelete form
		
	}//end of Controller
	
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap map) {
		session.invalidate();
		map.addAttribute("msg", "Log Out Successful");
		return "loginForm";
		
	}
	
	@GetMapping("/search")
	public String searchEmp(int id,ModelMap map,@SessionAttribute(name="emp", required=false) EmployeeBean employeebean) {
		if(employeebean!=null) {
			 EmployeeBean employeebean2=dao.getEmployee(id);
			 if(employeebean2!=null) {
				 map.addAttribute("data",  employeebean2);
				 
			 }else {
				 map.addAttribute("errMsg",  "Data not found for" +id);
			 }
			 return "searchForm";
			
		}else {
			map.addAttribute("errMsg","pls login first");
			return "loginForm";
			
		}// end of getSearch form
		
	}//end of Controller
	
	@PostMapping("/loginform")
	public String getAuthenticate(int id,String pwd,HttpServletRequest request,ModelMap map) {
		EmployeeBean employeebean = ((EmployeeDao) dao).authenticate(id, pwd);
		
		if(employeebean!=null) {
			HttpSession session=request.getSession(true);
			session.setAttribute("emp", employeebean);
			return "homePage";
			
			
		}
		
		else {
			map.addAttribute("errMsg","Invalid Credentials");
			return "loginForm";
		}
		
	}

}
