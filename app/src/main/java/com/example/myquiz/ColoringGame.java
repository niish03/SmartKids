package com.example.myquiz;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.hazem.coloringforkids.adabters.ImageAdabter;

//import androidx.recyclerview.widget.ImageAdabter;

public class ColoringGame extends AppCompatActivity {

    RecyclerView recyclerView;
    imageadapter adabter;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coloring_game);

        androidx.appcompat.widget.Toolbar toolbar =  findViewById(R.id.toolbaroncoloring);
        setSupportActionBar(toolbar);
        int toolbar_item_color = ResourcesCompat.getColor(getResources(),R.color.blue,null);//see this
        // if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        toolbar.setTitleTextColor(toolbar_item_color);
        // }
        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        toolbar.setTitleTextColor(toolbar_item_color);
        //}
        getSupportActionBar().setTitle("MY PICTURES");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.close);


        // initTollbar();
        //initView();

        recyclerView = findViewById(R.id.recycle_view_images);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adabter = new imageadapter( this);
        recyclerView.setAdapter(adabter);

    }

    private void initView() {


    }

    @SuppressLint("RestrictedApi")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initTollbar() {


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if(id == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }
}