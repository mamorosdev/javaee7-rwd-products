/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Producte;
import persist.FakeProductesDAO;


@WebServlet(name = "Productes", urlPatterns = {"/Productes"})
@WebListener
public class ProductesController extends HttpServlet {
    private String path;
    private FakeProductesDAO productesDAO;
    @Override
    public void init(ServletConfig config) throws ServletException {
        productesDAO = new FakeProductesDAO();
        super.init(config);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "ListAll": 
                    listAll(request,response); break;
                default:
                    response.sendRedirect("index.jsp");
            }
        } else {
            response.sendRedirect("index.jsp");
        }
    }
     private void listAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Call the DAO, which calls the DataBase to get the data from the file
        List<Producte> llistaProductes = productesDAO.llistaProductes();
        request.setAttribute("productes", llistaProductes);
        RequestDispatcher rd = request.getRequestDispatcher("main.jsp");
        rd.forward(request, response);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
