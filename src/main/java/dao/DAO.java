package dao;


import entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author trinh
 */
public class DAO {



    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web", "root", "tung03102001");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }





    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getTop6() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product limit 6";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getNextTop3(int amount) {
        List<Product> list = new ArrayList<>();
        String query = "select*from product\n" +
                "order by id\n" +
                "limit ?,6;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1,amount);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getNewProduct() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT*FROM product\n" +
                "ORDER BY id DESC\n" +
                "limit 6;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getHotProduct() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT*FROM product\n" +
                "ORDER BY amount DESC\n" +
                "limit 6;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getGoodProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select*from product \n" +
                "where price< 150;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select *from category";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                                rs.getString(2)
                        )
                );


            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Category> getTopCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select *from category ORDER BY cid DESC limit 4;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                                rs.getString(2)
                        )
                );


            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductCID(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product"+ "\n" +
                "where cateID=?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql

            ps = conn.prepareStatement(query);
            ps.setString(1,cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),

                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductID(String id) {
        String query = "select * from product"+ "\n" +
                "where id=?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),

                        rs.getString(9),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return null;
    }
    //    giang
    public List<Product> searchProduct (String txtSearch) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n" +
                "where match(name, title, description)\n" +
                "AGAINST( ? IN NATURAL LANGUAGE MODE )";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,"'" + txtSearch + "'");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),

                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getProductByDetail(String cid,String pid) {
        List<Product> list = new ArrayList<>();
        String query = "select*from product where cateID= ? and id NOT IN( select id from product where id=?) limit 4;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            ps.setString(2, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getProductBySellID(int id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product\n"
                + "where sell_ID = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),

                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Comment> getComment() {
        List<Comment> list = new ArrayList<>();
        String query = "select * from tcomment";
//                + "\n" +
//                "where id=?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
//            ps.setString(1,cmtid);
            rs = ps.executeQuery();

                while (rs.next()) {
                    list.add(new Comment(rs.getString(1),
                            rs.getString(2),
                            rs.getString(3)
                       ));
                }
            
        } catch (Exception e) {
        }
        return list;
    }
    public Comment addComment(String cmt,String ten,String id) {
        String query = "insert into tcomment values(?,?,?);";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,cmt);
            ps.setString(2,ten);
            ps.setString(3,id);
            ps.execute();
        } catch (Exception e) {
        }
        return null;
    }
    public Product getProduct(String txt) {
        String query = "select * from product where id = ?";
        List<Product> list = new ArrayList<>();
        try {
            conn = new DAO().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),

                        rs.getString(9),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return null;
    }




    //    public void insertProduct(String name, String image, String price,
