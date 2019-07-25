/* 
Beginner Series #3 Sum of Numbers

Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples
GetSum(1, 0) == 1   // 1 + 0 = 1
GetSum(1, 2) == 3   // 1 + 2 = 3
GetSum(0, 1) == 1   // 0 + 1 = 1
GetSum(1, 1) == 1   // 1 Since both are same
GetSum(-1, 0) == -1 // -1 + 0 = -1
GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
*/

public class Sum
  {
     public static int GetSum(int a, int b)
     {
      //Good luck!
      int sum=0;
      if(a==b) return a;
      if(a>b){
      int temp = a;
      a=b;
      b=temp;
      }
      //System.out.println(a+" "+b);
      
      int i=a;
      while(i<=b){
        sum= sum+i;
        i++;
      }
      return sum;
     }

     public static void main(String[]args) {
         System.out.println(GetSum(1,1));
         
     }
  }