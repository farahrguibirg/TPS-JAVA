package TP5;

import java.util.*;

class FrequenceMots {
    public static Map<String, Integer> compterFrequence(String[] mots) {
        Map<String, Integer> frequenceMap = new HashMap<>();
        
        for (String mot : mots) {
            Integer frequence = frequenceMap.get(mot);
            if (frequence == null) {
                frequenceMap.put(mot, 1);
            } else {
                frequenceMap.put(mot, frequence + 1);
            }
        }
        
        return frequenceMap;
    }
    
    public static void main(String[] args) {
        String[] mots = {"java", "python", "java", "c++", "python", "java", "javascript"};
        Map<String, Integer> frequences = compterFrequence(mots);
        System.out.println("Fréquences des mots: " + frequences);
    }
}