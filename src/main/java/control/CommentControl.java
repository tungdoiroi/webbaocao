package control;

import dao.DAO;
import entity.Account;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/comment")
public class CommentControl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession session = req.getSession();
 //       RequestDispatcher rd = req.getRequestDispatcher("product.jsp");
        String id= req.getParameter("pid");
        String PROID= req.getParameter("1");
        String cmt = req.getParameter("cmt");

        Account a = (Account) session.getAttribute("acc");
        DAO dao = new DAO();

        dao.addComment(cmt,a.getUser(),"1");
//        List<Comment> listCmt = dao.getComment();
//        req.setAttribute("listCmt",listCmt);


        resp.sendRedirect("/detail?pid=" + 1);
    }
}
