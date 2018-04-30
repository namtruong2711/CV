package com.example.nam.namcv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class CompActivity extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competence);
        ImageView image = (ImageView) findViewById(R.id.imageViewCompDetails);
        image.setImageResource(R.drawable.competence);
        ArrayList<Competences> competences = new ArrayList<Competences>();

        competences.add(new Competences("Php-Html-Css",4));
        competences.add(new Competences("Java",4));
        competences.add(new Competences("Javascript",4));
        competences.add(new Competences("C#",3));
        competences.add(new Competences("Android",4));
        competences.add(new Competences("Laravel",3));
        competences.add(new Competences("Symfony",3));
        competences.add(new Competences("MySql",4));


        ListView listView2 = (ListView) findViewById(R.id.listViewComps);
        CompAdapter adapter = new CompAdapter(this, competences);
        listView2.setAdapter(adapter);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
