package com.example.enterpriseapp;
import com.example.enterpriseapp.SessionBean;
import com.example.enterpriseapp.SessionBeanInterface;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HelloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    //private String message;

    private static SessionBeanInterface mySessionBean = new SessionBean();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + mySessionBean.sayHello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}