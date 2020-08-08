package com.example.fooddelivery.model;

import java.io.Serializable;

class CuaHang implements Serializable {
    private String StoreID;
    private String StoreIDTheLoai;
    private String StoreName;
    private String StoreDiaChi;
    private Double StoreDanhGia;
    private String StoreHinhAnh;
    private Double StoreViDo;
    private Double StoreKinhDo;

    public String getStoreID() {
        return StoreID;
    }

    public void setStoreID(String storeID) {
        StoreID = storeID;
    }

    public String getStoreIDTheLoai() {
        return StoreIDTheLoai;
    }

    public void setStoreIDTheLoai(String storeIDTheLoai) {
        StoreIDTheLoai = storeIDTheLoai;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getStoreDiaChi() {
        return StoreDiaChi;
    }

    public void setStoreDiaChi(String storeDiaChi) {
        StoreDiaChi = storeDiaChi;
    }

    public Double getStoreDanhGia() {
        return StoreDanhGia;
    }

    public void setStoreDanhGia(Double storeDanhGia) {
        StoreDanhGia = storeDanhGia;
    }

    public String getStoreHinhAnh() {
        return StoreHinhAnh;
    }

    public void setStoreHinhAnh(String storeHinhAnh) {
        StoreHinhAnh = storeHinhAnh;
    }

    public Double getStoreViDo() {
        return StoreViDo;
    }

    public void setStoreViDo(Double storeViDo) {
        StoreViDo = storeViDo;
    }

    public Double getStoreKinhDo() {
        return StoreKinhDo;
    }

    public void setStoreKinhDo(Double storeKinhDo) {
        StoreKinhDo = storeKinhDo;
    }

    public CuaHang() {
    }

    public CuaHang(String storeID, String storeIDTheLoai, String storeName, String storeDiaChi, Double storeDanhGia, String storeHinhAnh, Double storeViDo, Double storeKinhDo) {
        StoreID = storeID;
        StoreIDTheLoai = storeIDTheLoai;
        StoreName = storeName;
        StoreDiaChi = storeDiaChi;
        StoreDanhGia = storeDanhGia;
        StoreHinhAnh = storeHinhAnh;
        StoreViDo = storeViDo;
        StoreKinhDo = storeKinhDo;
    }
}
