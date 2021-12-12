package control;

import dao.DAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "EditControl", urlPatterns = {"/edit"})
public class EditControl extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");




        request.getRequestDispatcher("Edit.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //Bước 1: get data from jsp
        String pid = request.getParameter("id");
        String name = request.getParameter("name"); //Get by name
        String  image= request.getParameter("image");
        String price = request.getParameter("price");
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String cateID = request.getParameter("cateID");
        String sell_ID = request.getParameter("sell_ID");
        String size =request.getParameter("size");
        String amount = request.getParameter("amount");
        //Bước 2: set data to DAO

        DAO dao=new DAO();
        dao.edit( name,image,price,title,description,cateID,sell_ID,size,amount,pid);
        response.sendRedirect("managerProduct");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}