package com.example.fooddelivery.model;

import java.io.Serializable;

class StoreYeuThich implements Serializable {
    private int Like;

    public int getLike() {
        return Like;
    }

    public void setLike(int like) {
        Like = like;
    }

    public StoreYeuThich() {
    }

    public StoreYeuThich(int like) {
        Like = like;
    }
}
