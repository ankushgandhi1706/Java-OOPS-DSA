package JavaPractice;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9,11,13};
        System.out.println(binarySearchRecursion(arr,7,0,arr.length-1));
    }
    static int binarySearchRecursion (int[] arr,int target,int s,int e) {
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursion(arr,target,s,mid-1);
        }
        return binarySearchRecursion(arr,target,mid+1,e);
    }
}
