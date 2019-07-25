/*
Resistor Color Codes, Part 2

Overview
Resistors are electrical components marked with colorful stripes/bands to indicate both their resistance value in ohms and how tight a tolerance that value has. If you did my Resistor Color Codes kata, you wrote a function which took a string containing a resistor's band colors, and returned a string identifying the resistor's ohms and tolerance values.

Well, now you need that in reverse: The previous owner of your "Beyond-Ultimate Raspberry Pi Starter Kit" (as featured in my Fizz Buzz Cuckoo Clock kata) had emptied all the tiny labeled zip-lock bags of components into the box, so that for each resistor you need for a project, instead of looking for text on a label, you need to find one with the sequence of band colors that matches the ohms value you need.

The resistor color codes
You can see this Wikipedia page for a colorful chart, but the basic resistor color codes are:

0: black, 1: brown, 2: red, 3: orange, 4: yellow, 5: green, 6: blue, 7: violet, 8: gray, 9: white

All resistors have at least three bands, with the first and second bands indicating the first two digits of the ohms value, and the third indicating the power of ten to multiply them by, for example a resistor with a value of 47 ohms, which equals 47 * 10^0 ohms, would have the three bands "yellow violet black".

Most resistors also have a fourth band indicating tolerance -- in an electronics kit like yours, the tolerance will always be 5%, which is indicated by a gold band. So in your kit, the 47-ohm resistor in the above paragraph would have the four bands "yellow violet black gold".

Your mission
Your function will receive a string containing the ohms value you need, followed by a space and the word "ohms" (to avoid Codewars unicode headaches I'm just using the word instead of the ohms unicode symbol). The way an ohms value is formatted depends on the magnitude of the value:

For resistors less than 1000 ohms, the ohms value is just formatted as the plain number. For example, with the 47-ohm resistor above, your function would receive the string "47 ohms", and return the string `"yellow violet black gold".

For resistors greater than or equal to 1000 ohms, but less than 1000000 ohms, the ohms value is divided by 1000, and has a lower-case "k" after it. For example, if your function received the string "4.7k ohms", it would need to return the string "yellow violet red gold".

For resistors of 1000000 ohms or greater, the ohms value is divided by 1000000, and has an upper-case "M" after it. For example, if your function received the string "1M ohms", it would need to return the string "brown black green gold".

Test case resistor values will all be between 10 ohms and 990M ohms.

More examples, featuring some common resistor values from your kit
"10 ohms"        "brown black black gold"
"100 ohms"       "brown black brown gold"
"220 ohms"       "red red brown gold"
"330 ohms"       "orange orange brown gold"
"470 ohms"       "yellow violet brown gold"
"680 ohms"       "blue gray brown gold"
"1k ohms"        "brown black red gold"
"10k ohms"       "brown black orange gold"
"22k ohms"       "red red orange gold"
"47k ohms"       "yellow violet orange gold"
"100k ohms"      "brown black yellow gold"
"330k ohms"      "orange orange yellow gold"
"2M ohms"        "red black green gold"
*/



public class EncodeResistorColors {
    static String firstTwo = "";
    static int powerOfTenStr = 0;
    public static void powerOfTen(int number){
          String num = ""+number;
          int count=0,i=0;
          for(i=num.length()-1;i>=0;i--){
             if(i==1) break;
             if(num.charAt(i)=='0') count++;
             if(num.charAt(i)!='0') break;
          }
          firstTwo = ""+num.substring(0,i+1);
          powerOfTenStr = count;
       }
    public static String bandName(int bandNum){
      switch(bandNum){
        case 0 : return "black";
        case 1 : return "brown"; 
        case 2 : return "red"; 
        case 3 : return "orange"; 
        case 4 : return "yellow"; 
        case 5 : return "green"; 
        case 6 : return "blue"; 
        case 7 : return "violet";
        case 8 : return "gray"; 
        case 9 : return "white"; 
      }
      return "";
    }
    public static String encodeResistorColors(String ohmsString) {
            // your code here
            String partOne = ohmsString.split(" ")[0];
            if(partOne.contains("k")){
              if(partOne.contains(".")){
                partOne = partOne.replaceAll("\\.", "/*/");
                partOne = partOne + "00";
              }
              else{
                partOne = partOne.replaceAll("[^\\d.]", "");
                partOne = partOne+"000";
              }
            }
            if(partOne.contains("M")){
              if(partOne.contains(".")){
                partOne = partOne.replaceAll("\\.", "/*/");
                partOne = partOne+"00000";
              }
              else{
                partOne = partOne.replaceAll("[^\\d.]", "");
                partOne = partOne+"000000";
              }
            }          
            partOne = partOne.replaceAll("[^\\d.]", "");
            powerOfTen(Integer.parseInt(partOne));
            
            int firstBand = Integer.parseInt(""+firstTwo.charAt(0));
            int secondBand = Integer.parseInt(""+firstTwo.charAt(1));        
            return ""+bandName(firstBand)+" "+bandName(secondBand)+" "+bandName(powerOfTenStr)+" "+"gold";
    }

    public static void main(String[]args){
          System.out.println(encodeResistorColors("4.7M ohms"));
    }
}