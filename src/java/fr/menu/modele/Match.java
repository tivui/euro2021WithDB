/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.util.HashMap;

/**
 *
 * @author stag
 */
public class Match {

    private Stade stade;
    private String date;
    private String horaire;
    private Equipe equipe1;
    private Equipe equipe2;
    private int scoreEquipe1;
    private int scoreEquipe2;
    private boolean isPlayed;
    private boolean isPhaseDeGroupe;

    public Match() {
    }

    public Stade getStade() {
        return stade;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public String getHoraire() {
        return horaire;
    }


    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public Match(Stade stade, String date, String horaire, Equipe equipe1, Equipe equipe2) {
        this.stade = stade;
        this.date = date;
        this.horaire = horaire;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.isPlayed = false;
        this.isPhaseDeGroupe = true;
    }

    public Match(Stade stade, String date, String horaire, Equipe equipe1, Equipe equipe2, int scoreEquipe1, int scoreEquipe2) {
        this.stade = stade;
        this.date = date;
        this.horaire = horaire;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;
        this.isPlayed = true;
        this.isPhaseDeGroupe = true;
        this.updatePoints();
        this.updateNbMatchsPlayed();
        this.updateDifferenceButs();
    }

    public Match(Stade stade, String date, String horaire) {
        this.stade = stade;
        this.date = date;
        this.horaire = horaire;
        this.isPlayed = false;
        this.isPhaseDeGroupe = false;
    }

    public boolean isIsPhaseDeGroupe() {
        return isPhaseDeGroupe;
    }

    public void setIsPhaseDeGroupe(boolean isPhaseDeGroupe) {
        this.isPhaseDeGroupe = isPhaseDeGroupe;
    }

    public int getScoreEquipe1() {
        return scoreEquipe1;
    }

    public void setScoreEquipe1(int scoreEquipe1) {
        this.scoreEquipe1 = scoreEquipe1;
    }

    public int getScoreEquipe2() {
        return scoreEquipe2;
    }

    public void setScoreEquipe2(int scoreEquipe2) {
        this.scoreEquipe2 = scoreEquipe2;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getIsPlayed() {
        return isPlayed;
    }



    public void updatePoints() {
        if (scoreEquipe1 > scoreEquipe2) {
            equipe1.setNbPoints(3);
        } else {
            if (scoreEquipe1 == scoreEquipe2) {
                equipe1.setNbPoints(1);
                equipe2.setNbPoints(1);
            } else {
                equipe2.setNbPoints(3);
            }
        }
    }
    
    public void updateNbMatchsPlayed() {
        equipe1.updateNbMatchsPlayed();
        equipe2.updateNbMatchsPlayed();
    }
    
    public void updateDifferenceButs() {
        equipe1.updateDifferenceButs(scoreEquipe1, scoreEquipe2);
        equipe2.updateDifferenceButs(scoreEquipe2, scoreEquipe1);
    }
    
}
