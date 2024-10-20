import java.util.*;

public class PeakElement {

    static int findPeak(int arr[]) {

        int n = arr.length;

        if (n == 1) {
            return arr[0]; // If the array contains only one element
        }

        int peak = arr[0]; // Initialize peak as the first element

        // Check if the first element is a peak
        if (arr[0] >= arr[1]) {
            peak = arr[0];
        }

        // Check for peak elements in the middle of the array
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                peak = Math.max(peak, arr[i]); // Update peak if current element is larger
            }
        }

        // Check if the last element is a peak
        if (arr[n - 1] >= arr[n - 2]) {
            peak = Math.max(peak, arr[n - 1]);
        }

        return peak;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 3, 4};

        PeakElement peak = new PeakElement();
        System.out.println("Peak Element: " + peak.findPeak(arr));
    }
}
