package com.example.nam.namcv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FormationActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation);
        ImageView image = (ImageView) findViewById(R.id.imageViewFormation);
        image.setImageResource(R.drawable.formation);
        ListView listView1 = (ListView) findViewById(R.id.listViewFormation);
        ArrayList<String> listFormation = new ArrayList<>();
        listFormation.add("2017-2018| BAC +3\nCFA Insta  Analyste Logiciels");
        listFormation.add("2016-2017| BAC +2\nCFA Insta  BTS Service Informatique aux Organisations");
        listFormation.add("2015-2016| BAC +1\nUPMC Mathématiques Informatique Physique Ingénierie");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listFormation);
        listView1.setAdapter(arrayAdapter);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
