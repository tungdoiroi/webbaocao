package control;

import dao.DAO;
import entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value="/load")
public class LoadmoreControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        //Load ra 6 san pham dau
        String count= req.getParameter("exist");
        int amount=Integer.parseInt(count);
        DAO dao=new DAO();
        List<Product> list = dao.getNextTop3(amount);
        PrintWriter out=resp.getWriter();
        //in ra tung san pham
        for(Product o:list){
            out.println("<div class=\"pro col-12 col-lg-4 col-md-6 mb-4\">\n" +
                    "            <div class=\"product-grid\">\n" +
                    "              <div class=\"product-image\">\n" +
                    "                <a href=\"detail?pid="+o.getId()+"&cateID="+o.getCateID()+"\" class=\"image\">\n" +
                    "                  <img class=\"pic-1\" src=\""+o.getImage()+"\">\n" +
                    "                </a>\n" +
                    "                <span class=\"product-sale-label\">sale!</span>\n" +
                    "                <div class=\"price\"> $"+o.getPrice()+" </div>\n" +
                    "                <a href=\"addtocart?pid="+o.getId()+"\" class=\"add-to-cart\">\n" +
                    "                  Add to cart\n" +
                    "                </a>\n" +
                    "              </div>\n" +
                    "              <div class=\"product-content\">\n" +
                    "                <h3 class=\"title\"><a href=\"detail?pid="+o.getId()+"\">"+o.getName()+"</a></h3>\n" +
                    "                <ul class=\"rating\">\n" +
                    "                  <li class=\"fas fa-star\"></li>\n" +
                    "                  <li class=\"fas fa-star\"></li>\n" +
                    "                  <li class=\"fas fa-star\"></li>\n" +
                    "                  <li class=\"fas fa-star\"></li>\n" +
                    "                  <li class=\"fas fa-star\"></li>\n" +
                    "                </ul>\n" +
                    "              </div>\n" +
                    "            </div>\n" +
                    "          </div>");
        }
    }
}