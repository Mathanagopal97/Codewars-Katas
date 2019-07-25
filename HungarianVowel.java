/*
Hungarian Vowel Harmony

Vowel harmony is a phenomenon in some languages. It means that "A vowel or vowels in a word are changed to sound the same (thus "in harmony.")" (wikipedia). This kata is based on vowel harmony in Hungarian.

Task:
Your goal is to create a function dative() (Dative() in C#) which returns the valid form of a valid Hungarian word w in dative case i. e. append the correct suffix nek or nak to the word w based on vowel harmony rules.

Vowel Harmony Rules (simplified)
When the last vowel in the word is

a front vowel (e, é, i, í, ö, ő, ü, ű) the suffix is -nek
a back vowel (a, á, o, ó, u, ú) the suffix is -nak
Examples:
Kata.dative("ablak") == "ablaknak"
Kata.dative("szék") == "széknek"
Kata.dative("otthon") == "otthonnak"
Preconditions:
To keep it simple: All words end with a consonant :)
All strings are unicode strings.
There are no grammatical exceptions in the tests.
*/

public class HungarianVowel {
    public static String dative(String word) {
        // Implement me! :)
        String lastVowel="";
        for(int i=0;i<word.length();i++){
        char ch = word.charAt(i);
        if(ch=='e' || ch=='é'||ch=='i' || ch=='í' || ch=='ö' 
        || ch=='ő' || ch=='ü' || ch=='ű' || ch=='a' || ch=='á'  
        || ch=='o' || ch=='ó' || ch=='u' || ch=='ú')
          lastVowel  = ""+ch;
        }
        //a, á, o, ó, u, ú
        if(lastVowel.equals("a")||lastVowel.equals("á")||lastVowel.equals("o")||lastVowel.equals("ó")||lastVowel.equals("u")||lastVowel.equals("ú")){
        return word+"nak";
        }
        else{
        return word+"nek";
        }
    }

    public static void main(String[] args) {
        System.out.println(dative("otthon"));
    }
}