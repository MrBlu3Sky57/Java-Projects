import java.util.Scanner;
import java.util.Arrays; 

public class PracticeForBookWork {

    public static void MaxSubArraySumAlg1(int n, int[] array) {
        int best = 0;
        for (int a = 0; a<n; a++) {
            for (int b = a; b<n; b++) {
                int sum = 0;
                for (int k = a; k<=b; k++) {
                    sum+=array[k];
                }
                best = Math.max(best, sum);
            }
        }
        System.out.println(best);
    }

    public static void MaxSubArraySumAlg2(int n, int[] array) {
        int best = 0;
        for (int a = 0; a<n; a++) {
            int sum = 0;
            for (int b = a; b<n; b++) {
            sum+=array[b];
            }
            best = Math.max(best, sum);
        }
        System.out.println(best);
    }

    public static void MaxSubArraySumAlg3(int n, int[] array) {
        int best = 0, sum = 0;
        for (int k = 0; k<n; k++) {
            sum = Math.max(array[k], array[k] + sum);
            best = Math.max(sum, best);
        }
        System.out.println(best);
    }

    public static void bubbleSortAlg(int n, int[] array) {
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n-1; j++) {
                if (array[j]>array[j+1]) {
                    int x = array[j];
                    array[j] = array[j+1];
                    array[j+1] = x;
                }
            }
        }
    }

    public static void mergeSort1(int[] array, int n, int m, int l) {
        //Set indexes for Subarrays
        int n1 = m-l;
        int n2 = n - m;

        //Create subarrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        //Import the values of each respective Subarray
        for (int i = 0; i<n1; i++) {
            L[i] = array[l + i];
        }
        for (int j = 0; j<n2; j++) {
            R[j] = array[m + j];
        }

        int i = 0, j = 0, k = 0;

        //Merge the values of two subarrays into one sorted array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
    }

    public static void sort(int[] array, int n, int l) {
        if (n > l) {
            //Find middle of array
            int m = 1 + (n)/2;

            Arrays.sort(array, l, m);
            Arrays.sort(array, m, n);
            mergeSort1(array, n, m, l);
            printArray(array);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " ");
        System.out.println();
        
    }
    public static void main(String[] args) {
        int[] array = {1, 2, -2, 4, -3, 4, 3};
        int n = array.length;
        Scanner keyboard = new Scanner(System.in); 
        sort(array, n, 0);
    }
}
