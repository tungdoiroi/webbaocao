package control;

import dao.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "DeleteControl", urlPatterns = {"/delete"})
public class DeleteControl extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //Lấy id của sản phẩm cần xóa về
        String id = request.getParameter("ProductID");
        //Gọi hàm delete() trong ProductDAO
//        ProductDAO dao = new ProductDAO();
        DAO dao= new DAO();
        dao.delete(id);
        //Chuyển về trang HomeControl (có đường dẫn là /home) để load lại dữ liệu 
        //Mình ko cần câu lệnh này: request.getRequestDispatcher("home").forward(request,response); => Vì mình chỉ cần chuyển trang thôi, ko cần mang theo dữ liệu

        response.sendRedirect("managerProduct"); //Chỉ chuyển trang
        //request.getRequestDispatcher("home").forward(request,response); //Mang theo dữ liệu
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