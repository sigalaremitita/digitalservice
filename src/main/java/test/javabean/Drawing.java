package test.javabean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Drawing {
	@RequestMapping("/add")
	 public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("test");
	      Integer i=Integer.parseInt(request.getParameter("t1"));
	      Integer j=Integer.parseInt(request.getParameter("t2"));
	       Integer k= i+j;
	       
	       ModelAndView mv=new ModelAndView();
	       mv.setViewName("display");
	       mv.addObject("result",k);
	      return mv;
	 }
	
	@RequestMapping("/form")
	public String vewadd() {
		
		return "index";
	}
	
	
}
