/*
Scramblies

Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.

Notes:

Only lower case letters will be used (a-z). No punctuation or digits will be included.
Performance needs to be considered
Input strings s1 and s2 are null terminated.
Examples
scramble('rkqodlw', 'world') ==> True
scramble('cedewaraaossoqqyt', 'codewars') ==> True
scramble('katas', 'steak') ==> False
*/

import java.util.*;
public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        ArrayList<String> str1Arr = new ArrayList<String>(Arrays.asList(str1.split("")));
        int length = str2.length();        
        for(int i=0;i<str2.length();i++){
          if(str1Arr.contains("" +str2.charAt(i))){ 
            length--;
            str1Arr.remove(""+str2.charAt(i)); 
          }
          if(length==0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
      System.out.println(scramble("rkqodlw","world"));
      System.out.println(scramble("javscripts","javascript"));
    }
}