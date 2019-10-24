package br.unipe.web.java.boot.SecurityFilters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/fujioka")
public class SegurancaFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Passando pelo Filtro");

        String nome = request.getParameter("nome");
        if (nome == null) {
            request.setAttribute("nome", "Rodrigo Fujioka");
        }
        chain.doFilter(request, response);

    }

    public void destroy() {

    }


}