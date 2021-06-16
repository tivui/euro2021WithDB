/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author stag
 */
public class TeamsBean {

    public HashMap<String, Equipe> equipesMap;
    public ArrayList<Equipe> equipesListe;
    private String titre;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public TeamsBean() {
        titre = "LISTE DES ÉQUIPES";

        //instanciation des objets Equipe
        
        Equipe france = new Equipe("France", "FR.png", "F");
        Equipe allemagne = new Equipe("Allemagne", "DE.png", "F");
        Equipe portugal = new Equipe("Portugal", "PT.png", "F");
        Equipe hongrie = new Equipe("Hongrie", "HU.png", "F");
        Equipe italie = new Equipe("Italie", "IT.png", "A");
        Equipe paysDeGalles = new Equipe("Pays de Galles", "_wales.png", "A");
        Equipe suisse = new Equipe("Suisse", "CH.png", "A");
        Equipe turquie = new Equipe("Turquie", "TR.png", "A");
        Equipe danemark = new Equipe("Danemark", "DK.png", "B");
        Equipe finlande = new Equipe("Finlande", "FI.png", "B");
        Equipe russie = new Equipe("Russie", "RU.png", "B");
        Equipe belgique = new Equipe("Belgique", "BE.png", "B");
        Equipe ukraine = new Equipe("Ukraine", "UA.png", "C");
        Equipe paysBas = new Equipe("Pays Bas", "NL.png", "C");
        Equipe autriche = new Equipe("Autriche", "AT.png", "C");
        Equipe macedoineDuNord = new Equipe("Macédoine du Nord", "MK.png", "C");
        Equipe angleterre = new Equipe("Angleterre", "_england.png", "D");
        Equipe croatie = new Equipe("Croatie", "HR.png", "D");
        Equipe ecosse = new Equipe("Ecosse", "_scotland.png", "D");
        Equipe republiqueTcheque = new Equipe("République Tchèque", "CZ.png", "D");
        Equipe suede = new Equipe("Suède", "SE.png", "E");
        Equipe pologne = new Equipe("Pologne", "PL.png", "E");
        Equipe espagne = new Equipe("Espagne", "ES.png", "E");
        Equipe slovaquie = new Equipe("Slovaquie", "SK.png", "E");
        
        // stockage des équipes dans une liste
        
        this.equipesListe = new ArrayList<>();
        equipesListe.add(portugal);
        equipesListe.add(hongrie);
        equipesListe.add(italie);
        equipesListe.add(paysDeGalles);
        equipesListe.add(suisse);
        equipesListe.add(turquie);
        equipesListe.add(danemark);
        equipesListe.add(finlande);
        equipesListe.add(russie);
        equipesListe.add(belgique);
        equipesListe.add(ukraine);
        equipesListe.add(paysBas);
        equipesListe.add(autriche);
        equipesListe.add(macedoineDuNord);
        equipesListe.add(angleterre);
        equipesListe.add(croatie);
        equipesListe.add(ecosse);
        equipesListe.add(republiqueTcheque);
        equipesListe.add(suede);
        equipesListe.add(pologne);
        equipesListe.add(espagne);
        equipesListe.add(france);
        equipesListe.add(allemagne);
        equipesListe.add(slovaquie);
        
        //stockage des objets dans une Map
        
        this.equipesMap = new HashMap<>();

        equipesMap.put("france", france);
        equipesMap.put("allemagne", allemagne);
        equipesMap.put("portugal", portugal);
        equipesMap.put("hongrie", hongrie);
        equipesMap.put("italie", italie);
        equipesMap.put("paysDeGalles", paysDeGalles);
        equipesMap.put("suisse", suisse);
        equipesMap.put("turquie", turquie);
        equipesMap.put("danemark", danemark);
        equipesMap.put("finlande", finlande);
        equipesMap.put("russie", russie);
        equipesMap.put("belgique", belgique);
        equipesMap.put("ukraine", ukraine);
        equipesMap.put("paysBas", paysBas);
        equipesMap.put("autriche", autriche);
        equipesMap.put("macedoineDuNord", macedoineDuNord);
        equipesMap.put("angleterre", angleterre);
        equipesMap.put("croatie", croatie);
        equipesMap.put("ecosse", ecosse);
        equipesMap.put("republiqueTcheque", republiqueTcheque);
        equipesMap.put("suede", suede);
        equipesMap.put("espagne", espagne);
        equipesMap.put("slovaquie", slovaquie);
        equipesMap.put("pologne", pologne);
    }

    public HashMap<String, Equipe> getEquipesMap() {
        return equipesMap;
    }

    public void setEquipesMap(HashMap<String, Equipe> equipesMap) {
        this.equipesMap = equipesMap;
    }

    public ArrayList<Equipe> getEquipesListe() {
        return equipesListe;
    }

    public void setEquipesListe(ArrayList<Equipe> equipesListe) {
        this.equipesListe = equipesListe;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
