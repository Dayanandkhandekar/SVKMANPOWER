package com.management.svk;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order()
public class RequestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response1 = (HttpServletResponse) response;
		HttpServletRequest request1 = (HttpServletRequest) request;

		response1.setHeader("Access-Control-Allow-Origin", "*");
		response1.setHeader("Access-Control-Allow-Methods", "*");
		response1.setHeader("Access-Control-Allow-Headers", "*");
		response1.setHeader("Access-Control-Allow-Credentials", "*");
		response1.setHeader("Access-Control-Max-Age", "3600");
		chain.doFilter(request, response);
		if (!(request1.getMethod().equalsIgnoreCase("OPTIONS"))) {
			try {
				chain.doFilter(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Pre-flight");
			response1.setHeader("Access-Control-Allow-Methods", "POST,GET,DELETE,PUT,PATCH");
			response1.setHeader("Access-Control-Max-Age", "3600");
			response1.setHeader("Access-Control-Allow-Headers", "authorization, content-type,"
					+ "access-control-request-headers,access-control-request-method,accept,origin,authorization,x-requested-with");
			response1.setStatus(HttpServletResponse.SC_OK);
		}

	}
}
