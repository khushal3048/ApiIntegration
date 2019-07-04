package com.example.apiintegration;

import android.os.Parcel;
import android.os.Parcelable;

public class Products implements Parcelable {

    String pimg, pname, brand, desc;
    long price;

    public Products(String pimg, String pname) {
        this.pimg = pimg;
        this.pname = pname;
    }

    public Products(String pimg, String pname, String brand, String desc, long price) {
        this.pimg = pimg;
        this.pname = pname;
        this.brand = brand;
        this.desc = desc;
        this.price = price;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

}
