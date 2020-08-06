package com.example.fooddelivery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.R;
import com.example.fooddelivery.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ItemHolder>{

    private List<Category> categories = new ArrayList<>();
    private Context context;
//    private final OnCategoryClickListener mListener;

    public CategoriesAdapter(Context context){
        this.context = context;

//        try {
//            this.mListener = ((OnCategoryClickListener) context);
//        } catch (ClassCastException e) {
//            throw new ClassCastException("Activity must implement OnPlaceClickListener.");
//        }

        String[] categoryNames = {"Lanches", "Pizza",
                "Japonesa", "Churrasco", "Brasileira", "Saudável", "Doces", "Sorvetes", "Chinesa", "Árabe"};

        int images_array[] = {
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
                R.drawable.category_sushi,
        };

        for (int i = 0; i < 10; i++){
            Category category = new Category(categoryNames[i], images_array[i]);
            categories.add(category);
        }
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.theloai_one_item, viewGroup, false);
        ItemHolder holder = new ItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        final Category category =  categories.get(position);

        holder.mCategoryName.setText(category.getCategoryName());

        holder.mCategoryImage.setImageResource(category.getCategoryDrawable());

//        holder.mView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mListener != null)
//                    mListener.onCategoryClickListener(category);
//            }
//        });
    }

    public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mCategoryName;
        public ImageView mCategoryImage;
        public View mView;


        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
            mCategoryName = itemView.findViewById(R.id.category_name);
            mCategoryImage = itemView.findViewById(R.id.category_photo);
        }

        @Override
        public void onClick(View v) {}
    }

    public interface OnCategoryClickListener {
        void onCategoryClickListener(Category category);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
}
