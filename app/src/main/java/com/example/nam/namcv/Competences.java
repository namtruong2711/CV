package com.example.nam.namcv;

import java.io.Serializable;

public class Competences implements Serializable {


    private String competence;
    private int maitrise;

    public Competences(String competence, int maitrise) {
        this.competence = competence;
        this.maitrise = maitrise;
    }

    public String toStringNom(){

        return "Compétence en "+getCompetence();
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public int getMaitrise() {
        return maitrise;
    }

    public void setMaitrise(int maitrise) {
        this.maitrise = maitrise;
    }
}
