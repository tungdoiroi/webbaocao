package control;

import dao.DAO;
import entity.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "EditAccountControl", urlPatterns = {"/editAccount"})
public class EditAccountControl extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        DAO dao = new DAO();
        Account x = dao.getAccountByID(id);

        request.setAttribute("id", x.getId());
        request.setAttribute("user", x.getUser());
        request.setAttribute("pass", x.getPass());
        request.setAttribute("isSell", x.getIsSell());
        request.setAttribute("isAdmin", x.getIsAdmin());

        request.getRequestDispatcher("EditAccount.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        //Bước 1: get data from jsp
        String id = request.getParameter("id");
        String user = request.getParameter("user"); //Get by name
        String pass = request.getParameter("pass");
        String isSell = request.getParameter("isSell");
        String isAdmin = request.getParameter("isAdmin");

        if (!"1".equals(isSell)) {
            isSell = "0";
        }
        if (!"1".equals(isAdmin)) {
            isAdmin = "0";
        }

        //Bước 2: set data to ProductDAO
        DAO dao = new DAO();
        dao.editAc(id, user, pass, isSell, isAdmin);
        response.sendRedirect("accountManager");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}