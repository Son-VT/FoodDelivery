package com.example.fooddelivery.model;

import java.io.Serializable;
import java.util.List;

class DonHang implements Serializable {
    private String DonHangID;
    private String UserID;
    private String UserName;
    private String UserDiaChi;
    private String UserSDT;
    private List<GioHang> GioHangList;
    private int TongTien;
    private String TrangThai;
    private String ThoiGianDat;
    private String StoreID;

    public String getDonHangID() {
        return DonHangID;
    }

    public void setDonHangID(String donHangID) {
        DonHangID = donHangID;
    }

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

    public String getUserSDT() {
        return UserSDT;
    }

    public void setUserSDT(String userSDT) {
        UserSDT = userSDT;
    }

    public List<GioHang> getGioHangList() {
        return GioHangList;
    }

    public void setGioHangList(List<GioHang> gioHangList) {
        GioHangList = gioHangList;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int tongTien) {
        TongTien = tongTien;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public String getThoiGianDat() {
        return ThoiGianDat;
    }

    public void setThoiGianDat(String thoiGianDat) {
        ThoiGianDat = thoiGianDat;
    }

    public String getStoreID() {
        return StoreID;
    }

    public void setStoreID(String storeID) {
        StoreID = storeID;
    }

    public DonHang() {
    }

    public DonHang(String donHangID, String userID, String userName, String userDiaChi, String userSDT, List<GioHang> gioHangList, int tongTien, String trangThai, String thoiGianDat, String storeID) {
        DonHangID = donHangID;
        UserID = userID;
        UserName = userName;
        UserDiaChi = userDiaChi;
        UserSDT = userSDT;
        GioHangList = gioHangList;
        TongTien = tongTien;
        TrangThai = trangThai;
        ThoiGianDat = thoiGianDat;
        StoreID = storeID;
    }
}
