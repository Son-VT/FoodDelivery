package com.example.fooddelivery.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fooddelivery.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TraSuaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TraSuaFragment extends Fragment {

    public TraSuaFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tra_sua_fragment, container, false);
    }
}