package com.example.apiintegration;

public class Products {

    String pimg, pname;

    public Products(String pimg, String pname) {
        this.pimg = pimg;
        this.pname = pname;
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
