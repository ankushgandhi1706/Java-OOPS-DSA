package JavaPractice;

public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int target = 7;
        System.out.println(rotatedBinarySearch(arr,target));
    }
    static int rotatedBinarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (high - low) / 2 + low;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
