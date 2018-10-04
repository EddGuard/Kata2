/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {"Rojo", "Blanco", "Negro", "Azul", "Rojo", "Rojo", "Rojo", "Negro", "Rosa", "Gris", "Verde", "Amarillo", "Blanco", "Rosa", "Azul", "Amarillo", "Negro", "Rojo"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        histogr.entrySet().forEach((entry) -> {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }); 
    }
}
