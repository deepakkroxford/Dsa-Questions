public class Wave_Array {
    public static void main(String[] args) {
        /*
         * Given a sorted array arr[] of distinct integers. Sort the array into a
         * wave-like array(In Place).
         * In other words, arrange the elements into a sequence such that arr[1] >=
         * arr[2] <= arr[3] >= arr[4] <= arr[5].....
         * 
         * If there are multiple solutions, find the lexicographically smallest one.
         * 
         * Note:The given array is sorted in ascending order, and you don't need to
         * return anything to make changes in the original array itself.
         * 
         * Input:
         * n = 5
         * arr[] = {1,2,3,4,5}
         * Output: 2 1 4 3 5
         * Explanation: Array elements after
         * sorting it in wave form are
         * 2 1 4 3 5.
         * 
         * Input:
         * n = 6
         * arr[] = {2,4,7,8,9,10}
         * Output: 4 2 8 7 10 9
         * Explanation: Array elements after
         * sorting it in wave form are
         * 4 2 8 7 10 9.
         */

        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        for(int i =0;i<n-1;i++)
        {
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
        

    }
}
