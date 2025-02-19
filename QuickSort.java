import java.util.*;

public class QuickSort{

    static void sort(int nums[], int low, int high){
        if(low >= high){                                                                 
            return; 
        }

        int start = low;
        int end = high;
        int middle = low + (high-low)/2;
        int pivot = nums[middle];

        while(start <= end ){

            while(nums[start] <pivot){
                start++;
            }
            while(nums[end] > pivot){
                end--;
            }

            if(start <= end){
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
            }
        }

        sort (nums, low, end);
        sort(nums, start, high);
    }

    public static void main(String[] args) {
        int[] nums= {5,4,3,2,1};

        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    } 
}