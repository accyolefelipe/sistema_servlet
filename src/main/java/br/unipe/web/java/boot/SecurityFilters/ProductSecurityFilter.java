package br.unipe.web.java.boot.SecurityFilters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/product")
public class ProductSecurityFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Passando pelo novo filtro Product");

        String description = request.getParameter("description");
        if (description == null) {
            request.setAttribute("description", "new and expensive");
        }
        chain.doFilter(request, response);

    }

    public void destroy() {

    }

}
