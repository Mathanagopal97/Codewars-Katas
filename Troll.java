/* 
Disemvowel Trolls 7kyu

Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
Note: for this kata y isn't considered a vowel.
*/

public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String output = "";
        for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&
            ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'){
            output = output+ch;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
}