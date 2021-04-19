package com.te.sprmvc.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.te.sprmvc.beans.UserBean;

@Controller
public class SpringMvcControllers {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		
		
		ModelAndView modelandview=new ModelAndView();
		 modelandview.setViewName("/WEB-INF/views/homePage.jsp");
		return modelandview;
		
		
	}
	
	@RequestMapping(path="/about", method=RequestMethod.GET)
	public ModelAndView getAboutPage() {
		
		ModelAndView obj=new ModelAndView();
		obj.setViewName("/WEB-INF/views/about.jsp");
		return obj;
		
	}
	
	@RequestMapping(path="/search", method=RequestMethod.GET)
	public ModelAndView getData(ModelAndView modelview,HttpServletRequest request) {
		
		String name=request.getParameter("name");
		
		 
		//modelview.addObject("username", name);
		
		request.setAttribute("username",name);
		modelview.setViewName("newHome");
		
		
		return modelview;
		
	}
	@GetMapping(path="/login")
	public String getForm() {
		return "login";
	}
	
	
     @PostMapping(path="/login")
	public String getUserDetails(HttpServletRequest request,ModelMap modelMap) {
		String name=request.getParameter("user");
		int password=Integer.parseInt(request.getParameter("pwd"));
		modelMap.addAttribute("name", name); 
		modelMap.addAttribute("pwd", password);
		
		return "userDetails";
		
		
	}
     @PostMapping(path="/login1")
     public String getFormData(ModelMap modelmap,int pwd,String user) {
    	 modelmap.addAttribute("name",user);
    	 modelmap.addAttribute("pwd",pwd);
		return "userDetails";
    	 
     }
     
     @PostMapping(path="/login2")
     public String getFormDataFromBean(UserBean userBean,ModelMap modelmap) {
    	 modelmap.addAttribute("name",userBean.getUser());
    	 modelmap.addAttribute("pwd",userBean.getPwd());
		return "userDetails";
     }
     
     @PostMapping(path="/login3")
     public String getFormDataFromBean(ModelMap modelmap,
    		 @RequestParam(name="") String user,
    		 @RequestParam(name="pwd") int password) {
    	 modelmap.addAttribute("name",user);
    	 modelmap.addAttribute("pwd",password);
		return "userDetails";
     }
     
     
    	 
     
	
	

}
