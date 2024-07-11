package org.example.demojakarta3;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "customHttpServlet", value = "/html")
public class CustomHtmlServlet extends HttpServlet {

    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Custom Servlet</title>");
        out.println("<link href=${pageContext.request.contextPath}/resources/css/style.css>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Hello Http </h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}