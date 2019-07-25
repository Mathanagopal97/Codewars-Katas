/*
Convert your name to Japanese! (Game) <Beta>

You receive an name in the ASCII set of characters and translate it with a provided table in wich you should transform character by character. This is no real japanese but the idea is to make it sound like a Japanese name.

Notes:

The i-th letter in the latin alphabet maps to the i-th (assuming 1-based indexing) element in the table.
Upper-case letters are to be transformed too in a way that "Jhon Cena" gives exactly the same as "jhon cena".
*/

public class JapaneseName {

    static String[] alphabet = new String[]{
        "ka", "zu", "mi", "te", "ku",
        "lu", "ji", "ri", "ki", "zusu",
        "me", "ta", "rin", "to", "mo",
        "no", "ke", "shi", "ari", "chi",
        "do", "ru", "mei", "na", "fu", "zi"
    };

    static String asciiConvertToJapanese(String name) {
        String output = new String();
        int spaceCount=0;
        System.out.println("Given Name: "+name);
        if(name==null) return "";
        if(name.equals("")) return "";
        for(int i=0;i<name.length();i++){
        char ch = name.charAt(i);
        if(ch==' ') {output=output+" ";spaceCount=0;}
        else if(spaceCount==0 || i==0){
          ch = Character.toUpperCase(ch);
          int index = (int) ch;
          if(index<=64||index>=91) return "Only ASCII";
          String inter = alphabet[index-65];
          String str = ""+ inter.charAt(0);
          String str2 = str.toUpperCase();
          inter = inter.replace(str,str2);
          for(int k=0;k<inter.length();k++){
          output = output+inter.charAt(k);
          spaceCount=1;
          }
        }
        else{
        ch = Character.toLowerCase(ch);
        int index = (int) ch;
        if(index<=96||index>=123) return "Only ASCII";
        output = output+alphabet[index-97];
        }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Japanese Name: "+asciiConvertToJapanese("Mathana Gopal"));
    }
}