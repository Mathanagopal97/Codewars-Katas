/*
Welcome to the Codewars Bar!
Codewars Bar recommends you drink 1 glass of water per standard drink so you're not hungover tomorrow morning.

Your fellow coders have bought you several drinks tonight in the form of a string. Return a string suggesting how many glasses of water you should drink to not be hungover.

Example parties:
Input 0:
"1 beer"

Output 0:
"1 glass of water"

Explaination 0:
You drank one standard drink

Input 1:
"1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"

Output 1:
"10 glasses of water"

Explaination 1:
You drank ten standard drinks
*/

import java.util.*;
public class DrinkingProgram {
    public static String hydrate(String drinkString) {
        // Insert party here
        int sum = 0;
        drinkString=drinkString.replaceAll("[^-?0-9]+"," ");
        System.out.println(Arrays.asList(drinkString.trim().split(" ")));
        for(int i=0;i<drinkString.length();i++){
          char ch = drinkString.charAt(i);
          String inter = "";
          while(ch!=' '){
            inter = inter+ch;i++;
            ch = drinkString.charAt(i);
          }
          int a = Integer.parseInt(inter);
          sum = sum+a;
        }
        if(sum == 1) return sum+" glass of water";
        else return sum+" glasses of water";
    }

    public static void main(String[] args) {
      System.out.println(hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer"));
    }
}