package JavaPractice;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {11,4,5,8,16,3,9};
        System.out.println(linearSearch(arr,8,0));
    }
    static int linearSearch(int[] arr,int target,int index) {
        if (index == arr.length) return -1;

        if (arr[index] == target) return index;

        return linearSearch(arr,target,index+1);
    }
}
