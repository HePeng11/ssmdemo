package com.jxcdemo.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jxcdemo.entitys.User;

/**
 * 
 * 拦截器，用于拦截前台的登录 要在spring-mvc中配置拦截器<mvc:interceptor> return false表示拦截，不向下执行
 */
public class LoginInterceptor implements HandlerInterceptor {
	// 首先会执行的方法
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("ServletPath:" + request.getServletPath());
		System.out.println("RequestURI:" + request.getRequestURI());
		String requestURI = request.getRequestURI();
		String uri = requestURI.substring(requestURI.lastIndexOf("/"));
		if (uri.startsWith("/login") ) {
			System.out.println("请求uri是以特定的开头");
			return true;
		}
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			String loginUrl = "/views/login.jsp";
			response.sendRedirect(request.getContextPath() + loginUrl);
			return false;
		} else {
			System.out.println("user：" + user);
			return true;
		}


	}

	// 返回ModelAndView之前执行的方法，面向切面编程中的体现，已经进入了controller
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("进入了postHandle");

	}

	// 执行Handle完成之后执行的方法
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("进入了afterCompletion");
	}

}
