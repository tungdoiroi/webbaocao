package control;

import dao.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddControl", urlPatterns = {"/add"})
public class AddControl extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8"); //Add Vietnamese Characters
        //Get data from JSP
        String id = request.getParameter("id");
        String name = request.getParameter("name"); //Get by name
        String  image= request.getParameter("image");
        String price = request.getParameter("price");
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String cateID = request.getParameter("cateID");
        String sell_ID = request.getParameter("sell_ID");
        String size =request.getParameter("size");
        String amount = request.getParameter("amount");
        //Add data to Database
        DAO dao = new DAO();
        dao.add(id,name,image,price,title,description,cateID,sell_ID,size,amount);
        response.sendRedirect("managerProduct");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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