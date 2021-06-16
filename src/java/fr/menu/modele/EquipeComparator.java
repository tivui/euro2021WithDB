/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.util.Comparator;

/**
 *
 * @author stag
 */
public class EquipeComparator implements Comparator<Equipe> {
    @Override
    public int compare(Equipe e1, Equipe e2) {
        return e1.getCountry().compareTo(e2.getCountry());
    }
}

