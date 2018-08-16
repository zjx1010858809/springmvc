package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import entity.student;
@Controller
public class Test_Controller {
	@RequestMapping("index")
	public ModelAndView exe(String name) {
		ModelAndView mv=new ModelAndView("index");
		student stu=new student();
		stu.setName(name);
		mv.addObject("stu", stu);
		System.out.println("接收到请求");
	return mv;
	}
	@RequestMapping("aaaa")
	public ModelAndView aaaa(student stu) {
		ModelAndView mv=new ModelAndView("index");
		mv.addObject("stu",stu);
		System.out.println("接收到请求");
	return mv;
	}
	
	@RequestMapping("iii")
	public String eee() {
		
		System.out.println("接收到");
	return "index";
	}

}
