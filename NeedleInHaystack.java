/*
Find something in an Array

Create a find function that takes a string and an array as arguments. If the string is in the array, return true.

For example:

NeedleInHaystack.find("hello", new String[]{"bye bye", "hello"})  // return true
// the haystack (searchable array) will never be null, but could contain null values;
NeedleInHaystack.find("be", new String[]{"careful", null, "oops"})  // return false
// also the needle could be null too
NeedleInHaystack.find(null, new String[]{"watch", "for", null})  // return true
Note: "Hello" !== "hello" // case-sensitive comparison
*/

public class NeedleInHaystack {
    public static boolean isNullOrEmpty(String str) {
       if(str != null && !str.isEmpty())
          return false;
       return true;
    }
 
   public static boolean find(String needle, String[] haystack) {
     for(int i=0;i<haystack.length;i++){
          if(isNullOrEmpty(haystack[i]) && isNullOrEmpty(needle)){
             return true;
          }
          else if(!isNullOrEmpty(haystack[i]) && !isNullOrEmpty(needle)){
            if(haystack[i].equals(needle))
              return true;
          }
       }
       return false;
    }

    public static void main(String[] args) {
        System.out.println(find("hello",  new String[]{"bye bye", "hello"}));
    }
 }