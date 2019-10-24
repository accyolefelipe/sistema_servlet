package br.unipe.web.java.boot.SecurityFilters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/cliente")
public class ClienteSecurityFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Passando pelo filtro Cliente");

        String phonne = request.getParameter("phonne");
        if (phonne == null) {
            request.setAttribute("phonne", "88997755");
        }
        chain.doFilter(request, response);
    }


    public void destroy() {

    }
}
