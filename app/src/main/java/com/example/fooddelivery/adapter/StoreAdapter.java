package com.example.fooddelivery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fooddelivery.R;
import com.example.fooddelivery.model.Category;

public class StoreAdapter {
    @NonNull
    @Override
    public CategoriesAdapter.ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.theloai_one_item, viewGroup, false);
        CategoriesAdapter.ItemHolder holder = new CategoriesAdapter.ItemHolder(view, mListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.ItemHolder holder, final int position) {
        final Category category =  categories.get(position);
        holder.mCategoryName.setText(category.getCategoryName());
        holder.mCategoryImage.setImageResource(category.getCategoryDrawable());
    }

    public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mCategoryName;
        public ImageView mCategoryImage;
        public View mView;


        public ItemHolder(@NonNull View itemView, final CategoriesAdapter.OnItemClickListener listener) {
            super(itemView);
            mView = itemView;
            mCategoryName = itemView.findViewById(R.id.category_name);
            mCategoryImage = itemView.findViewById(R.id.category_photo);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
}
