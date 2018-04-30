package com.example.nam.namcv;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Cv> cvs = new ArrayList<Cv>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cvs.add(new Cv("Bio",R.drawable.ic_launcher_background));
        cvs.add(new Cv("Formation",R.drawable.ic_launcher_foreground));
        cvs.add(new Cv("Compétences",R.drawable.ic_launcher_foreground));
        cvs.add(new Cv("Expérience",R.drawable.ic_launcher_background));

        ListView listView = (ListView) findViewById(R.id.listViewTitre);
        CvAdapter adapter = new CvAdapter(this, cvs);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Cv c = cvs.get(position);
        switch (position){

            case 0:
                Intent intent= new Intent(getApplicationContext(), CvActivity.class);
                intent.putExtra("bioSelected", c);
                startActivity(intent);
                break;

            case 1:

                Intent intent1= new Intent(getApplicationContext(), FormationActivity.class);
                startActivity(intent1);
                break;

            case 2:

                Intent intent2= new Intent(getApplicationContext(), CompActivity.class);
                startActivity(intent2);

                break;

            case 3:

                Intent intent3= new Intent(getApplicationContext(), ExperienceActivity.class);
                startActivity(intent3);
                break;
        }

    }
}
