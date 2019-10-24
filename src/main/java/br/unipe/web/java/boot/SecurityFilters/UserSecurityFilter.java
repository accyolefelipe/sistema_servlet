package br.unipe.web.java.boot.SecurityFilters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/user")
public class UserSecurityFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("passando pelo filtro User");

        String adress = request.getParameter("adress");
        if (adress == null) {
            request.setAttribute("adress", "avenida das alamedas - 857");
        }
        chain.doFilter(request, response);
    }


    public void destroy() {

    }
}
