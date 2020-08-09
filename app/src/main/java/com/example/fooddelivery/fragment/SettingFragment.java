package com.example.fooddelivery.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fooddelivery.BottomNavigation;
import com.example.fooddelivery.LoginActivity;
import com.example.fooddelivery.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.concurrent.Executor;

import static com.firebase.ui.auth.AuthUI.getApplicationContext;

public class SettingFragment extends Fragment {

    private LinearLayout favoriteRestaurants, favoriteFoods;
    ImageView logout;
    private static final int ACTIVITY_NUM = 4;
    private static final String TAG = "ProfileActivity";
    CircularImageView profile_image;
    TextView tvNameProfile, tvMailProfile, tvPhoneProfile;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userID;

    public SettingFragment() {
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
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        tvNameProfile = view.findViewById(R.id.tvNameProfile);
        tvMailProfile = view.findViewById(R.id.tvMailProfile);
        tvPhoneProfile = view.findViewById(R.id.tvPhoneProfile);
        profile_image = view.findViewById(R.id.profile_image);

        fAuth = FirebaseAuth.getInstance();
        userID = fAuth.getCurrentUser().getUid();

        final DocumentReference documentReference = fStore.collection("users").document(userID);
//        documentReference.addSnapshotListener( new EventListener<DocumentSnapshot>()
//            @Override
//            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
//                tvMailProfile.setText(value.getString("email"));
//            }
//        });
//
//
//        logout = view.findViewById(R.id.ivLogout);
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//                LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
//                View view1 = layoutInflater.inflate(R.layout.logout_alert_dialog,null);
//
//
//                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
//                    @SuppressLint("RestrictedApi")
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        FirebaseAuth.getInstance().signOut();
//                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
//                    }
//                });
//                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//                builder.setView(view1);
//                builder.show();
//            }
//        });
//
//        favoriteRestaurants = view.findViewById(R.id.favorite_restaurants);
//        favoriteFoods = view.findViewById(R.id.favorite_foods);
//        setupWidgets();
//
//
//        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
//        BottomNavigationView bottomNavigationViewEx = view.findViewById(R.id.navigation);
////        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
////        BottomNavigationViewHelper.enableNavigation(getActivity(), this, bottomNavigationViewEx);
////        Menu menu = bottomNavigationViewEx.getMenu();
////        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
////        menuItem.setChecked(true);
//
        return view;
//    }

//    private void setupWidgets() {
//        favoriteRestaurants.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getActivity(), BottomNavigation.class);
//                startActivity(i);
//            }
//        });
//        favoriteFoods.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getActivity(), BottomNavigation.class);
//                startActivity(i);
//            }
//        });
//    }
//
//    //    BottomNavigationView setup
//
//    public void logout(View view) {
//        FirebaseAuth.getInstance().signOut();
//        startActivity(new Intent(getActivity(),LoginActivity.class));
//    }
    }
}