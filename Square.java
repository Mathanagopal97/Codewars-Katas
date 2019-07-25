/*
You're a square!

A square of squares
You like building blocks. You especially like building blocks that are squares. And what you even like more, is to arrange them into a square of square building blocks!

However, sometimes, you can't arrange them into a square. Instead, you end up with an ordinary rectangle! Those blasted things! If you just had a way to know, whether you're currently working in vain… Wait! That's it! You just have to check if your number of building blocks is a perfect square.

Task
Given an integral number, determine if it's a square number:

In mathematics, a square number or perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself.

The tests will always use some integral number, so don't worry about that in dynamic typed languages.

Examples
is_square (-1) # => false
is_square   0 # => true
is_square   3 # => false
is_square   4 # => true
is_square  25 # => true
is_square  26 # => false
isSquare(-1) returns  false
isSquare(0) returns   true
isSquare(3) returns   false
isSquare(4) returns   true
isSquare(25) returns  true  
isSquare(26) returns  false
*/

public class Square {    
    public static boolean isSquare(int n) {  
    if(n<0) return false;
    if(n==0) return true;
   /* int flag=0;
    for(int i=0;i<=n;i++)
    {
      if((i*i)==n){flag=1;break;}
    }
    if(flag==1) return true; // fix me!
    else return false;*/
    double squrt = Math.sqrt(n);
    double val = squrt - Math.floor(squrt);
    if(val ==0) return true;
    else return false;
    }


    public static void main(String[]args)
    {
        System.out.println(isSquare(25));
    }

}