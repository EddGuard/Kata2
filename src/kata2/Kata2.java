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
        int[] data;
        data = new int[] {1, -1, 0, 3, 1, 1, 1, 0, 4, 5, 7, 2, -1, 4, 3, 2, 0, 1};
        Map<Integer, Integer> histogram; 
        histogram = new HashMap<>();
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        histogram.entrySet().forEach((entry) -> {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }); 
    }
}
