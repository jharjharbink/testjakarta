package org.example.demojakarta3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="jspServlet", value="/jsp")
public class jspServlet extends HttpServlet {

    @Override
    public void init(){
        System.out.println("Servlet Crée");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//
//        PrintWriter out = resp.getWriter();
//
//        out.println("<html><body>");
//        out.println("<h1>Salut les bgs</h1>");
//        out.println("</body></html>");

        getServletContext().getRequestDispatcher("/test.jsp").forward(req, resp);
    }

    @Override
    public void destroy(){
        System.out.println("Servlet Destroy");
    }

}
