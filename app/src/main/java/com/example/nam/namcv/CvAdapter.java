package com.example.nam.namcv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CvAdapter extends BaseAdapter {

    public Activity context;
    public ArrayList<Cv> cvs;
    int[] img={R.drawable.bio,R.drawable.formation,R.drawable.competence,R.drawable.experience};

    public CvAdapter(Activity context, ArrayList<Cv> cvs) {
        this.context = context;
        this.cvs = cvs;
    }

    @Override
    public int getCount() {
        return this.cvs.size();
    }

    @Override
    public Object getItem(int position) {
        return this.cvs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.cvs.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView= inflater.inflate(R.layout.cv_composition, null);
        ImageView imageViewTitre = (ImageView)
                rowView.findViewById(R.id.imageViewTitre);
        imageViewTitre.setImageResource(img[position]);

        return rowView;
    }
}
