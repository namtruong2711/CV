package com.example.nam.namcv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ExperienceActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experience);
        ImageView image = (ImageView) findViewById(R.id.imageViewExperience);
        image.setImageResource(R.drawable.experience);
        ListView listView3 = (ListView) findViewById(R.id.listViewExperience);
        ArrayList<String> listExperience = new ArrayList<>();
        listExperience.add("2017-2018| Alternance\nSynova France  Développeur");
        listExperience.add("2016-2017| Alternance\nTTSystèmes  Technicien, développeur");
        listExperience.add("2015-2016| Stage\nTTSystèmes  Technicien");

        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listExperience);
        listView3.setAdapter(arrayAdapter3);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
