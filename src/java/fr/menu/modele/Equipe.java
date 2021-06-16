/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.io.Serializable;

/**
 *
 * @author stag
 */
public class Equipe implements Serializable  {
    
    
    private String country;
    private String flagName;
    private String groupe;
    private int nbPoints;
    private int diffButs;
    private int nbMatchsPlayed;
    

    public Equipe() {
        
    }
    
    public Equipe (String country, String flagName) {
        this.country = country;
        this.flagName = flagName;
    }

    public Equipe(String country, String flagName, String groupe) {
        this.country = country;
        this.flagName = flagName;
        this.groupe = groupe;
    }
    


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public int getNbMatchsPlayed() {
        return nbMatchsPlayed;
    }

    public void setNbMatchsPlayed(int nbMatchsPlayed) {
        this.nbMatchsPlayed = nbMatchsPlayed;
    }

    @Override
    public String toString() {
        return "Equipe{" + "country=" + country + ", flagName=" + flagName + '}';
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public int getDiffButs() {
        return diffButs;
    }

    public void setDiffButs(int diffButs) {
        this.diffButs = diffButs;
    }
    
    public void updateNbMatchsPlayed() {
        this.nbMatchsPlayed++;
    }
    
    public void updateDifferenceButs(int butsEnPlus, int butsEnMoins) {
        this.diffButs += (butsEnPlus - butsEnMoins);
    }
}