package JavaPractice;

import java.util.Arrays;

public class SelecionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selection (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    private static int getMaxIndex(int[] arr,int start,int end) {
        int max = start;

        for(int i = 0;i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
