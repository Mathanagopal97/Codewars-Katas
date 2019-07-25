/*
There exist two zeroes: +0 (or just 0) and -0.

Write a function that returns true if the input number is -0 and false otherwise (True and False for Python).

In JavaScript / TypeScript / Coffeescript the input will be a number.

In Python / Java / C / NASM / Haskell / the input will be a float.
*/

public class NegativeZeroValidator {
    public static boolean isNegativeZero(float n) {
        String dum = ""+n;
        if(Math.abs(n)==n &&Math.abs(n)==0 && dum.charAt(0)=='-'){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isNegativeZero(-0f));
    }
}