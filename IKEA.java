/*

One day you decide to go to IKEA to buy yourself a couple of tables for your new house, and you want to make sure that you get enough screws to successfully assemble and put together all of your newly-bought tables. Let's also assume that for every table you buy, the next table will be bigger than the previous one, thus requiring one more screw. For example, table number 1 requires 1 screw, table number 2 requires 2 screws and so forth.

Make a boolean method called checkEnoughScrews with an input of total screws and tables that returns True if there are enough screws to assemble the tables, or return False otherwise.
*/

public class IKEA {
    public static boolean checkEnoughScrews(int tables, int screws) {
      int sum=0;
      for(int i =1;i<=tables;i++){
        sum=sum+i;
      }
      if(sum<=screws){ 
          return true;
        }
      return false;
    }

    public static void main(String[] args) {
        System.out.println(checkEnoughScrews(6, 20));
    }
  }