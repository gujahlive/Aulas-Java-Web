package br.com.exemplo.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class filtroPaginas
 */
@WebFilter("/filtroPaginas")
public class filtroPaginas implements Filter {

    /**
     * Default constructor. 
     */
    public filtroPaginas() {
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
	     
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
	      String url = httpServletRequest .getRequestURI();
	      HttpSession sessao = httpServletRequest .getSession();
	      if(sessao.getAttribute("userAtutenticado")!=null || url.lastIndexOf("login.jsp")>-1 || url.lastIndexOf("autenticador") >-1) {
	    	  chain.doFilter(request, response);
	    	  
	      }else {
	    	  ((HttpServletResponse) response).sendRedirect("login.jsp");
	    	  
	      }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
