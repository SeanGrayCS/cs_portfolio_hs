/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;

/**
 *
 * @author seanp
 */
public class Tree {
    
    public static void main (String[] args) {
        
        System.out.println("HashMap:\n");
        HashMap<String, String> names = new HashMap<>();
        printMap(names);
        
        System.out.println("\nTreeMap:\n");
        TreeMap<String, String> namesTree = new TreeMap<>();
        printMap(namesTree);
        
    }
    
    public static void printMap (Map<String, String> names) {
        
        names.put("Tiny Tank", "Allen");
        names.put("DMan", "Deeny");
        names.put("Bobby", "Clukey");
        names.put("Nat", "Natlie");
        names.put("GKit", "Grant");
        
        System.out.println("\tKeySet Iterator:\n");
        Set<String> keys = names.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            String value = names.get(key);
            System.out.println("\t\t" + key + " - " + value);
        }
        
        System.out.println("\n\tForEach Loop:\n");
        for (String key : names.keySet()) {
            System.out.println("\t\t" + key + " - " + names.get(key));
        }
        
        System.out.println("\n\tForEach Lambda:\n");
        names.keySet().forEach(key -> System.out.println("\t\t" + key + " - " + names.get(key)));
        
        System.out.println("\n\tForEach Anonymous Class:\n");
        names.keySet().forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                System.out.println("\t\t" + key + " - " + names.get(key));
            }
        });
        
    }
    
}
