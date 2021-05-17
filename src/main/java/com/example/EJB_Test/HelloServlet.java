package com.example.EJB_Test;

import java.io.*;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "calculate", value = "/calculate")
public class HelloServlet extends HttpServlet {
    @EJB
    IBeanRemote beanRemote;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println(beanRemote.solve(3));
    }
}