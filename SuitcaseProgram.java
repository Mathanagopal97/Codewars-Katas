/*

Mr. Square is going on a holiday. He wants to bring 2 of his favorite squares with him, so he put them in his rectangle suitcase.

Write a function that, given the size of the squares and the suitcase, return whether the squares can fit inside the suitcase.

fit_in(a,b,m,n)
a,b are the sizes of the squares
m,n are the sizes of the suitcase
Example
fit_in(1,2,3,2) should return True
fit_in(1,2,2,1) should return False
fit_in(3,2,3,2) should return False
fit_in(1,2,1,2) should return False
*/

public class SuitcaseProgram {
    public static Boolean fit_in(int a, int b, int m, int n) {
        return ((a+b)<=n&&(a<=m&&b<=m))||((a+b)<=m&&(a<=n&&b<=n));
    }

    public static void main(String[] args) {
        System.out.println(fit_in(1,2,1,2));
    }
}