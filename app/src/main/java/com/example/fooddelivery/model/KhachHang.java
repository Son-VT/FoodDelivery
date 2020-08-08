package com.example.fooddelivery.model;

import java.io.Serializable;

class KhachHang implements Serializable {
    private String UserID;
    private String UserName;
    private String UserDiaChi;
    private String UserPass;
    private String UserSDT;
    private String UserMail;
    private String UserNgaySinh;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserDiaChi() {
        return UserDiaChi;
    }

    public void setUserDiaChi(String userDiaChi) {
        UserDiaChi = userDiaChi;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass) {
        UserPass = userPass;
    }

    public String getUserSDT() {
        return UserSDT;
    }

    public void setUserSDT(String userSDT) {
        UserSDT = userSDT;
    }

    public String getUserMail() {
        return UserMail;
    }

    public void setUserMail(String userMail) {
        UserMail = userMail;
    }

    public String getUserNgaySinh() {
        return UserNgaySinh;
    }

    public void setUserNgaySinh(String userNgaySinh) {
        UserNgaySinh = userNgaySinh;
    }

    public KhachHang() {
    }

    public KhachHang(String userID, String userName, String userDiaChi, String userPass, String userSDT, String userMail, String userNgaySinh) {
        UserID = userID;
        UserName = userName;
        UserDiaChi = userDiaChi;
        UserPass = userPass;
        UserSDT = userSDT;
        UserMail = userMail;
        UserNgaySinh = userNgaySinh;
    }
}
