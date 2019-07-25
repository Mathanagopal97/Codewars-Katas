/*
Quadratic Roots
Given A, B, and C, your job is to plug it into the Quadratic formula and return both the roots. The Quadratic formula can be found here: https://en.wikipedia.org/wiki/Quadratic_formula

NOTE: It should return None/null if the roots are imaginary, and the first number it returns should be the smallest number.

/* 
In Java quadrad should return a string of the roots as doubles (in ascending
order) separated by spaces. If the roots are equal, it should return only one
double in the string.


Quadratic.quadrad(1.0, 1.0, -2.0) => "1.0 -2.0"
Quadratic.quadrad(1.0, 2.0, 1.0) => "-1.0"
Quadratic.quadrad(1, 2, 1) => "-1.0"
Quadratic.quadrad(1, 4, 5) => null
*/

public class Quadratic {
	public static String quadrad(double a, double b, double c) {
      double d = Math.pow((b * b) - (4 * a * c), 0.5);
      if(Double.isNaN(d)) return null;
      double root1 = (d - b)/(2 * a);
      double root2 = ((d + b) * -1)/(2 * a);
      if(root1!=root2)
        return root1 > root2 ? root2+" "+root1 : root1 + " " + root2;
      else
        return ""+root1;
  }

  public static void main(String[] args) {
      System.out.println(quadrad(1.0, 1.0, -2.0));
  }
}