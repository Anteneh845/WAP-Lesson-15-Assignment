package cs.edu.wap.web;

import cs.edu.wap.models.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/beer-select")
public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String color = request.getParameter("color");
        BeerExpert beerExpert = new BeerExpert();
        List result = beerExpert.getBrands(color);
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }
}