//                              String title, String description, String category, int sid) {
//        String query = "INSERT into product \n"
//                + "(name, image, price, title, description, cateID, sell_ID)\n"
//                + "VALUES(?,?,?,?,?,?,?)";
//        try {
//            conn = new DAO().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setString(1, name);
//            ps.setString(2, image);
//            ps.setString(3, price);
//            ps.setString(4, title);
//            ps.setString(5, description);
//            ps.setString(6, category);
//            ps.setInt(7, sid);
//            ps.executeUpdate();
//        } catch (Exception e) {
//            conn = new DAO().getConnection();
//        }
//    }
    public List<Customer> getCustomer() {
        List<Customer> list = new ArrayList<>();
        String query = "select * from customer ";

        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                while (rs.next()) {
                    list.add(new Customer(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7))
                    );
                }
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Customer> getOdCustomer() {
        List<Customer> list = new ArrayList<>();
        String query = "select * from customer\n" +
                "                ORDER BY id DESC\n" +
                "                limit 1;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

                while (rs.next()) {
                    list.add(new Customer(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7))
                    );
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> DescendingProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product ORDER BY price DESC";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),

                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> AscendingProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from product ORDER BY price ASC";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),

                        rs.getString(9),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }



    public Customer checkout(String name, String gioitinh, String diachi,
                             String dienthoai, String email, String cmnd) {
        String query = "insert into customer(name,gioitinh,diachi,dienthoai,email,cmnd) values(?,?,?,?,?,?)";
        try {
            conn = new DAO().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,gioitinh);
            ps.setString(3,diachi);
            ps.setString(4,dienthoai);
            ps.setString(5,email);
            ps.setString(6,cmnd);


            ps.executeUpdate();
        } catch (Exception e) {
        }
        ;
        return null;

    }
    public Customer checkCustomerExist(String cmnd){
        String query = "select * from customer\n"
                + "where cmnd = ?\n";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, cmnd);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
            }
        } catch (Exception e) {
        }
        return null;


    }
    public void editProduct(String name, String image, String price,
                            String title, String description, String size,String  cateID,String sell_ID,String amount,String id) {
        String query = "update product\n"
                + "set name = ?,\n"
                + "image = ?,\n"
                + "price = ?,\n"
                + "title = ?,\n"
                + "description = ?,\n"
                + "size = ?,\n"
                + "cateID = ?,\n"
                + "sell_ID = ?,\n"
                + "amount = ?\n"
                + "where id = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, size);
            ps.setString(7, cateID);
            ps.setString(8, size);
            ps.setString(9, amount);
            ps.setString(10, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public Product getProduct(int pid) {
        String query = "select * from product where id = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(3));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void addToProduct(String name, String image, String price,
                             String title, String description, String size,String  cateID,String sell_ID,String amount) {
        String query = "insert into product(name,image,price,description,title, cateid,sell_id,amount) values(?,?,?,?,?,?,?,?)";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, description);
            ps.setString(5, title);
            ps.setString(6, size);
            ps.setString(7, cateID);
            ps.setString(8,sell_ID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void delete(String id) { //Để kiểu String vì khi get về nó là kiểu String -> Đỡ phải ép kiểu
//        String query = "DELETE FROM Cart WHERE aID = ?,\n"
        String query =      "DELETE FROM Product WHERE ID = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            //Đẩy id vào trong dấu ? thứ nhất
            ps.setString(1, id);
//            ps.setString(2, id);
            //Execute: Ko có bảng Result -> Ko dùng RS, chỉ dùng executeUpdate
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void edit(String name, String image, String price,
                     String title, String description,String cateID,String sell_ID, String size,String amount,String pid) {
        String query = "update product\n"
                + "set name = ?,\n"
                + "image = ?,\n"
                + "price = ?,\n"
                + "title = ?,\n"
                + "description = ?,\n"
                + "cateID = ?,\n"
                + "sell_ID = ?,\n"
                + "size = ?,\n"
                + "amount = ?\n"
                + "where id = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, cateID);
            ps.setString(7, sell_ID);
            ps.setString(8, size);
            ps.setString(9, amount);
            ps.setString(10, pid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public void editAc(String id,String user, String pass, String isSell, String isAdmin) {
        String query = "update account\n"
                + "set user = ?,\n"
                + "pass = ?,\n"
                + "isSell = ?,\n"
                + "isAdmin = ?\n"
                + "where id = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, isSell);
            ps.setString(4, isAdmin);
            ps.setString(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public Account getAccountByID(String id) {
        String query = "select * from account where id = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void deleteAccount(String id) {
        String query =
//                "delete from Cart where aid = ?;\n"
//                + "delete from Cart where pid IN (select id from Product where sell_id = ?);\n"
//                + "delete from Product where sell_id = ?;\n"
                  "delete from account where id = ?;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
//            ps.setString(2, id);
//            ps.setString(3, id);
//            ps.setString(4, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return;
    }
//    public void update( String amount,String pid) {
//        String query = "update product\n"
//
//                + "set Product.amount =cart.amount \n"
//              + "where id = ?";
//        try {
//            conn = new DAO().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//
//            ps.setString(1, name);
//            ps.setString(2, image);
//            ps.setString(3, price);
//            ps.setString(4, title);
//            ps.setString(5, description);
//            ps.setString(6, cateID);
//            ps.setString(7, sell_ID);
//            ps.setString(8, size);
//            ps.setString(9, amount);
//            ps.setString(10, pid);
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//    }


    public void add(String id,String name, String image, String price,
                    String title, String description,String  cateID,String sell_ID, String size,String amount) {
        String query = "insert into product(name,image,price,description,title, cateid,sell_id,size,amount) values(?,?,?,?,?,?,?,?,0)";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, description);
            ps.setString(5, title);
            ps.setString(6, cateID);
            ps.setString(7,sell_ID);
            ps.setString(8, size);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public Product getProductByID(String id) {
        String query = "select * from product\n"
                + "where id = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public Account login(String user, String pass) {
        String query = "select * from account\n"
                + "where user = ?\n"
                + "and pass = ?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void singup(String user, String pass) {
        String query = "insert into account(user,pass,isSell,isAdmin)\n"
                + "values(?,?,0,0)";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);//mo ket noi voi sql
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public Account checkAccountExist(String user) {
        String query = "select * from account\n"
                + "where user = ?\n";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public List<Account> getAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from account";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Account> getOdAllAccount() {
        List<Account> list = new ArrayList<>();
        String query = "select * from account\n" +
                "                ORDER BY id DESC\n" +
                "                limit 1;";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)));

            }
        } catch (Exception e) {
        }
        return list;
    }
    public void addToCart(int aid, int pid, int amount) {
        String query = "insert into cart values(?,?,?)";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, aid);
            ps.setInt(2, pid);
            ps.setInt(3, amount);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

//list sp dã bán
     public List<Product> getCart(){
        List<Product> list = new ArrayList<>();
        String query="select product.id,product.name,product.image,product.price,cart.amount from product INNER JOIN Cart ON product.id=Cart.pid where aid=?";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p= new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getInt(10));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Product> getProCart(){
        List<Product> list = new ArrayList<>();
        String query="select * from product INNER JOIN Cart ON product.id=Cart.pid";
        try {
            conn = new DAO().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getInt(10)));
            }
        } catch (Exception e) {
        }
        return list;
    }



//    public List<Cart> getCart(int id) {
//        List<Cart> list =new ArrayList<>();
//        String query = "select Product.id, Product.Name, Product.Description, Product.Price, Product.image, Cart.Amount\n"
//                + "from Cart inner join Product\n"
//                + "on Cart.ProductID = Product.ID\n"
//                + "where Cart.AccountID = ?";
//        try {
//            conn = new DAO().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
//                int amount = rs.getInt(6);
//                list.add(new Cart(id, amount));
//            }
//        } catch (Exception e) {
//        }
//        return list;
//    }
//    public int countCart(int pid) {
//        int count = 0;
//        String query = "select count(*)\n"
//                + "from Cart inner join Product \n"
//                + "on Cart.ProductID = Product.ID\n"
//                + "where Cart.AccountID = ?";
//        try {
//            conn = new DAO().getConnection();//mo ket noi voi sql
//            ps = conn.prepareStatement(query);
//            ps.setInt(1, pid);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                count = rs.getInt(1);
//            }
//        } catch (Exception e) {
//        }
//        return count;
//    }

    public static void main(String[] args) {
        DAO dao = new DAO();
//        tomer();
        List<Comment> list= dao.getComment();

        for (Comment o : list) {
       System.out.println(o);
        }
    }

}