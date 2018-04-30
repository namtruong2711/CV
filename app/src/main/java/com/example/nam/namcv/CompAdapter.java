package com.example.nam.namcv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CompAdapter extends BaseAdapter {

    public Activity context;
    public ArrayList<Competences> competences;

    public CompAdapter(Activity context, ArrayList<Competences> competences) {
        this.context = context;
        this.competences = competences;
    }

    @Override
    public int getCount() {
        return this.competences.size();
    }

    @Override
    public Object getItem(int position) {
        return this.competences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.competences.get(position).hashCode();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView= inflater.inflate(R.layout.comp_item, null);
        TextView textView = (TextView)
                rowView.findViewById(R.id.textViewCompNom);
        textView.setText(this.competences.get(position).toStringNom());

        /*TextView textView1 = (TextView)
                rowView.findViewById(R.id.textViewMaitrise);
        textView1.setText(this.competences.get(position).toStringMaitrise());*/

        RatingBar ratingBar = (RatingBar)
                rowView.findViewById(R.id.ratingBar);
        ratingBar.setNumStars(5);
        ratingBar.setRating(this.competences.get(position).getMaitrise());


        return rowView;
    }

}
