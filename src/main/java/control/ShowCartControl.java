package control;

import dao.DAO;
import entity.Cart;
import entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "ShowCartControl", urlPatterns = {"/show"})
public class ShowCartControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("cart") == null) {
            response.sendRedirect("Cart.jsp");
        }
        else {
        List<Cart> list = (List<Cart>) session.getAttribute("cart"); //lấy ra list cart trong session


        List<Product> listP = new ArrayList<>();
        DAO dao = new DAO();

        double total = 0;
        for (Cart o : list) {
            Product p = dao.getProduct(o.getPid());
            p.setAmount(o.getAmount());
            listP.add(p);
            total += p.getAmount() * p.getPrice();

        }

        request.setAttribute("listP", listP);
        request.setAttribute("total", total);
        request.setAttribute("vat", 0.02 * total);
        request.setAttribute("sum", 1.02 * total);
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
    }}


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