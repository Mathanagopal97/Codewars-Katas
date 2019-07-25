/*
Square Every Digit

Welcome. In this kata, you are asked to square every digit of a number.

For example, if we run 9119 through the function, 811181 will come out,
because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
*/

public class SquareDigit {
    public static int squareDigits(int n) {
      String input = "" +n;
      String output = "";
      for(int i=0;i<input.length();i++){
          String val = ""+input.charAt(i);
          int ans = Integer.parseInt(val);
          ans = ans*ans;
          output = output+ans;
      }
      return Integer.parseInt(output);
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(445));
    }
  }