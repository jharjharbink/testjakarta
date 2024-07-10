package org.example.demojakarta3;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "textServlet", value = "/plainTexte")
public class TextServlet extends CustomHtmlServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("hello plain texte");
        out.println("and Cedric <3");
    }

    public void destroy() {
    }
}