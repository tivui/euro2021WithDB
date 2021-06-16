/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

/**
 *
 * @author stag
 */
public class Stade {
    
    private String ville;
    private String stade;
    private Integer capacite;

    public Stade() {
        
    }

    public Stade(String ville, String stade, Integer capacite) {
        this.ville = ville;
        this.stade = stade;
        this.capacite = capacite;
    }

    
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getStade() {
        return stade;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
