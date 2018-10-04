/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
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
        Integer[] data = {1, -1, 0, 3, 1, 1, 1, 0, 4, 5, 7, 2, -1, 4, 3, 2, 0, 1};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        histogr.entrySet().forEach((entry) -> {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }); 
    }
}
