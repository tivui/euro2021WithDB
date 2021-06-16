/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

public class ProfilBean {
    private String nom;
    private String prenom;
    private String email;
    
    public static ProfilBean profil;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom!=null)
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        if (prenom!=null)
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email!=null)
        this.email = email;
    }

    private ProfilBean() {
        this.nom = "";
        this.prenom= "";
        this.email= "";
    }
    
    public static ProfilBean getProfil() {
        if (profil== null) {
            profil = new ProfilBean();
        }
        return profil;
    }
}
