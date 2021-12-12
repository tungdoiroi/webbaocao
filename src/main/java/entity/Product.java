package entity;


public class Product {
    private int id;
    private String name;
    private String image;
    private double price;
    private String title;
    private String description;
    private int cateID;
    private int sell_ID;
    private String size;
    private int amount;


    public Product() {


    }

    public Product(int id, String name, String image, double price, String title, String description, int cateID, String size, int amount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.cateID = cateID;
        this.size = size;
        this.amount = amount;

    }

    public Product(int id, String name, String image, double price, String title, String description, int cateID, int sell_ID, String size, int amount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.cateID = cateID;
        this.sell_ID = sell_ID;
        this.size = size;
        this.amount = amount;

    }

    public Product(int id, String name, double price, String title, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.title = title;
        this.image = image;
    }
    public Product(int id, String name,  String image,double price, int amount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.amount= amount;
    }



    public Product(int id, String name, String image, double price, String title, String description, int amount) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.title = title;
        this.description = description;
        this.amount = amount;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }


    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public int getSell_ID() {
        return sell_ID;
    }

    public void setSell_ID(int sell_ID) {
        this.sell_ID = sell_ID;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", cateID=" + cateID +
                ", sell_ID=" + sell_ID +
                ", amount=" + amount +
                '}';
    }

    public String getPriceWithDot() {
        String priceDot = "" + price;
        int i = priceDot.length() - 3;
        while (i > 0) {
            priceDot = priceDot.substring(0, i) + "." + priceDot.substring(i, priceDot.length());
            i -= 3;
        }
        return priceDot;
    }
}