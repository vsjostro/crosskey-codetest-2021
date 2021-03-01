package com.vsjostro.web.controller;

import com.vsjostro.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {


    /**
     * Retrieves the customer data from the database, creates customer objects and adds them to customerList.
     * The list of customers is forwarded to the jsp file, where the data is displayed in a table.
     *
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        ArrayList<Customer> customerList = new ArrayList<>();

        DatabaseController.getCustomers(customerList);


        request.setAttribute("customerList", customerList);

        getServletContext().getRequestDispatcher("/jsp/customer.jsp").forward(request, response);

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        getServletContext().getRequestDispatcher("/jsp/customer.jsp").forward(request, response);
    }




}