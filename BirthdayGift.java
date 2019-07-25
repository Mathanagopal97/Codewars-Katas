/*
Happy Birthday <Beta>

The legend says:"That when a child turns so many years old as in his name and surname of letters, parents give him the best gift!"

My name is Iachimciuc Bogdan, and at the age of 16 I received the best gift!

Iachimciuc Bogdan = 16 (letters);

Now you have to understand through what logarithm I recognized it!
*/

public class BirthdayGift {
    public static int yakim(String words) {
    words = words.replaceAll(" ","");
    words = words.replaceAll("[^A-Za-z]","");
    return words.length();
    }

    public static void main(String[] args) {
        System.out.println(yakim("Mathana gopal"));;
    }
  }