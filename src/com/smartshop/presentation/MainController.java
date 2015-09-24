package com.smartshop.presentation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.smartshop.dataaccess.DataAccessImpl;
import com.smartshop.pojo.Item;
import com.smartshop.pojo.User;


@Controller
public class MainController {

	@RequestMapping(value=("/register.spring"), method=RequestMethod.POST)
	public ModelAndView get(HttpServletRequest request, 
			HttpSession session,
			@ModelAttribute("User")User user){

		WebApplicationContext context =RequestContextUtils.getWebApplicationContext(request);
		DataAccessImpl obj = (DataAccessImpl)context.getBean("daoImp");

		User u = obj.insertUser(user);
		System.out.println(u);
		Map<String, Object> map = new HashMap<String, Object>();
		if(u != null){
			session = request.getSession();
			session.setAttribute("user", u);
			System.out.println(getClass().getSimpleName()+": "+session.getAttribute("user"));
			map.put("user", u);
			List<Item> items = obj.getItems();
			map.put("items", items);
			return new ModelAndView("/WEB-INF/home", "key", map);
		}
		return new ModelAndView("Login_Signup", "key", map);
	}	

	@RequestMapping(value=("/login.spring"), method=RequestMethod.POST)
	public ModelAndView get(HttpServletRequest request, 
			HttpSession session,
			@RequestParam("userName")String userName, 
			@RequestParam("password")String password){

		WebApplicationContext context =RequestContextUtils.getWebApplicationContext(request);
		DataAccessImpl fetchObj = (DataAccessImpl)context.getBean("daoImp");
		Map<String, Object> map = new HashMap<String, Object>();
		if(fetchObj.checkLogin(userName, password)){
			User user = fetchObj.getUserByEmailId(userName);
			session = request.getSession();
			session.setAttribute("user", user);
			map.put("user", user);
			List<Item> items = fetchObj.getItems();
				map.put("items", items);
			return new ModelAndView("/WEB-INF/home", "key", map);
		}
		return new ModelAndView("Login_Signup", "key", map);
	}	
	
	@RequestMapping(value=("/index.spring"), method=RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, 
			HttpSession session,@RequestParam("page")String userName){

		WebApplicationContext context =RequestContextUtils.getWebApplicationContext(request);
		DataAccessImpl fetchObj = (DataAccessImpl)context.getBean("daoImp");
		fetchObj.insertDummyItems();
		List<Item> items = fetchObj.getItems();
		Map<String, Object> map = new HashMap<String, Object>();
			map.put("items", items);
		return new ModelAndView("/index", "key", map);
	}	
}
