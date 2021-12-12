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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SubCartControl", urlPatterns = {"/sub"})
public class SubCartControl extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddToCart</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddToCart at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Cart> list = (List<Cart>) session.getAttribute("cart");//lấy lại list cart trong session
        int pid = Integer.parseInt(request.getParameter("pid"));
        int check = 0;
        if(check ==0) {for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPid() == pid){

                for (Cart o : list) {
                    if (o.getPid() == pid) {
                        list.get(i).setAmount(o.getAmount() - 1);
                        if(check == 1){
                            break;}
                    }
                    if (o.getAmount()==0) {
                        list.remove(i);
                        break;
                    }}}}


            session.setAttribute("cart", list);
            List<Product> listP = new ArrayList<>();
            DAO dao = new DAO();

            int total = 0;
            for (Cart o : list) {
                Product p = dao.getProduct(o.getPid());//lay id sp
                p.setAmount(o.getAmount());
                listP.add(p);
                total += p.getAmount() * p.getPrice();

            }
////        request.setAttribute("listP", listP);
//        request.setAttribute("total", getPriceWithDot(total));
            request.setAttribute("listP", listP);
            request.setAttribute("total", total);
            request.setAttribute("vat", 0.02 * total);
            request.setAttribute("sum", 1.02 * total);
            request.getRequestDispatcher("Cart.jsp").forward(request, response);

        }

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