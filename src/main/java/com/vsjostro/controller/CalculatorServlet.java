package com.vsjostro.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


/**
 *
 */

@WebServlet("/")
public class CalculatorServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        boolean addToDatabase = Boolean.parseBoolean(request.getParameter("addCustomer"));
        String customerName = request.getParameter("customerName");
        String loanTotal = request.getParameter("loanTotal");
        String interest = request.getParameter("interest");
        String years = request.getParameter("years");

        if (customerName.isEmpty()) {
            customerName = "Anonymous Customer";
        }

        if(addToDatabase) {
            DatabaseController.addCustomer(customerName, loanTotal, interest, years);
        }

        double monthlyPayment = Calculator.calculateMortgage(Double.parseDouble(loanTotal), Double.parseDouble(interest), Integer.parseInt(years));
        String result = customerName + " needs to pay " + String.format("%.2f", monthlyPayment) + "€ each month";
        request.setAttribute("monthlyPayment", result);
        getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(request, response);
    }


}