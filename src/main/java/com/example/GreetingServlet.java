package com.example;

import jakarta.servlet.http.*;
import java.io.IOException;

public class GreetingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        String name = req.getParameter("name");
        if (name == null || name.isBlank()) name = "Guest";
        resp.setContentType("text/plain");
        resp.getWriter().println("Hello, " + name + "! Welcome!");
    }
}