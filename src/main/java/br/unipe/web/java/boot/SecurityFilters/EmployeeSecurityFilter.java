package br.unipe.web.java.boot.SecurityFilters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/employee")
public class EmployeeSecurityFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Passando pelo filtro Employee");

        String function = request.getParameter("function");
        if (function == null) {
            request.setAttribute("function", "analista de sistemas - junior");
        }
        chain.doFilter(request, response);
    }


    public void destroy() {

    }
}
