package com.example.fooddelivery.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.fooddelivery.R;
import com.example.fooddelivery.adapter.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class HomeFragment extends Fragment {
    SliderView sliderView;
    RecyclerView recyclerView;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.home_fragment, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.lv_cuahang);
        sliderView = view.findViewById(R.id.imgSlider);

        //custom slider
        SliderAdapter adapter = new SliderAdapter(getActivity());
        sliderView.setSliderAdapter(adapter);
        //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setIndicatorAnimation(IndicatorAnimations.FILL); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINDEPTHTRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
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