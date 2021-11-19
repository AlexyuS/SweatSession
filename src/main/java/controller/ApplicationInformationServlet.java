package controller;

import java.io.IOException;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.specific.CarInformationsController;

public class ApplicationInformationServlet extends HttpServlet {
    private Integer statistics = 0;
    private CarInformationsController carInfoController;
    @Override 
    public void init() throws ServletException {
       System.out.println("Controller initialized:"+ApplicationInformationServlet.class.getName());
       carInfoController = new CarInformationsController();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String getPath = request.getRequestURI();

        if (getPath.endsWith("/carInfo")) {
            response.getWriter().println("<b>" + carInfoController.getCarInfo() + "</b>");
        }
    }

    @Override 
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
        if(req.getRequestURI().endsWith("/carInfo")){
            carInfoController.postCarInfo("red","Dacia");
        }
    }

    @Override 
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doOptions(req, resp);
    }

    @Override 
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }
    
    
}
