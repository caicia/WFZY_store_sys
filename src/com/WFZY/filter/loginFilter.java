package com.WFZY.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.WFZY.pojo.Users;

/**
 * Servlet Filter implementation class loginFilter
 */

public class loginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public loginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		// pass the request along the filter chain
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession(true);
		resp.setContentType("text/html;  charset=utf-8");
		PrintWriter out = resp.getWriter();
		String request_uri = req.getRequestURI();
		String ctxPath = req.getContextPath();
		String uri = request_uri.substring(ctxPath.length());
		if (uri.contains("login.jsp")) {
			chain.doFilter(request, response);
		} else {
			if (session.getAttribute("loginUser") != null) {
				chain.doFilter(request, response);
			} else {
				out.println("您没有登录，请先登录！3秒后回到登录页面。");
				resp.setHeader("refresh", "3;url=" + ctxPath + "/login.jsp");
				return;
			}
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
