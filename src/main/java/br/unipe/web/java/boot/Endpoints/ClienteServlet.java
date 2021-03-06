package br.unipe.web.java.boot.Endpoints;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ClienteServlet", urlPatterns = { "/cliente" })
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String parametro = req.getParameter("phonne");
        if (parametro == null)
            parametro = req.getAttribute("phonne").toString();
        String name = req.getParameter("name");
        ServletOutputStream out = resp.getOutputStream();
        String saida = "Cliente: " + parametro + " " + name;
        out.write(saida.getBytes());
        out.flush();
        out.close();
    }

}
