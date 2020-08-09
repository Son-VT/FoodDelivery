package com.example.fooddelivery.DAO;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.fooddelivery.model.Store;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Iterator;

public class StoreDAO {
    DatabaseReference mDatabase;
    Context context;
    String storeId;
    public StoreDAO(Context context) {
        this.mDatabase = FirebaseDatabase.getInstance().getReference("CuaHang");
        this.context = context;
    }
    public ArrayList<Store> getStore() {
        final ArrayList<Store> list = new ArrayList<Store>();
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    list.clear();
                    Iterable<DataSnapshot> dataSnapshotIterable = dataSnapshot.getChildren();
                    Iterator<DataSnapshot> iterator = dataSnapshotIterable.iterator();
                    while (iterator.hasNext()) {
                        DataSnapshot next = (DataSnapshot) iterator.next();
                        Store cuahang = next.getValue(Store.class);
                        list.add(cuahang);
                    }

                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return list;
    }
    public void insert(Store s) {
        storeId = mDatabase.push().getKey();
        String MaCuaHang = mDatabase.child(storeId).push().getKey();
        s.setStoreID(MaCuaHang);
        mDatabase.child(storeId).setValue(s)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d("insert", "insert Thanh cong");
//                        SachActivity.adaptersach.notifyDataSetChanged();
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("insert", "insert That bai");
            }
        });
    }
    public void update(final Store s) {
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    if (data.child("maSach").getValue(String.class).equalsIgnoreCase(s.getStoreID())) {
                        storeId = data.getKey();
                        Log.d("getKey", "onCreate: key :" + storeId);
//                        SachActivity.adaptersach.notifyDataSetChanged();
                        mDatabase.child(storeId).setValue(s)
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        Log.d("update", "update Thanh cong");
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Log.d("update", "update That bai");
                                    }
                                });
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    public void delete(final Store s) {
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot data : dataSnapshot.getChildren()) {
                    if (data.child("maSach").getValue(String.class).equalsIgnoreCase(s.getStoreID())){
                        storeId = data.getKey();
                        Log.d("getKey", "onCreate: key :" + storeId);
                        mDatabase.child(storeId).removeValue()
                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
//                                        StoreFragment.adaptersach.notifyDataSetChanged();
                                        Log.d("delete","delete Thanh cong");
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Log.d("delete","delete That bai");
                                    }
                                });
                    }
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
