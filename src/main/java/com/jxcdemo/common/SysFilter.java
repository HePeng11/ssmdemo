package com.jxcdemo.common;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.jxcdemo.business.IUserBusiness;
import com.jxcdemo.entitys.User;

/**
 * @Description:filter的三种典型应用： 1、可以在filter中根据条件决定是否调用chain.doFilter(request,
 *                             response)方法， 即是否让目标资源执行
 *                             2、在让目标资源执行之前，可以对request\response作预处理，再让目标资源执行
 *                             3、在目标资源执行之后，可以捕获目标资源的执行结果，从而实现一些特殊的功能
 * @author:
 * @date:
 */
public class SysFilter implements Filter {
	@Autowired
	IUserBusiness iUserBusiness;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("----过滤器初始化----");
	}

	@Override
	public void doFilter(ServletRequest irequest, ServletResponse iresponse, FilterChain chain)
			throws IOException, ServletException {
		irequest.setCharacterEncoding("UTF-8");
		iresponse.setCharacterEncoding("UTF-8");
		iresponse.setContentType("text/html;charset=UTF-8");
		HttpServletRequest request = (HttpServletRequest) irequest;

		System.out.println("SysFilter：url--》" + request.getRequestURI());
		String targetURL = request.getServletPath();
		String[] noAuthMaps = new String[] { "/views/login.jsp", "/login" };
		if (Arrays.asList(noAuthMaps).contains(targetURL) || targetURL.endsWith(".jpg")) {
			System.out.println("SysFilter：url--》允许请求" + request.getRequestURI());
			chain.doFilter(irequest, iresponse);
			return;
		} else {
			HttpSession session = request.getSession();
			Object user = session.getAttribute("user");
			if(user==null) {
				//如果存在cookie则转发请求到login或index
//				Cookie cookie1 = Utils.getCookieByName(request, "loginName");
//				Cookie cookie2 = Utils.getCookieByName(request, "password");
//				HttpServletResponse response = (HttpServletResponse) iresponse;
//				response.sendRedirect(request.getContextPath() + "/views/login.jsp");
			}
			if (user != null) {
				System.out.println("SysFilter：url--》允许请求" + request.getRequestURI());
				chain.doFilter(irequest, iresponse);
				return;
			}
			else
			{
				HttpServletResponse response = (HttpServletResponse) iresponse;
				System.out.println("SysFilter：url--》拒绝请求" + request.getRequestURI());
				response.sendRedirect(request.getContextPath() + "/views/login.jsp");
				return;
			}
		}

	}

	@Override
	public void destroy() {
		System.out.println("----过滤器销毁----");
	}

}