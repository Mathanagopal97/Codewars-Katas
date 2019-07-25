/*
Description:
Encrypt this!

You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:

Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
The first letter needs to be converted to its ASCII code.
The second letter needs to be switched with the last letter
Keepin' it simple: There are no special characters in input.
Examples:
Kata.encryptThis("Hello") => "72olle"
Kata.encryptThis("good") => "103doo"
Kata.encryptThis("hello world") => "104olle 119drlo"
*/

public class EncryptProgram {
    public static String Encrypt(String input){
      String output="";
      int first = (int) input.charAt(0);
      output = output+first;//Ascii
      if(input.length()==1) return output.trim();
      
      else if(input.length()==2) {
      output = output+input.charAt(1);
      return output.trim();
      }
      
      output = output+input.charAt(input.length()-1);//Appending the last letter of the world
      for(int i=2;i<input.length()-1;i++){
        output = output+input.charAt(i);
      }
      output = output+input.charAt(1);
      return output.trim();
    }
      public static String encryptThis(String text) {
          System.out.println("Before Encryption: "+text);
          String output="";
          for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            String inter = "";
            while(ch!=' '){
              inter = inter+ch;
              i++;
             if(i<text.length()) ch = text.charAt(i);
             else break;
            }
            if(!inter.isEmpty()){
            String append = Encrypt(inter);
            if(i<text.length()) output = output+append+" ";
            else output = output+append;
            }
            else output = output+" ";
          }
          output = output.replaceAll("\\s+$","");;
          return output;
      }

      public static void main(String[] args) {
          System.out.println("After encryption: "+encryptThis("hello world"));
      }
  }