package org.example.demojakarta3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="JspBootstrap1", value="/jspBootstrap1")
public class JspBootstrap1 extends HttpServlet {

    @Override
    public void init(){
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/JspBootstrap1.jsp").forward(req, resp);
    }

    @Override
    public void destroy(){
    }

}
