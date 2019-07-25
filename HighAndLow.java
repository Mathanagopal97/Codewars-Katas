/*
Highest and Lowest

In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

HighAndLow("1 2 3 4 5")  // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
*/

public class HighAndLow {
    public static String HighAndLowFunction(String numbers) {
      // Code here or
      int max = 0, min = 0,i=0,times=0;
      int len = numbers.length();
      while(i <len)
      {
      String test = "";
        for(int j=i;j<len;j++)
        {
          if(numbers.charAt(j) !=' ') {test=test+numbers.charAt(j);i++;}
          if(numbers.charAt(j)==' ') {i++;break;}
        }
        times++;
        int num=Integer.parseInt(test);
        if(times==1)
        {
          max=num;
          min=num;
        }
        else{
        if(max<num)max=num;
        if(min>num) min=num;
        }
      }
      return ""+max+" "+min;
    }
  

  public static void main(String[]args) {
      System.out.println(HighAndLowFunction("1 2 3 4 5"));
  }

}