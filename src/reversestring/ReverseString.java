/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String introduction = "Hi My name is Tina";
        reverse(introduction);
    }

    public static String reverse(String str) {
        
        String test = "";
        int items = str.length()-1;
        
        for (int i = items; i<=0; i--) {
            test += str.charAt(i);
        }
         System.out.println(test);
        
        if (str instanceof String) {
            if (str.length() > 2) {
                String reverse = new StringBuffer(str).reverse().toString();
                System.out.println(reverse);
                return reverse;
            }
            return str;
        }
        return "Please enter a string";

    }
}
