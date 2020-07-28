package com.example.fooddelivery.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.fooddelivery.R;


public class HomeFragment extends Fragment {
    ViewFlipper viewFlipper;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.home_fragment, container, false);
//       int img [] = {R.drawable.slider1, R.drawable.slider2, R.drawable.slider3};
//       viewFlipper = view.findViewById(R.id.imgSlider);
////       for (int i = 0; i< img.length; i++){
////           flipperImages(img[i]);
////       }
//        for(int i :img){
//            flipperImages(i);
//        }
//        viewFlipper.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(),"Bạn vừa chọn", Toast.LENGTH_LONG).show();
//            }
//        });
     return view;
    }
//
//    public void flipperImages (int img){
//        ImageView imageView = new ImageView(getContext());
//        imageView.setBackgroundResource(img);
//        viewFlipper.addView(imageView);
//        viewFlipper.setFlipInterval(3000);
//        viewFlipper.setAutoStart(true);
//        viewFlipper.setInAnimation(getContext(), android.R.anim.slide_in_left);
//        viewFlipper.setOutAnimation(getContext(), android.R.anim.slide_out_right);
//    }
}