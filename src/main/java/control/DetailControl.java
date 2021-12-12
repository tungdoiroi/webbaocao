package control;


import dao.DAO;
import entity.Account;
import entity.Category;
import entity.Comment;
import entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value="/detail")
public class DetailControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String PROID= req.getParameter("pid");
        String cateID1= req.getParameter("cateID");
        String cateID=req.getParameter("cid");
        DAO dao = new DAO();
        List<Category> listC = dao.getAllCategory();
        List<Category> listCC = dao. getTopCategory();
        List<Product> listPC = dao.getProductCID(cateID);
        List<Account> listAccount = dao.getAllAccount();
        List<Comment> listCmt = dao.getComment();
        req.setAttribute("listCmt",listCmt);

        Product proid= dao.getProductID(PROID);//lay id san pham
        List<Product> listpp=dao.getProductByDetail(cateID1,PROID);//lay cau lenh san pham lien quan
        req.setAttribute("detail",proid);
        req.setAttribute("listCC",listC);
        req.setAttribute("listCCC", listCC);
        req.setAttribute("tag",cateID);
        req.setAttribute("listPP",listpp);
        req.setAttribute("list", listAccount);
        RequestDispatcher rd= req.getRequestDispatcher("product.jsp");
        rd.forward(req,resp);

    }
}
