package entity;

public class Customer {
    private int id;
    private String name;
    private String gioitinh;
    private String diachi;
    private String dienthoai;
    private String email;
    private String cmnd;

    public Customer(String name, String gioitinh, String diachi, String dienthoai, String email, String cmnd){
        this.name =name;
        this.gioitinh=gioitinh;
        this.diachi=diachi;
        this.dienthoai=dienthoai;
        this.email=email;
        this.cmnd=cmnd;
    }
    public Customer(int id,String name, String gioitinh, String diachi, String dienthoai, String email, String cmnd){
        this.id=id;
        this.name =name;
        this.gioitinh=gioitinh;
        this.diachi=diachi;
        this.dienthoai=dienthoai;
        this.email=email;
        this.cmnd=cmnd;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dienthoai='" + dienthoai + '\'' +
                ", email='" + email + '\'' +
                ", cmnd='" + cmnd + '\'' +
                '}';
    }
}
