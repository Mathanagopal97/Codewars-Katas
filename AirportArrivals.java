/*
You are at the airport staring blankly at the arrivals/departures flap display...


How it works
You notice that each flap character is on some kind of a rotor and the order of characters on each rotor is:

ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+ *\/0123456789

And after a long while you deduce that the display works like this:

Starting from the left, all rotors (from the current one to the end of the line) flap together until the left-most rotor character is correct.
Then the mechanism advances by 1 rotor to the right...
...REPEAT this rotor procedure until the whole line is updated
...REPEAT this line procedure from top to bottom until the whole display is updated
Example
Consider a flap display with 3 rotors and one 1 line which currently spells CAT

Step 1 (current rotor is 1)
Flap x 1
Now line says DBU
Step 2 (current rotor is 2)
Flap x 13
Now line says DO)
Step 3 (current rotor is 3)
Flap x 27
Now line says DOG
This can be represented as

lines  // array of strings. Each string is a display line of the initial configuration
rotors // array of array-of-rotor-values. Each array-of-rotor-values is applied to the corresponding display line
result // array of strings. Each string is a display line of the final configuration
e.g.

lines = ["CAT"]
rotors = [[1,13,27]]
result = ["DOG"]
Kata Task
Given the initial display lines and the rotor moves for each line, determine what the board will say after it has been fully updated.

For your convenience the characters of each rotor are in the pre-loaded constant ALPHABET which is a string.

*/

class AirportArrivals {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";//Include the space at the exact location!!!
     public static String rotateOnce(String input, int rotor){
        String output="";
        for(int i=0;i<input.length();i++){
           char ch = input.charAt(i);
           int index=ALPHABET.indexOf(ch);
           index = index+rotor;
           while(index>ALPHABET.length()-1) index = index-ALPHABET.length();
           output = output+ALPHABET.charAt(index); 
        }
        return output;
     }
    
     public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
        String[] ans = new String[lines.length];
        String output="";String finalres = "";
        for(int i=0;i<lines.length;i++){
        String tstcase = lines[i];
        for(int j=0;j<tstcase.length();j++) {
           int rtr = rotors[i][j];
           output = rotateOnce(tstcase,rtr);
           tstcase = output;
           finalres = finalres+output.charAt(j);
           }
           ans[i] = finalres;
           finalres="";
        }
        return ans;
     }

     public static void main(String[] args) {
         String[] after = flapDisplay(new String[]{"HELLO "}, new int[][]{{15,49,50,48,43,13}});
         for(String str : after)
            System.out.print(str);
     }
  } 