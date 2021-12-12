package control;

import dao.DAO;
import entity.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "SignUpControl", urlPatterns = {"/signup"})
public class SignUpControl extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");
        if(!pass.equals(re_pass)){
            response.sendRedirect("Login.jsp");
        }else{
            DAO dao = new DAO();
            Account a = dao.checkAccountExist(user);
            if(a == null){
                //dc signup
                dao.singup(user, pass);
                response.sendRedirect("login");
            }else{
                //day ve trang login.jsp
                response.sendRedirect("Login.jsp");
            }
        }
        //sign up
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}