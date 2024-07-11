package org.example.demojakarta3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="JspBootstrap2", value="/jspBootstrap2")
public class JspBootstrap2 extends HttpServlet {

    @Override
    public void init(){
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/JspBootstrap2.jsp").forward(req, resp);
    }

    @Override
    public void destroy(){
    }

}
