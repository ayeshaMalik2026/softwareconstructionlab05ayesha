/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFormatter {

    /**
     * Mutating method that explicitly sorts the list passed into it in-place.
     * 
     * @param lst the list of strings to be sorted in place
     */
    public static void sortInPlace(List<String> lst) {
        if (lst != null) {
            Collections.sort(lst);
        }
    }

    /**
     * Non-mutating method that returns a new list with all strings converted to lowercase.
     * The original list passed as a parameter remains untouched.
     * 
     * @param lst the original list of strings
     * @return a new list containing lowercase versions of all strings
     */
    public static List<String> toLowerCase(List<String> lst) {
        List<String> lowerList = new ArrayList<>();
        if (lst != null) {
            for (String str : lst) {
                lowerList.add(str != null ? str.toLowerCase() : null);
            }
        }
        return lowerList;
    }
}
