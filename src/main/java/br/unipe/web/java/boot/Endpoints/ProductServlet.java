package br.unipe.web.java.boot.Endpoints;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = { "/product" })
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String parametro = req.getParameter("description");
        if (parametro == null)
            parametro = req.getAttribute("description").toString();
        String name = req.getParameter("name");
        ServletOutputStream out = resp.getOutputStream();
        String saida = "Product: " + parametro + " " + name;
        out.write(saida.getBytes());
        out.flush();
        out.close();
    }

}
