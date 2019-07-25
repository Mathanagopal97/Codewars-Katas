/*
The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:

Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
// should be 6: {4, -1, 2, 1}
Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.

Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
*/

public class MaxSubArraySum {
    public static int findSum(int[] arr,int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static int sequence(int[] arr) {
        if(arr.length<=0) return 0;
        int max = Integer.MIN_VALUE,count=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]<0) count++;
        }
        if(count==arr.length) return 0;
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              int sum = findSum(arr,i,j);
              if(max<=sum) max = sum;
          }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}