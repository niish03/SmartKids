package com.example.myquiz;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Random;

public class CatGridAdapter extends BaseAdapter {
    private List<String> catList;

    public CatGridAdapter(List<String> catList) {
        this.catList = catList;
    }

    @Override
    public int getCount() { return catList.size(); }

    @Override
    public Object getItem(int position) { return null; }

    @Override
    public long getItemId(int position) { return 0; }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {

        View view;
        if(convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item_layout,parent,false);
        }
        else{
            view = convertView;
        }

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(position){
                    case 0:
                        Toast.makeText(view.getContext(), "Building in progress, you get lost sir", Toast.LENGTH_SHORT).show();
                            break;
                    case 1:
                        Intent intent = new Intent(parent.getContext(),ColoringGame.class);
                        intent.putExtra("CATEGORY",catList.get(position));
                        parent.getContext().startActivity(intent);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        intent = new Intent(parent.getContext(), QuestionActivity.class);
                        intent.putExtra("CATEGORY",catList.get(position));
                        parent.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(parent.getContext(), MemoryGame.class);
                        intent.putExtra("CATEGORY",catList.get(position));
                        parent.getContext().startActivity(intent);
                        break;
                }
            }
        });

        ((TextView) view.findViewById(R.id.catName)).setText(catList.get(position));
        Random rnd = new Random();
        int color = Color.argb(255,rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255));
        view.setBackgroundColor(color);
        return view;
    }
}
