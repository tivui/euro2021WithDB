/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.menu.modele;

import java.util.Comparator;
import java.util.HashMap;

/**
 *
 * @author stag
 */
public class EquipeMapComparator<String, Equipe> implements Comparator<String> {

    HashMap<String, Equipe> mapToSort;
    Comparator<Equipe> valueComparator;

    public EquipeMapComparator(HashMap<String, Equipe> mapToSort, Comparator<Equipe> valueComparator) {
        this.mapToSort = mapToSort;
    }

    @Override
    public int compare(String key1, String key2) {
        return valueComparator.compare(mapToSort.get(key1), mapToSort.get(key2));
    }

}
