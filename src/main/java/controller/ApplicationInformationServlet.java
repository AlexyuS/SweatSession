package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplicationInformationServlet extends HttpServlet {
    private Integer statistics = 0;

    @Override 
    public void init() throws ServletException {
       System.out.println("Controller initialized:"+ApplicationInformationServlet.class.getName());
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(
            "  <li> Application Name: rest-application-no-spring </li> " 
            + "<li> Version: 1.0.0. </li>" 
            + "<li> Status was changed "+statistics+" times </li>");
    }

    @Override 
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        statistics++;
    }
}
