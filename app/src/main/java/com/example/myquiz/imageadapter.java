package com.example.myquiz;


import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;
import java.util.List;

public class imageadapter extends RecyclerView.Adapter<ImageViewHolder> {

    private Context mContext;
    private List<Integer> listImages;

    public imageadapter(Context mContext) {
        this.mContext = mContext;
        this.listImages = getImages();
    }

    private List<Integer> getImages(){
        List<Integer> results  = new ArrayList<>();
        results.add(R.drawable.unicorn_drawing_cfk1);
        results.add(R.drawable.images_cfk7_s2);
        results.add(R.drawable.images_cfk8);
        results.add(R.drawable.download_cfk10);
        results.add(R.drawable.download_cfk6);
        results.add(R.drawable.download_cfk9_s2);
        results.add(R.drawable.download_cfk10);
        results.add(R.drawable.download_cfk11_s2);
        results.add(R.drawable.images_cfk12_s2);
        results.add(R.drawable.images_cfk13_s2);
        results.add(R.drawable.images_cfk14_s2);
        results.add(R.drawable.images_cfk15_s2);
        results.add(R.drawable.images_cfk16_s2);
        results.add(R.drawable.images_cfk17_s2);
        results.add(R.drawable.images_cfk18_s3);
        results.add(R.drawable.images_cfk19);
        results.add(R.drawable.images_cfk20);
        results.add(R.drawable.images_cfk21_s2);
        results.add(R.drawable.images_cfk22);
        results.add(R.drawable.images_cfk23);
        results.add(R.drawable.images_cfk24_s2);
        results.add(R.drawable.images_cfk25);

        return results;

    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from((Context) mContext).inflate(R.layout.item_images,parent,false);
        return new ImageViewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(listImages.get(position));
    }

    @Override
    public int getItemCount() {
        return listImages.size();
    }
}
