package com.company;
/*Runtime-2ms
Memory-44.2 ms
 */
public class Sorted_Array_II {
    public static void main(String[] args) {
        int ar[] = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
        System.out.println(search(ar, 2));
    }

    public static  boolean search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return true;
        }
        if (nums.length == 1 && nums[0] != target) {
            return false;
        }
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return false;
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            int ans = binarySearch(nums, target, 0, pivot - 1);
            if (ans != -1) {
                return true;
            } else {
                return false;
            }
        }
        int ans2 = binarySearch(nums, target, pivot + 1, nums.length - 1);
        if (ans2 != -1) {
            return true;
        }
        return false;

    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }


   static int binarySearch(int[] ar, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == ar[mid]) {
                return mid;
            } else if (target > ar[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}