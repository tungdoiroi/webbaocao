package entity;

public class Comment {
    private String cmt;
    private String ten;
    private String id;

    public Comment(String cmt,  String ten, String id) {
        this.cmt = cmt;
        this.ten = ten;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "cmt='" + cmt + '\'' +

                ", ten='" + ten + '\'' +
                ", id=" + id +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }



    public String getId() {
        return id;
    }

    public String getCmt() {
        return cmt;
    }

    public String getTen() {
        return ten;
    }


}
