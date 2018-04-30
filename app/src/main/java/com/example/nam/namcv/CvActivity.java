package com.example.nam.namcv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

public class CvActivity extends Activity {

    TextView textViewNom;
    TextView textEmail;
    TextView textMobile;
    ImageView imageComp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bio);

        imageComp = (ImageView) findViewById(R.id.imageViewBioDetails);
        textViewNom = (TextView) findViewById(R.id.textViewNomPrenom);
        textEmail = (TextView) findViewById(R.id.textViewEmail);
        textMobile = (TextView) findViewById(R.id.textViewMobile);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent= getIntent();
        Cv cv = (Cv) intent.getSerializableExtra("bioSelected");
        updateView((cv));
    }

    private void updateView(Cv c){
        imageComp.setImageResource(R.drawable.bio);
        textViewNom.setText("Nom Prénom: TRUONG Hai Nam - Développeur");
        textEmail.setText("Email: nam2711@hotmail.fr");
        textMobile.setText("Mobile: 06.73.08.74.68");
    }
}
